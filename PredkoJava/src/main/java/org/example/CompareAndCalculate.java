package org.example;

import java.util.Scanner;

public class CompareAndCalculate {
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_BLUE = "\u001b[34m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int а = 0;
        boolean validInput = false;
        while (!validInput) {
            System.out.print(ANSI_BLUE + "Введи целое число 'a': " + ANSI_RESET);
            String input = scanner.nextLine();
            try {
                а = Integer.parseInt(input.trim());
                validInput = true;
            } catch (NumberFormatException e) {
                System.out.println(ANSI_RED + "Некорректный ввод, нужно целое число 'a':" + ANSI_RESET);
            }
        }

        int b = 0;
        validInput = false;
        while (!validInput) {
            System.out.print(ANSI_BLUE + "Введи целое число 'b': " + ANSI_RESET);
            String input = scanner.nextLine();
            try {
                b = Integer.parseInt(input.trim());
                validInput = true;
            } catch (NumberFormatException e) {
                System.out.println(ANSI_RED + "Прикалываешься?? Нужно целое число 'b':" + ANSI_RESET);
            }
        }

        if (а > b) {
            System.out.println(ANSI_PURPLE + "a > b" + ANSI_RESET);
        } else if (а < b) {
            System.out.println(ANSI_PURPLE + "a < b" + ANSI_RESET);
        } else {
            System.out.println(ANSI_PURPLE + "a = b" + ANSI_RESET);
        }

        int sum = а + b;
        int diff = а - b;
        int product = а * b;

        System.out.println("A + B = " + sum);
        System.out.println("A - B = " + diff);
        System.out.println("A * B = " + product);

        if (b != 0) {
            double division = (double) а / b;
            System.out.println("A / B = " + division);
        } else {
            System.out.println(ANSI_RED + "На ноль поделить не получится;)" + ANSI_RESET);
        }

        scanner.close();
    }
}