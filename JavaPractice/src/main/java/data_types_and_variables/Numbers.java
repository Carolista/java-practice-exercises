package data_types_and_variables;

/*
    Java has multiple data types for numbers. The three most basic are:
        int for whole numbers
        float for decimal numbers up to 8 places
        double for decimal numbers up to 16 places
 */

public class Numbers {

    public static void main(String[] args) {

        int num1 = 289;

        float num2 = 5.6f; // option 1
        float num3 = (float) 5.6; // option 2

        double num4 = 7.29523942349;

        System.out.println("I have " + num1 + " reasons why the number " + num2 + " is not as cool as the number " + num4);

        System.out.println(num1 + num3 + num4);

    }
}
