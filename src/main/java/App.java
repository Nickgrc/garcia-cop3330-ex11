import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Nickolas Garcia
 */

//Write a program that converts currency. Specifically, convert euros to U.S. dollars. Prompt for the amount of money in euros you have, and prompt for the current exchange rate of the euro. Print out the new amount in U.S. dollars.
//
//The formula for currency conversion is derived from
//
//c_to / c_frame = rate
//where
//
//c_to is the amount in U.S. dollars.
//c_from is the amount in euros.
//rate is the per-unit current exchange rate from c_from to c_to.
//Example Output
//How many euros are you exchanging? 81
//What is the exchange rate? 1.3751
//81 euros at an exchange rate of 1.3751 is
//111.38 U.S. dollars.
//Constraints
//Ensure that fractions of a cent are rounded up to the next penny.
//Use a single output statement.


public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("How many euros are you exchanging? ");
        String euros = in.nextLine();

        System.out.print("What is the exchange rate? ");
        String exchange = in.nextLine();

        int a = Integer.parseInt(euros);
        double b = Double.parseDouble(exchange);
        double ex = a * b;

        //rounding to penny
        String s = String.format("%.2f", ex);

        //single output line
        System.out.print(euros + " euros at an exchange rate of " + exchange + " is " + "\n" + s +
                " U.S. dollars.");
    }
}
