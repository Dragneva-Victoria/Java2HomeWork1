package com.company.homework1.participant;

import com.company.homework1.Participant;

public class Cat implements Participant {

    private final String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public int run() {
        return 40;
    }

    @Override
    public int jump() {
        return 12;
    }


    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
