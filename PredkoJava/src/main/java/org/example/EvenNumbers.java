package org.example;

public class EvenNumbers {
    public static final String ANSI_BLUE = "\u001b[34m";

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        StringBuilder evenNumbers = new StringBuilder();

        for (int number : numbers) {
            if (number % 2 == 0) {
                evenNumbers.append(number).append(" ");
            }
        }

        System.out.print(ANSI_BLUE + "Чётные числа из массива: " + evenNumbers.toString().trim());
    }
}