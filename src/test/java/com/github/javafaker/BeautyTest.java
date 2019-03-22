package com.github.javafaker;

import org.junit.Before;
import org.junit.Test;

import static com.github.javafaker.matchers.MatchesRegularExpression.matchesRegularExpression;
import static org.junit.Assert.*;

public class BeautyTest extends AbstractFakerTest {

    @Test
    public void productName() throws Exception {
        for (int i= 0; i<10; i++) {
            assertThat(faker.beauty().productName(), matchesRegularExpression("^([-\\w+\\s]){2,}\\w+$"));
        }
    }

}