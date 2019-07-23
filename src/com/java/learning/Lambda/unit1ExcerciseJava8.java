package com.java.learning.Lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class unit1ExcerciseJava8 {

    public static void main(String[] args){
        List<Person> people = Arrays.asList(
                new Person("Charles","Dickens",31),
                new Person("Lewis","Caroll",32),
                new Person("Thomas","Carlyle",33),
                new Person("Charlotte","Brante",34),
                new Person("Thomas","Arnold",35)
        );

        System.out.println("Print all the Person sorted by last name");
        Collections.sort(people, (p1,p2) -> p1.getLastName().compareTo(p2.getLastName()));
        //Step 1: sort liat by last name
        //step 2: create a method that prints all the elements in the list
        //step 2: create a method that prints all people with last name beginging with C
    }

    private static void printCon
}
