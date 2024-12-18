package com.lannstark.lec10

// 상위 클래스의 생성자를 바로 호출하여 상속받는다.
class Cat(species: String) : Animal(species, 4) {
    override fun move() {
        println("고양이가 냐오옹 is moving");
    }
}