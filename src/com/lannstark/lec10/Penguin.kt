package com.lannstark.lec10

class Penguin(species: String) : Animal(species, 2) { // end of class
    private val wingCount: Int = 2;

    override fun move() {
        println("penguin is moving");
    }

    // 자식에서 override 하려면 부모 필드에 open을 써줘야 한다.
    override val legCount: Int
        get() = super.legCount + this.wingCount;

} // end of class