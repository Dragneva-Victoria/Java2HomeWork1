package com.company.homework3;

import java.util.Set;

public class TestPhoneBook {
    public static void main(String[] args) {
        HomeWork3b homeWork3b = new HomeWork3b();

        homeWork3b.add("Ivanov", "069243771" );
        homeWork3b.add("Ivanov", "069243971" );
        homeWork3b.add("Ivanov", "069293771" );
        homeWork3b.add("Sidorov", "069553771" );
        homeWork3b.add("Petrov", "0692843771" );

        Set<String> surname = homeWork3b.surnames();
        for (String s : surname) {
            System.out.printf("У пользователя %s следующие номера телефона %s %n", s, homeWork3b.get(s));

        }
    }
}
