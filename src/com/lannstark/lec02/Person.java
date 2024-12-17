package com.lannstark.lec02;

import org.jetbrains.annotations.NotNull;

public class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

        @NotNull
    //@Nullable
    public String getName() {
        return name;
    }
}