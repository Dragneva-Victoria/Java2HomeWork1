package com.company.homework1.participant;

import com.company.homework1.Participant;

public class Human implements Participant {

    private final String name;

    public Human(String name) {
        this.name = name;
    }

    @Override
    public int run() {
        return 150;
    }

    @Override
    public int jump() {
        return 5;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                '}';
    }
}