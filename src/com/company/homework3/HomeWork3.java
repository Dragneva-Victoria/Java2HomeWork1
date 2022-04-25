package com.company.homework3;

import java.util.HashMap;
import java.util.Map;

public class HomeWork3 {
    private static final String[] FRUITS = {
            "mango",
            "lemon",
            "lemon",
            "lemon",
            "apple",
            "peach",
            "peach",
            "plum",
            "banana",
            "banana",
            "banana",
            "banana",
            "melon",
            "orange",
            "orange",
            "orange",
            "lime"

    };

    public static void main(String[] args) {
        Map<String, Integer> repetitionWord = new HashMap<>();

        for (String word : FRUITS) {
            Integer repetition = repetitionWord.get(word);
            if (repetition == null){
                repetition = 0;
            }
            repetitionWord.put(word, repetition + 1);
        }

        for (Map.Entry<String, Integer> entry : repetitionWord.entrySet()) {
            System.out.printf("Слово %s встречается %d раз %n", entry.getKey(), entry.getValue());
            
        }
    }
}
