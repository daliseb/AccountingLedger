package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;


//needed to import array list


public class Main {
    public static void main(String[] args) {
       Ledger ledger = new Ledger();
        showMainMenu();
        //Home Screen
//we need to read the csv file, add file reader?
    }
    public static void showMainMenu(){

        //THIS IS THE HOME SCREEN
        System.out.println("----✿✿✿ Welcome to Dalis' Smoothie Shop Ledger! ✿✿✿----");
        System.out.println("Please select one of the following options:");
        System.out.println("D. Add Deposit");
        System.out.println("P. Make A Payment");
        System.out.println("L. View Ledger");
        System.out.println("X. Exit");

        String choice = ConsoleHelper.promptForString("Enter Your Choice:");
        choice = choice.toUpperCase();  //ensures answer will be in uppercase

        //add switch, SWITCH/CASE FOR HOME SCREEN OPTIONS from w3 schools
        switch (choice){
            case "D":
                System.out.println("You Have Selected: Add Deposit");
                addDeposit();
                break;

            case "P":
                System.out.println("You Have Selected: Make A Payment");
                makePayment();
                break;

            case "L":
                System.out.println("You Have Selected: View Ledger");
                showLedgerScreen();
                break;

            case "X":
                System.out.println("Exiting Program.....RETURNING TO MENU");
                showMainMenu();
                return;

            default:
                System.out.println("Invalid Entry! Please try again ˙◠˙");
                showMainMenu();
                break;
        }

    }
    //HOME MENU OPTIONS
    public static void addDeposit() {
        System.out.println("----₊ ⊹ Add Deposit ₊ ⊹----");
        String description = ConsoleHelper.promptForString("Enter description: ");
        double amount = ConsoleHelper.promptForDouble("Enter Deposit amount: ");
        String vendor = ConsoleHelper.promptForString("Enter Vendor Name:");
        String dateTime = thisDateTime();
        //needed to add prompt for double in console helper^

        System.out.println("Deposit added: " + description + " | Amount: $" + amount + "\n");
        String depositText = dateTime + "|" + description + "|" + vendor + "|" + amount + "\n";
        convertToCSV(depositText);
        showMainMenu();
    }

    public static void makePayment() {
        System.out.println("----₊ ⊹ Make Payment ₊ ⊹----");
        String description = ConsoleHelper.promptForString("Enter description: ");
        double amount = ConsoleHelper.promptForDouble("Enter Payment amount: ");
        String vendor = ConsoleHelper.promptForString("Enter Vendor Name:");
        String dateTime = thisDateTime();

        System.out.println("Payment added: " + description + " | Amount: $" + amount);
        String depositText = dateTime + "|" + description + "|" + vendor + "|" + amount + "\n";
        convertToCSV(depositText);
        showMainMenu();

    }


    public static void showLedgerScreen() {
        ArrayList<Transactions> transactionsFromCSV = getTransactions();

        while(true) {
            //THIS IS THE LEDGER SCREEN
            System.out.println("----✰✰✰ Welcome To The Ledger Screen ✰✰✰----");
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
                    System.out.println("Exiting Program.....RETURNING TO HOME SCREEN");
                    showMainMenu();
                    return;

                default:
                    System.out.println("Invalid Entry! Please try again ˙◠˙");
                    showMainMenu();
                    break;
            }
        }
    }
    //LEDGER MENU OPTIONS
        public static void displayEntries(ArrayList<Transactions> transactionsFromCSV){  //go back and finish the method to pull my csv file
            System.out.println("----₊ ⊹ Displaying Entries ₊ ⊹---");
            String dateTime = thisDateTime();
            System.out.println("Report Was Displayed On"+ " " + dateTime);
            //for loop goes here, it will go through transactions from csv and print each line as a string


        }

        public static void displayDeposits(){
            System.out.println("----₊ ⊹ Displaying Deposits Only ₊ ⊹----");
            String dateTime = thisDateTime();
            System.out.println("Report Was Displayed On"+ " " + dateTime);



        }

        public static void displayPayments(){
            System.out.println("----₊ ⊹ Displaying Payments Only ₊ ⊹----");
            String dateTime = thisDateTime();
            System.out.println("Report Was Displayed On"+ " " + dateTime);


        }

    public static void showReportsScreen() {
        while(true) {
            //THIS IS THE REPORTS SCREEN
            System.out.println("----✰✰✰ Welcome To The Reports Screen ✰✰✰----");
            System.out.println("Please select one of the following options:");
            System.out.println("A. Month To Date");
            System.out.println("B. Previous Month");
            System.out.println("C. Year To Date");
            System.out.println("D. Previous Year");
            System.out.println("E. Search By Vendor");
            System.out.println("X. Go Back");  //to ledger screen

            String choice = ConsoleHelper.promptForString("Enter Your Choice");
            choice = choice.toUpperCase();  //ensures answer will be in uppercase


        }
    }






            // Method to read transactions from the file pg 13 in 3a
    public static ArrayList<Transactions> getTransactions() {
        ArrayList<Transactions> transactions = new ArrayList<>();

        try {
            FileReader fileReader = new FileReader("transactions.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String input;
            while ((input = bufferedReader.readLine()) != null) {
                System.out.println(input);
                //2023-02-14|09:12:45|Initial business deposit|Bank of America|5000.00
                //public Transactions(LocalDate date, LocalTime time, String description, String vendor, Double amount)
                String[] transactionString = input.split("\\|");
                Transactions transaction = new Transactions(LocalDate.parse(transactionString[0]), LocalTime.parse(transactionString[1]), transactionString[2], transactionString[3], Double.parseDouble(transactionString[4]));

                transactions.add(transaction);

            }

            bufferedReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        return transactions;
    }



    //method for adding/formatting time
    public static String thisDateTime(){
        LocalDate thisDate = LocalDate.now();
        LocalTime thisTime = LocalTime.now();

        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");

        String date = thisDate.format(dateFormatter);
        String time = thisTime.format(timeFormatter);
        return date + "|" + time;
    }




    //file writer to add to csv found on pg.21 in 3a
    public static void convertToCSV(String csvText) {
        try {
            FileWriter writer = new FileWriter("transactions.csv", true);

            writer.write(csvText);
            writer.close();

        }
        catch (IOException e){
            System.out.println("error ˙◠˙");
            e.printStackTrace();
        }


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









