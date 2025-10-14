package com.pluralsight;
import java.util.Scanner;

public class ConsoleHelper {
    private static Scanner scanner = new Scanner(System.in);
    public static String promptForString(String prompt){
        System.out.println(prompt);
        return scanner.nextLine();
    }

    public static int promptForInt(String prompt){


        boolean isValid = false;
        int result = 0;
        do{
            try{
                System.out.println(prompt);
                result = scanner.nextInt();
                scanner.nextLine();
                isValid = true;
            }
            catch(Exception ex){
                scanner.nextLine();
                System.out.println("Invalid Entry, please enter a letter");
                //ex.printStackTrace();
            }
        } while (!isValid);


        return result;

    }


    public static int promptForIntAlt(String prompt){

        int result = 0 ;

        try{
            System.out.println(prompt);
            result = scanner.nextInt();
            scanner.nextLine();
        }
        catch(Exception ex){
            scanner.nextLine();
            System.out.println("Invalid Entry, please enter a letter");
        }

        return result;

    }

    public static float promptForFloat(String prompt){
        System.out.println(prompt);
        float result = scanner.nextFloat();
        scanner.nextLine();
        return result;
    }

    public static long promptForLong(String prompt){
        System.out.println(prompt);
        long result = scanner.nextLong();
        scanner.nextLine();
        return result;

    }

    public static double promptForDouble(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        while (!scanner.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a number.");
            scanner.next(); // discard invalid input
            System.out.print(prompt);
        }
        return scanner.nextDouble();
    }

}




