package com.lannstark.lec05

fun main() {
    validateScoreIsNotNegative(3);
    println(getPassOrFail(60));
    println(scoreRangeCheck(200));
    println(getGradeWithSwitch(30));
}

fun validateScoreIsNotNegative(score: Int) {
    if (score < 0)
        throw IllegalArgumentException("${score}는 0보다 작을 수 없습니다.");
    else println(score);
}

fun getPassOrFail(score: Int): String {
    return if (score >= 50) "P" else "F";
}

fun scoreRangeCheck(score: Int): Boolean {
    return if (score in 0..100) true else false;
}

fun getGradeWithSwitch(score: Int): String {
    return when (score / 10) {
        1 -> "A"
        2 -> "B"
        3 -> "C"
        else -> "D"
    }
}