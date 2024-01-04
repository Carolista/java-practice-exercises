package conditionals;

import java.util.Scanner;

/*
    A switch statement has completely different syntax from an if/else structure, but accomplishes
    the same thing for mutually exclusive conditions. Basic syntax:

    switch (someStr) {
        case "value 1 for someStr":
          // code to execute in this case
          break;
        case "value 2 for someStr":
          // code to execute in this case
          break;
        case "value 3 for someStr":
          // code to execute in this case
          break;
        default:
          // code to execute if nothing else is triggered
    }

    The break keyword is used to prevent fallthrough to the default case.
 */

public class Switch {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the current weather: ");
        String weather = input.nextLine();

        // TODO: Create a variable to hold a string representing an accessory

        // TODO: Create a switch statement to set the accessory as follows:
        //  if weather is rainy, pack an umbrella
        //  if weather is sunny, pack sunglasses and sunscreen
        //  if weather is windy, pack some lip balm
        //  if weather is snowy, pack a hat, some gloves, and a scarf
        //  otherwise set the value to DOES NOT COMPUTE

        // TODO: Print a sentence using the weather and the accessory

    }

}