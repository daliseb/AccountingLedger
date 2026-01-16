package com.pluralsight;

import com.pluralsight.ConsoleHelper;

public class CustomSearch {

    public static void main(String[] args) {

        String mainMenu = """
                What do you want to do?
                 1- Search By Vendor
                 2- Search By Description
                 3- Search By Amount
                 4- Search By Date
                 5- Quit the application
                """;

        boolean menu = true;

        while (menu) {

            System.out.print(mainMenu);
            int command = ConsoleHelper.promptForInt("Enter your command");

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
                    System.out.println("INVALID COMMAND!! Please select a valid option.");
                    break;
            }
        }
    }

    public static void vendorSearch() {}

    public static void descriptionSearch() {}

    public static void amountSearch() {}

    public static void dateSearch() {}
}
