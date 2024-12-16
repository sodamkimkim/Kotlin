package com.lannstark.lec01

class Person(name: String) {
   private var name = name;

    // # 생성자 사용
/*  constructor(name: String)
    {
        this.name = name;
    }*/

    fun  GetName() : String
    {
        return this.name;
    }
}