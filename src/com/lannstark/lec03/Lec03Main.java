package com.lannstark.lec03;

import com.lannstark.lec02.Person;

public class Lec03Main {
    public static void main(String[] args) {

    }
    public static void printAgeIfPerson(Object obj)
    {
        if(obj instanceof Person)
        {
            Person person  = (Person)obj;
            System.out.println(person.getName( ));
        }
    }
} // end of class
