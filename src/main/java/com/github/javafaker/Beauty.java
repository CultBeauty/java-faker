package com.github.javafaker;

import org.apache.commons.lang3.StringUtils;

public class Beauty {

    private final Faker faker;

    public Beauty(Faker faker) {
        this.faker = faker;
    }

    public String productName() {
        return StringUtils.join(
                new String[]{
                        faker.fakeValuesService().fetchString("beauty.product_name.adjective"),
                        faker.fakeValuesService().fetchString("beauty.product_name.adjective2"),
                        faker.fakeValuesService().fetchString("beauty.product_name.item")},
                " ");
    }
}
