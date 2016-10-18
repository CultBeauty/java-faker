package com.github.javafaker;

public class Chemistry {
    private final Faker faker;

    public Chemistry(Faker faker) {
        this.faker = faker;
    }

    public String element() {
        return faker.fakeValuesService().fetchString("chemistry.elements");
    }
}
