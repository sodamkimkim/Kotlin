package com.lannstark.lec05

fun main() {
    validateScoreIsNotNegative(3);
    println(getPassOrFail(60));
}

fun validateScoreIsNotNegative(score: Int) {
    if (score < 0)
        throw IllegalArgumentException("${score}는 0보다 작을 수 없습니다.");
    else println(score);
}

fun getPassOrFail(score: Int): String {
    return if (score >= 50) "P" else "F";
}