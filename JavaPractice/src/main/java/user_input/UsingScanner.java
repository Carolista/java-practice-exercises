package user_input;

import java.util.Scanner;

/*
    The Scanner class is used for reading data. When accepting user input, you must create
    a new object of the Scanner class with the argument System.in.

    Make sure you print something to the console first to tell the user what you're asking for,
    then create a variable to store the input you accept.

    Use Scanner class methods like .nextLine() for strings or .nextInt() for int, etc.

    Read this article to learn about why reading in a String after an int can cause unexpected behavior:
    https://www.geeksforgeeks.org/why-is-scanner-skipping-nextline-after-use-of-other-next-functions/

    At the very end, always use .close() to end the process.
 */

public class UsingScanner {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("What is your name? ");
        String name = input.nextLine();

        System.out.println("What is your age? ");
        int age = input.nextInt();
        input.nextLine(); // clear cursor before continuing (see link to article above)

        System.out.println("What is your favorite cake/frosting combination? ");
        String cake = input.nextLine();

        System.out.println("What is your favorite ice cream flavor? ");
        String iceCream = input.nextLine();

        System.out.println("Happy birthday, " + name + "! I can't believe you are " + age + " already. Let's enjoy some " + cake + " with " + iceCream + " ice cream.");

        input.close();
    }

}
