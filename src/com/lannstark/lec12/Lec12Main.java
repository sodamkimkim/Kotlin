package com.lannstark.lec12;

public class Lec12Main {
    public static void main(String[] args) {
        //      Person.companion.newBaby("BBUBBU"); // 이름이 없는 companion object 호출
        //      Person.Factory.newBaby("BBUBBU"); // 이름이 있는 companion object 호출
        Person.newBaby("BBUBBU2"); // fun newBaby에 @JvmStatic 붙였다면 바로 호출 가능

        moveSomething(new Movable() {
            @Override
            public void move() {
                System.out.println("move");
            }

            @Override
            public void fly() {
                System.out.println("fly");
            }
        });
    }

    private static void moveSomething(Movable movable) {
        movable.move();
        movable.fly();
    }
}
