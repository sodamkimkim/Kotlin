package com.lannstark.lec10

// `:` 로 상속, 인터페이스 구현
class Penguin(species: String) : Animal(species, 2), Swimable, Flyable {
    private val wingCount: Int = 2;

    override fun move() {
        println("penguin is moving");
    }

    // 자식에서 override 하려면 부모 필드에 open을 써줘야 한다.
    override val legCount: Int
        get() = super.legCount + this.wingCount;

    override fun act() {
        super<Swimable>.act()
        super<Flyable>.act()
    }

    // interface property override
    override val swimAbility: Int
        get() = super.swimAbility + 3;
}