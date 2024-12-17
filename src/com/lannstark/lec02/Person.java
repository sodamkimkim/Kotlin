package com.lannstark.lec02;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public class Person {
    public String name;
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @NotNull
    //@Nullable
    public String getName() {
        return name;
    }
}