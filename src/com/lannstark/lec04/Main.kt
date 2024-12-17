package com.lannstark.lec04

fun main() {
    val money1 = JavaMoney(2000L);
    val money2 = JavaMoney(2000L);

    if(money1 > money2)
        println("Money1이 Money2보다 금액이 큽니다.");
}