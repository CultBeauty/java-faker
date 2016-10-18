package com.github.javafaker;

import org.junit.Before;
import org.junit.Test;

import static com.github.javafaker.matchers.MatchesRegularExpression.matchesRegularExpression;
import static org.junit.Assert.*;

public class BeautyTest extends AbstractFakerTest {

    @Before
    public void before() {
        faker = new Faker();
    }

    @Test
    public void productName() throws Exception {
        assertThat(faker.beauty().productName(), matchesRegularExpression("^\\w+\\s\\w+\\s\\w+$"));
    }

}