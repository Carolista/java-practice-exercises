package conditionals;

import java.time.LocalDate;
import java.util.Scanner;

/*
    Conditional syntax is the same in Java as in JavaScript

    if (condition) {
        // code to execute if condition is true
    } else if (condition) {
        // code to execute if first condition is false
    } else {
        // code to execute if preceding conditions are false
    }

 */

public class IfElse {

    public static void main(String[] args) {

        int CURRENT_YEAR = LocalDate.now().getYear();

        // We will use a Scanner object to get user input
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the year you were born (YYYY): ");
        int birthYear = input.nextInt();

        String gen;

        if (birthYear > 2012) {
            gen = "Generation Alpha";
        } else if (birthYear > 1996) {
            gen = "Generation Z";
        } else if (birthYear > 1980) {
            gen = "Millennial Generation";
        } else if (birthYear > 1964) {
            gen = "Generation X";
        } else if (birthYear > 1945) {
            gen = "the Baby Boom Generation";
        } else if (birthYear > 1927) {
            gen = "the Silent Generation";
        } else {
            gen = "the Greatest Generation";
        }

        if (birthYear < 1901) {
            System.out.println("Call the Guinness Book of World Records! You are practically ancient.");
        } else if (birthYear > CURRENT_YEAR) {
            System.out.println("Hey, you haven't even been born yet!");
        } else {
            System.out.println("Because you were born in " + birthYear + ", you are a part of " + gen + ".");
        }

        input.close();
    }

}
