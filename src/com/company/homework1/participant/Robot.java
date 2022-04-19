package com.company.homework1.participant;

import com.company.homework1.Participant;

public class Robot implements Participant {

    private final String name;

    public Robot(String name) {
        this.name = name;
    }

    @Override
    public int run() {
        return 170;
    }

    @Override
    public int jump() {
        return 30;
    }


    @Override
    public String toString() {
        return "Robot{" +
                "name='" + name + '\'' +
                '}';
    }
}
