package com.lannstark.lec03

import com.lannstark.lec02.Person


fun main() {
    var person: Person = Person("Sodam", 29);
//    printAgeIfPerson(person);
   printAgeIfPerson(null);
}

fun printAgeIfPerson(obj: Any?) {
    var person = obj as? Person;
    println(person?.age);
}