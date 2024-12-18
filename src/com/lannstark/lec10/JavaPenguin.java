package com.lannstark.lec10;

public class JavaPenguin extends JavaAnimal {

    private final int wingCount;

    public JavaPenguin(String species) {
        super(species, 2);
        this.wingCount = 2;
    }

    @Override
    public void move() {
        System.out.println("Penguin is moving");
    }

    @Override
    public int getLegCount() {
        return super.getLegCount() + this.wingCount;
    }
} // end of class
