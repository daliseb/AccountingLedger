package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Main {
    public static void main(String[] args) {
        System.out.println("Please select one of the following options:");

        for (int i = 0; i < transactions.size(); i ++) {
            Transactions t = transactions.get(i);
            System.out.println(t.getTransactions());

            System.out.println(transactions.get(i).getTransactions);
        }
        //ArrayList<Transactions> transactions = getTransactions();
//we need to read the csv file, add filereader?

    }
        void getTransactions();
    //public static void getTransactions(){
        try{
            FileReader fileReader = new FileReader("transactions.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String input;

            while((input = bufferedReader.readLine())!= null) {
                System.out.println(input);

            }
            bufferedReader.close();

        }catch(IOException e) {
            e.printStackTrace();
        }
    }








