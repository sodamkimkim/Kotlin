package com.lannstark.lec01

import java.lang.IllegalArgumentException

fun main() {
    val person = Person("Sodam2");
    // Person의 getName()의 반환값이 Nullable인데
    // startsWithA의 매개변수가 NotNull이라 에러난다.
    println(startsWithA(person.getName()));
}

fun startsWithA(str: String): Boolean {
    return str.startsWith("A");
}

// null반환 x
fun startsWithA1(str: String?): Boolean {
//    if (str == null)
//        throw IllegalArgumentException("str is null");
//    return str.startsWith("A");
    return str?.startsWith("A") ?: throw IllegalArgumentException("str is null");
}

// null반환 o
fun startsWithA2(str: String?): Boolean? {
//    if (str == null)
//        return null; // null반환 o
//    return str.startsWith("A");
    return str?.startsWith("A");
}

// null이면 false반환
fun startsWithA3(str: String?): Boolean {
    return str?.startsWith("A") ?: false;
}

fun startsWithA4(str: String?): Boolean {
    return str!!.startsWith("A");
}