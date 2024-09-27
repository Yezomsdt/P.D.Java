package org.example;

import java.util.Scanner;

public class StringComparison {
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001b[32m";
    public static final String ANSI_BLUE = "\u001b[34m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(ANSI_BLUE + "Введи первую строку: " + ANSI_RESET);
        String a = scanner.nextLine();

        System.out.print(ANSI_BLUE + "Введи вторую строку: " + ANSI_RESET);
        String b = scanner.nextLine();

        if (a.equals(b)) {
            System.out.println(ANSI_GREEN + "Строки идентичны" + ANSI_RESET);
        } else {
            System.out.println(ANSI_RED + "Строки неидентичны" + ANSI_RESET);
        }

        scanner.close();
    }
}