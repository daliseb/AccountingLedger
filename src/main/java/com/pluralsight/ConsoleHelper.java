package com.pluralsight;
import java.util.Scanner;

public class ConsoleHelper {
    private static Scanner scanner = new Scanner(System.in);
    public static String promptForString(String prompt){
        System.out.println(prompt);
        return scanner.nextLine();
    }

    public static double promptForDouble(String prompt) {
        System.out.println(prompt);
        while (!scanner.hasNextDouble()) {
            System.out.println("Invalid input");
            scanner.next(); // discard invalid input
            System.out.println(prompt);
        }
        return scanner.nextDouble();
    }

}




