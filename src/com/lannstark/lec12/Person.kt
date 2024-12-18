package com.lannstark.lec12

fun main() {
    Person.newBaby("BBUBBU");
    Singleton.a;
    moveSomething(object : Movable {
        override fun move() = println("move");
        override fun fly() = println("fly");
    });
}

class Person private constructor(var name: String, var age: Int) {

    // campanion object는 객체로 취급된다.
    companion object Factory : Log { //**
        private const val MIN_AGE = 1; // const val은 컴파일시점에 할당된다. 그냥 val은 런타임에 할당된다.

        @JvmStatic // Java파일에서 Person.newBaby로 호출 가능
        fun newBaby(name: String): Person = Person(name, MIN_AGE);
        override fun log() {
            println("나는 Person 클래스의 동행객체다.")
        }
    }
} // end of classs

object Singleton {
    var a: Int = 0;
}

private fun moveSomething(movable: Movable) {
    movable.move();
    movable.fly();
}