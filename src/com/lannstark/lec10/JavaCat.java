package com.lannstark.lec10;

public class JavaCat extends JavaAnimal {
    public JavaCat(String species) {
        super(species, 4);
    }

    @Override
    public void move() {
        System.out.println("고양이가 냐옹 is moving");
    }
} // end of class
