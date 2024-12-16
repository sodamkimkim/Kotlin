package com.lannstark.lec01;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

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