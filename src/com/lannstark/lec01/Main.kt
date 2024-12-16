package com.lannstark.lec01

fun main() {
    // println(startsWithA1(null));
    println(startsWithA2(null));
}

// null반환 x
fun startsWithA1(str: String?): Boolean {
    if (str == null) {
        throw  IllegalArgumentException ("str is null");
    }
    return str.startsWith("A");
}

// null반환 o
fun startsWithA2(str: String?): Boolean? {
    if (str == null)
        return null; // null반환 o
    return str.startsWith("A");
}

fun startsWith3(str: String?): Boolean {
    if (str == null)
        return false;
    return str.startsWith("A");
}