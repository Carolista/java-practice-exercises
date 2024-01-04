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

        int TODAY = LocalDate.now().getYear();

        // We will use a Scanner object to get user input
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the year you were born (YYYY): ");
        int userNum = input.nextInt();

        // TODO: Declare a variable to hold a string representing the name of a generation

        // TODO: Write a conditional that assigns one of the following values to your variable
        //  The Greatest Generation (1901-1927)
        //  The Silent Generation (1928-1945)
        //  The Baby Boom Generation (1946-1964)
        //  Generation X (1965-1980)
        //  The Millennial Generation (1982-1996)
        //  Generation Z (1997-2012)
        //  Generation Alpha (2013-Present)

        // TODO: Print a sentence that tells the user what generation they are a part of.

        // TODO: Test your conditional by running the code several times with different input

        // TODO: BONUS!
        //  If a year is entered that is less than 1901, modify your code above to print
        //  "Call the Guinness Book of World Records! You are practically ancient." instead
        //  If a year is entered that is greater than TODAY, print
        //  "Hey, you haven't even been born yet!" instead

        input.close();
    }

}
