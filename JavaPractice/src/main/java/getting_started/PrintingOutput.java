package getting_started;

/*
    Any Java class which is meant to execute code linearly must have a main method.
    All code to be executed should be placed *inside* the main method.
    Any additional methods (functions) needed should be placed *after* the main method.

    To execute code in IntelliJ, click on the green arrow to the left of the main
    method signature and then click on "Run `PrintingOutput.main()`"

    To print to the console, you use this syntax:
        System.out.println(contentToBePrinted)

    To call a static method defined within the same class, you do not need to use
    the 'this' keyword. Just call it directly.

    If a method has a return value, you can print it.
 */

public class PrintingOutput {

    /* MAIN METHOD */
    public static void main(String[] args) {

        String planet = "Earth";
        int numMoons = 1;
        boolean hasIntelligentLife = true;

        // TODO: Print each of the variables given above


        // TODO: Print a formatted SSN using the getFormattedSSN method below,
        //  where ssn1 is 123, ssn2 is 456, and ssn3 is 7890


        // TODO: Print the result of 13 * 17 using the multiplyNums method below


        // TODO: Print the result of -4 * 39 using the multiplyNums method below

    }

    /* OTHER METHODS */

    public static String getFormattedSSN(String ssn1, String ssn2, String ssn3) {
        return ssn1 + "-" + ssn2 + "-" + ssn3;
    }

    public static int multiplyNums(int num1, int num2) {
        return num1 * num2;
    }

}
