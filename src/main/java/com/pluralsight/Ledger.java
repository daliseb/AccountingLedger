//package com.pluralsight;
//
//public class Ledger {
//    public void showLedgerScreen() {
//            //Ledger Screen
//            System.out.println("Welcome To The Ledger Screen");
//            System.out.println("Please select one of the following options:");
//            System.out.println("A. Display All Entries");
//            System.out.println("D. Display All Deposits");
//            System.out.println("P. Display Payments");
//            System.out.println("R. Run Reports");
//            System.out.println("H. Return To Home");
//
//            String choice = ConsoleHelper.promptForString("Enter Your Choice:");
//            choice = choice.toUpperCase();  //ensures answer will be in uppercase
//
//        switch (choice){
//            case "A":
//                System.out.println("You Have Selected: Display All Entries");
//                //addDeposit();
//                break;
//
//            case "D":
//                System.out.println("You Have Selected: Make A Payment");
//                //makePayment();
//                break;
//
//            case "R":
//                System.out.println("You Have Selected: View Ledger");
//                //viewLedger();
//                break;
//
//            case "H":
//                System.out.println("Exiting Program.....RETURNING TO MENU");
//                return;
//
//            default:
//                System.out.println("Invalid Entry! Please try again.");
//                break;
//        }
//            }
//    };
//


