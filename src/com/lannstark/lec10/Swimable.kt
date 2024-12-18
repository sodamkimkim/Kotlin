package com.lannstark.lec10

interface Swimable {
    val swimAbility: Int
        get() = 0;

    fun act() {
        println("어푸어푸");
    }
}