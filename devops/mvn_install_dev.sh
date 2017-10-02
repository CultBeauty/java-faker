#!/bin/bash

# The current directory we're in
DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"

docker run --name faker-build --rm=true -i \
    -e _JAVA_OPTIONS="-Duser.timezone=Europe/London" \
    -v $DIR/..:/srv \
    -v /var/lib/dev_cache/ivy2:/root/.ivy2 \
    -v /var/lib/dev_cache/m2:/root/.m2 \
    -v /var/lib/dev_cache/sbt:/root/.sbt \
    -w /srv \
    docker.cultbeauty.org/cultbeauty/scala:8u144-2.12.3 \
    mvn install
