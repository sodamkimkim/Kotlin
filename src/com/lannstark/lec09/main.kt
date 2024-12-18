package com.lannstark.lec09

fun main() {
    val person = Person();
    println(person.toString());
}

class Person(private val name: String, private var age: Int) { // end of class
    init {
        if (age <= 0)
            throw IllegalArgumentException("나이는 ${age}일 수 없습니다.");
        println("주생성자");
    }

    public fun getAge(): Int {
        return age; }

    override fun toString(): String {
        return "Person(name='$name', age=$age)"
    }

    constructor(name: String) : this(name, 1) {
        println("첫번째 부생성자");
    }

    constructor() : this("홍길동") {
        println("두번째 부생성자");
    };
} // end of class