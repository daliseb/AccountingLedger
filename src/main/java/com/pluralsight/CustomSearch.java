package com.pluralsight;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;

public class CustomSearch {

    // ===== ANSI COLORS =====
    public static final String RESET = "\u001B[0m";
    public static final String PINK = "\u001B[95m";
    public static final String YELLOW = "\u001B[93m";
    public static final String ORANGE = "\u001B[38;5;208m";

    public static ArrayList<Transactions> transactionsFromCSV = Main.transactionsFromCSV;

    public static void menu() {

        String mainMenu = PINK + """
                What do you want to do?
                 """ + YELLOW + """
                 1- Search By Vendor
                 2- Search By Description
                 3- Search By Amount
                 4- Search By Date
                 5- Quit the application
                """ + RESET;

        boolean menu = true;

        while (menu) {

            System.out.print(mainMenu);
            int command = ConsoleHelper.promptForInt(ORANGE + "Enter your command" + RESET);

            switch (command) {
                case 1:
                    vendorSearch();
                    break;
                case 2:
                    descriptionSearch();
                    break;
                case 3:
                    amountSearch();
                    break;
                case 4:
                    dateSearch();
                    break;
                case 5:
                    return;
                default:
                    System.out.println(PINK + "INVALID COMMAND!! Please select a valid option." + RESET);
                    break;
            }
        }
    }

    public static void vendorSearch() {
        String searchVendor = ConsoleHelper.promptForString(YELLOW + "Please Provide The Name:" + RESET);
        for (Transactions t : transactionsFromCSV) {
            if (t.getVendor().equalsIgnoreCase(searchVendor)) {
                System.out.println(t);
            }
        }
    }

    public static void descriptionSearch() {
        String searchDescription = ConsoleHelper.promptForString(YELLOW + "Please Provide The Description:" + RESET);
        for (Transactions t : transactionsFromCSV) {
            if (t.getDescription().toLowerCase().equals(searchDescription.toLowerCase())) {
                System.out.println(t);
            }
        }
    }

    public static void amountSearch() {
        String searchAmount = ConsoleHelper.promptForString(YELLOW + "Please Provide The Description:" + RESET);
        for (Transactions t : transactionsFromCSV) {
            if (t.getDescription().toLowerCase().equals(searchAmount.toLowerCase())) {
                System.out.println(t);
            }
        }
    }

    public static void dateSearch() {
        String input = ConsoleHelper.promptForString(
                ORANGE + "Enter date (YYYY-MM-DD): " + RESET
        ).trim();

        LocalDate searchDate;

        try {
            searchDate = LocalDate.parse(input);
        } catch (DateTimeParseException e) {
            System.out.println(PINK + "Invalid date format. Use YYYY-MM-DD." + RESET);
            return;
        }

        boolean found = false;

        for (Transactions t : transactionsFromCSV) {
            if (t.getDate().equals(searchDate)) {
                System.out.println(t);
                found = true;
            }
        }

        if (!found) {
            System.out.println(YELLOW + "No transactions found for that date." + RESET);
        }
    }

}
