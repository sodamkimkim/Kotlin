package com.lannstark.lec09

fun main() {
    val person = Person();
    println(person.toString());
}

class Person(name: String = "홍길동", age: Int = 10) { // end of class
    var name = name
        get() = field.uppercase(); // backing field
        set(value) {
            field = value.uppercase();
        }
    fun getUppercaseName(): String = this.name.uppercase(); // backing field 대신 this.name 사용

    var age = age;

    init {
        if (age <= 0)
            throw IllegalArgumentException("나이는 ${age}일 수 없습니다.");
        println("주생성자");
    }

    // 함수로 만들기
    fun isAdult(): Boolean {
        return this.age >= 20;
    }

    // 프로퍼티처럼 만들기 (Custom Getter)
    val isAdult: Boolean
        get() = this.age > 20;

} // end of class