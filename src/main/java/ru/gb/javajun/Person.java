package ru.gb.javajun;

import ru.gb.javajun.lib.Random;
import ru.gb.javajun.lib.RandomDate;


import java.util.Date;

public class Person {

        private String name;


        @RandomDate
        private Date data;

        @Random
        private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", data=" + data +
                ", age=" + age +
                '}';
    }
}
