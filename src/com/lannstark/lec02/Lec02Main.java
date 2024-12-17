package com.lannstark.lec02;

public class Lec02Main {

    public static void main(String[] args) {
        System.out.println(startsWithA1("str"));
        System.out.println(startsWithA2(null));
        System.out.println(startsWithA3("ABCED"));
    }

    // # boolean : null x
    public static boolean startsWithA1(String str) {
        if (str == null)
            throw new IllegalArgumentException("str is null");
        return str.startsWith("A");
    }

    // # Boolean : nullable
    public static Boolean startsWithA2(String str) {
        if (str == null)
            return null; // ok
        return str.startsWith("A");
    }

    public static boolean startsWithA3(String str) {
        if (str == null)
            return false;
        return str.startsWith("A");
    }
} // end of main
