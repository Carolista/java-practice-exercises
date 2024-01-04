package conditionals;

import java.util.ArrayList;
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

        String accessory;

        switch (weather) {
            case "rainy":
                accessory = "an umbrella";
                break;
            case "sunny":
                accessory = "sunglasses and sunscreen";
                break;
            case "windy":
                accessory = "some lip balm";
                break;
            case "snowy":
                accessory = "a hat, some gloves, and a scarf";
                break;
            default:
                accessory = "DOES NOT COMPUTE";
        }

        System.out.println("If the weather is " + weather + ", you'd better pack " + accessory + "!");

    }

}
