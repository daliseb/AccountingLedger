package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;    //needed to import array list


public class Main {
    public static void main(String[] args) {
       Ledger ledger = new Ledger();
        //Home Screen
        System.out.println("----- Welcome to Dalis' Smoothie Shop Ledger! -----");
        System.out.println("Please select one of the following options:");
        System.out.println("D. Add Deposit");
        System.out.println("P. Make A Payment");
        System.out.println("L. View Ledger");
        System.out.println("X. Exit");

        String choice = ConsoleHelper.promptForString("Enter Your Choice:");
        choice = choice.toUpperCase();  //ensures answer will be in uppercase

        //add switch
        switch (choice){
            case "D":
                System.out.println("You Have Selected: Add Deposit");
                addDeposit();
                break;

            case "P":
                System.out.println("You Have Selected: Make A Payment");
                //makePayment();
                break;

            case "L":
                System.out.println("You Have Selected: View Ledger");
                showLedgerScreen();
                break;

            case "X":
                System.out.println("Exiting Program.....RETURNING TO MENU");
                return;

            default:
                System.out.println("Invalid Entry! Please try again.");
                break;
        }
//add method
//we need to read the csv file, add file reader?
    }

    public static void addDeposit() {
        System.out.println("---- Add Deposit ----");
        String description = ConsoleHelper.promptForString("Enter description: ");
        double amount = ConsoleHelper.promptForDouble("Enter deposit amount: ");
        //needed to add prompt for double in console helper^

        System.out.println("Deposit added: " + description + " | Amount: $" + amount);
    }

    public static void showLedgerScreen() {
        while(true) {
            //Ledger Screen
            System.out.println("Welcome To The Ledger Screen");
            System.out.println("Please select one of the following options:");
            System.out.println("A. Display All Entries");
            System.out.println("D. Display All Deposits");
            System.out.println("P. Display Payments");
            System.out.println("R. Run Reports");
            System.out.println("H. Return To Home");

            String choice = ConsoleHelper.promptForString("Enter Your Choice");
            choice = choice.toUpperCase();  //ensures answer will be in uppercase

            switch (choice) {
                case "A":
                    System.out.println("You Have Selected: Display All Entries");
                    //addDeposit();
                    break;

                case "D":
                    System.out.println("You Have Selected: Display All Deposits");
                    //makePayment();
                    break;

                case "P":
                    System.out.println("You Have Selected: Display Payments");
                    //viewLedger();
                    break;

                case "R":
                    System.out.println("You Have Selected: Run Reports");
                    //viewLedger();
                    break;

                case "H":
                    System.out.println("Exiting Program.....RETURNING TO HOME SCREEN");
                    return;

                default:
                    System.out.println("Invalid Entry! Please try again.");
                    break;
            }
        }
    }

    // Method to read transactions from the file
    public static ArrayList<Transactions> getTransactions() {
        ArrayList<Transactions> transactions = new ArrayList<>();

        try {
            FileReader fileReader = new FileReader("transactions.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String input;
            while ((input = bufferedReader.readLine()) != null) {
                System.out.println(input);
                // add parser?
            }

            bufferedReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        return transactions;
    }


//        //System.out.println(transactions.get(i).getTransactions);     //load files from csv
//
//        //for (int i = 0; i < transactions.size(); i++) {
//            //Transactions t = transactions.get(i);
//            System.out.println(t.getTransactions());
//
//            System.out.println(t);
//        }
}









