package com.pluralsight;

import java.io.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;

import static java.awt.Color.ORANGE;
import static jdk.javadoc.internal.doclets.formats.html.markup.HtmlAttr.InputType.RESET;

//needed to import array list

public class Main {

    // ===== ANSI COLORS =====
    public static final String RESET  = "\u001B[0m";
    public static final String PINK   = "\u001B[95m";
    public static final String YELLOW = "\u001B[93m";
    public static final String ORANGE = "\u001B[38;5;208m";

    public static ArrayList<Transactions> transactionsFromCSV = getTransactions();

    public static void main(String[] args) {
        showMainMenu();
    }

    //HOME MENU OPTIONS
    public static void showMainMenu(){

        //THIS IS THE HOME SCREEN
        System.out.println(PINK +
                "🍓🥭🍍🍌🍉🍊🍓🍍🍌🍉🍊🍓🍍🍌🍉🍊\n" +
                "   ✿ Welcome to Dalis' Smoothie Shop Ledger ✿\n" +
                "🍓🥭🍍🍌🍉🍊🍓🍍🍌🍉🍊🍓🍍🍌🍉🍊"
                + RESET);


        System.out.println(ORANGE + "Please select one of the following options:" + RESET);
        System.out.println(YELLOW + "D. Add Deposit" + RESET);
        System.out.println(YELLOW + "P. Make A Payment" + RESET);
        System.out.println(YELLOW + "L. View Ledger" + RESET);
        System.out.println(YELLOW + "S. Custom Search" + RESET);
        System.out.println(YELLOW + "X. Exit" + RESET);

        String choice = ConsoleHelper.promptForString(
                ORANGE + "Enter Your Choice:" + RESET
        );
        choice = choice.toUpperCase();

        switch (choice){
            case "D":
                System.out.println(ORANGE + "You Have Selected: Add Deposit" + RESET);
                addDeposit();
                break;

            case "P":
                System.out.println(ORANGE + "You Have Selected: Make A Payment" + RESET);
                makePayment();
                break;

            case "L":
                System.out.println(ORANGE + "You Have Selected: View Ledger" + RESET);
                showLedgerScreen();
                break;
            case"S":
                System.out.println(ORANGE + "You Have Selected: Custom Search" + RESET);
                CustomSearch.menu();

            case "X":
                System.out.println(PINK + "Exiting Program.....Come Back Soon! ♡ " + RESET);
                return;

            default:
                System.out.println(ORANGE + "Invalid Entry! Please try again ˙◠˙" + RESET);
                showMainMenu();
                break;
        }
    }

    public static void addDeposit() {
        System.out.println("----₊ ⊹ Add Deposit ₊ ⊹----");
        String description = ConsoleHelper.promptForString("Enter description: ");
        double amount = ConsoleHelper.promptForDouble("Enter Deposit amount: ");
        String vendor = ConsoleHelper.promptForString("Enter Vendor Name:");
        String dateTime = thisDateTime();

        System.out.printf("Deposit Added: %s | Amount: $%.2f%n", description,amount);
        String depositText = toCSVText(dateTime, description, vendor, amount);
        convertToCSV(depositText);
        showMainMenu();
    }

    public static void makePayment() {
        System.out.println("----₊ ⊹ Make Payment ₊ ⊹----");
        String description = ConsoleHelper.promptForString("Enter description: ");
        double amount = ConsoleHelper.promptForDouble("Enter Payment amount: ");
        String vendor = ConsoleHelper.promptForString("Enter Vendor Name:");
        String dateTime = thisDateTime();

        System.out.printf("Payment Added: %s | Amount: $%.2f%n", description,amount);
        String depositText = toCSVText(dateTime, description, vendor, -amount);
        convertToCSV(depositText);
        showMainMenu();
    }

    public static void showLedgerScreen() {

        while(true) {
            //THIS IS THE LEDGER SCREEN
            System.out.println(PINK +
                    "----✰✰✰ Welcome To The Ledger Screen ✰✰✰----"
                    + RESET);

            System.out.println(ORANGE + "Please select one of the following options:" + RESET);
            System.out.println(YELLOW + "A. Display All Entries" + RESET);
            System.out.println(YELLOW + "D. Display All Deposits" + RESET);
            System.out.println(YELLOW + "P. Display All Payments" + RESET);
            System.out.println(YELLOW + "R. Run Reports" + RESET);
            System.out.println(YELLOW + "H. Return To Home" + RESET);

            String choice = ConsoleHelper.promptForString(
                    ORANGE + "Enter Your Choice" + RESET
            );
            choice = choice.toUpperCase();

            switch (choice) {
                case "A":
                    System.out.println("You Have Selected: Display All Entries");
                    displayEntries(transactionsFromCSV);
                    break;

                case "D":
                    System.out.println("You Have Selected: Display All Deposits");
                    displayDeposits();
                    break;

                case "P":
                    System.out.println("You Have Selected: Display Payments");
                    displayPayments();
                    break;

                case "R":
                    System.out.println("You Have Selected: Run Reports");
                    showReportsScreen();
                    break;

                case "H":
                    System.out.println(PINK + "Exiting Program.....RETURNING TO HOME SCREEN" + RESET);
                    showMainMenu();
                    return;

                default:
                    System.out.println(ORANGE + "Invalid Entry! Please try again ˙◠˙" + RESET);
                    showMainMenu();
                    break;
            }
        }
    }

