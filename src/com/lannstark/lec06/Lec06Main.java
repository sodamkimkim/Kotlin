package com.lannstark.lec06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lec06Main {
    public static void main(String[] args) {
        List<Long> numbers = Arrays.asList(1L, 2L, 3L);
        List<Long> numbers2 = new ArrayList<>();
        for (long number : numbers)
            System.out.println(number);
    }
} // end of class