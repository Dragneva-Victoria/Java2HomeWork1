package com.company.homework2;

public class HomeWork2 {


    private static final String[][] ARRAY_CHECK = new String[][]{
            {"1", "2", "3", "4"},
            {"5", "6", "7", "8"},
            {"9", "10", "11", "12"},
            {"13", "14", "15", "16"}
    };


    public static void main(String[] args) {
        try {
            int sum = sumArray(ARRAY_CHECK);
            System.out.println(sum);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }
    }

    private static int sumArray(String[][] array) {
        int sum = 0;
        if (checkArraySize(array)) {
            for (int i = 0; i < array.length; i++) {
                String[] row = array[i];
                for (int j = 0; j < row.length; j++) {
                    String value = row[j];
                    try {
                        sum += Integer.parseInt(value);
                    } catch (NumberFormatException e) {
                        throw new MyArrayDataException(i, j);
                    }
                }
            }
        }
        return sum;
    }

    private static boolean checkArraySize(String[][] array) {
        if (array.length != 4) {
            throw new MyArraySizeException();
        }

        for (String[] row : array) {
            if (row.length != 4) {
                throw new MyArraySizeException();
            }
        }

        return true;
    }
}
