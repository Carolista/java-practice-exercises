package conditionals;

/*
    Use the Java equality operator == to compare primitives

    Use the .equals() method to compare two strings

    Use logical operators && (AND) and || (OR) for making multiple comparisons at once

    Use ! (NOT) to negate boolean equality
 */

public class Equality {

    public static void main(String[] args) {

        /* NUMBERS */
        int num1 = 7;
        int num2 = 13;
        double num3 = 24.15;
        int num4 = 1090;

        System.out.println(2 + 5 == num1);

        System.out.println(70/5 == num2);

        System.out.println(num3 != 24);

        System.out.println(20 * 18 >= num4);

        System.out.println(num1 > 5  || num2 > 10);

        System.out.println(num3 < 30 && num4 < 100);


        /* STRINGS */
        String book = "The Fellowship of the Ring";
        String greeting = "  HeLLo ";

        System.out.println(book.equals("The Return of the King"));

        System.out.println(book.contains("F") && book.contains("R"));

        System.out.println(greeting.trim().toLowerCase().equals("hello"));

    }
}
