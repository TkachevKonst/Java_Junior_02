package ru.gb.javajun;

import ru.gb.javajun.lib.ObjectCreator;

public class Program {
    public static void main(String[] args) {
        Person person = ObjectCreator.createObj(Person.class);
        Person person1 = ObjectCreator.createObj(Person.class);
        Person person2 = ObjectCreator.createObj(Person.class);
        System.out.println(person);
        System.out.println(person1);
        System.out.println(person2);
    }



}
