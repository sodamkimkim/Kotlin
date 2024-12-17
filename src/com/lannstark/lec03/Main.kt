package com.lannstark.lec03

class Main {
    var number1: Int? = 3;
    var number2: Long = number1?.toLong() ?: 0L;
}