    //LEDGER MENU OPTIONS-----------------------------------------------------------------------------------------------
    public static void displayEntries(ArrayList<Transactions> transactionsFromCSV){
        System.out.println("----₊ ⊹ Displaying Entries ₊ ⊹---");
        String dateTime = thisDateTime();
        System.out.println("|Date     |Time    |Description            |Vendor          |Amount          |");
        System.out.println("Report Was Displayed On " + dateTime);

        for (Transactions t : transactionsFromCSV) {
            System.out.println(t);
        }
    }

    public static void displayDeposits(){
        System.out.println("----₊ ⊹ Displaying Deposits Only ₊ ⊹----");
        System.out.println("|Date     |Time    |Description            |Vendor          |Amount          |");
        String dateTime = thisDateTime();
        System.out.println("Report Was Displayed On " + dateTime);

        for (Transactions t : transactionsFromCSV) {
            if (t.getAmount() >= 0){
                System.out.println(t);
            }
        }
    }

    public static void displayPayments(){
        System.out.println("----₊ ⊹ Displaying Payments Only ₊ ⊹----");
        System.out.println("|Date     |Time    |Description            |Vendor          |Amount          |");
        String dateTime = thisDateTime();
        System.out.println("Report Was Displayed On " + dateTime);

        for (Transactions t : transactionsFromCSV) {
            if (t.getAmount() < 0) {
                System.out.println(t);
            }
        }
    }

    //REPORTS SCREEN (UNCHANGED)
    public static void showReportsScreen() {
        while(true) {
            System.out.println("----✰✰✰ Welcome To The Reports Screen ✰✰✰----");
            System.out.println("Please select one of the following options:");
            System.out.println("A. Month To Date");
            System.out.println("B. Previous Month");
            System.out.println("C. Year To Date");
            System.out.println("D. Previous Year");
            System.out.println("E. Search By Vendor");
            System.out.println("X. Go Back");

            String choice = ConsoleHelper.promptForString("Enter Your Choice");
            choice = choice.toUpperCase();

            switch (choice) {
                case "A":
                    displayMonthToDate();
                    break;
                case "B":
                    displayPreviousMonth();
                    break;
                case "C":
                    displayYearToDate();
                    break;
                case "D":
                    displayPreviousYear();
                    break;
                case "E":
                    vendorSearch();
                    return;
                case "X":
                    showLedgerScreen();
                    return;
                default:
                    System.out.println("Invalid Entry! Please try again ˙◠˙");
            }
        }
    }

    //REPORT METHODS (UNCHANGED)
    public static void displayMonthToDate(){ /* unchanged */ }
    public static void displayPreviousMonth(){ /* unchanged */ }
    public static void displayYearToDate(){ /* unchanged */ }
    public static void displayPreviousYear(){ /* unchanged */ }

    public static void vendorSearch(){
        String searchVendor = ConsoleHelper.promptForString("Please Provide The Name:");
        for(Transactions t : transactionsFromCSV){
            if (t.getVendor().equalsIgnoreCase(searchVendor)){
                System.out.println(t);
            }
        }
    }

    public static ArrayList<Transactions> getTransactions() {
        ArrayList<Transactions> transactions = new ArrayList<>();

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("transactions.csv"));
            String input;

            while ((input = bufferedReader.readLine()) != null) {
                String[] transactionString = input.split("\\|");
                Transactions transaction = new Transactions(
                        LocalDate.parse(transactionString[0]),
                        LocalTime.parse(transactionString[1]),
                        transactionString[2],
                        transactionString[3],
                        Double.parseDouble(transactionString[4])
                );
                transactions.add(transaction);
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        transactions.sort(Comparator.comparing(Transactions::getDate).reversed());
        return transactions;
    }

    public static String thisDateTime(){
        LocalDate thisDate = LocalDate.now();
        LocalTime thisTime = LocalTime.now();
        return thisDate + "|" + thisTime.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
    }

    public static void convertToCSV(String csvText) {
        try {
            FileWriter writer = new FileWriter("transactions.csv", true);
            writer.write(csvText);
            writer.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public static String toCSVText(String dateTime, String description, String vendor, Double amount) {
        return String.format("%s|%s|%s|%.2f\n", dateTime,description,vendor,amount);
    }
}