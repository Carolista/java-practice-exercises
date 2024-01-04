package data_types_and_variables;

/*
    Declare a string variable with the type String
    Strings must be placed between two double quotes

    Declare a character variable with the type char
    Characters must be placed between two single quotes

    To concatenate characters into a string, start with an empty string
    Example: "" + 'a' + 'b' will evaluate to "ab"
 */

public class StringsAndCharacters {

    public static void main(String[] args) {

        /* DECLARING STRINGS */

        String firstName = "Agatha";
        String lastName = "Christie";

        System.out.println(firstName);
        System.out.println(lastName);

        System.out.println(firstName + " " + lastName);


        /* DECLARING CHARACTERS */

        char firstInitial = 'E'; // Emma
        char lastInitial = 'T'; // Thompson

        System.out.println(firstInitial);
        System.out.println(lastInitial);

        System.out.println("" + firstInitial + lastInitial);


        /* USING STRING METHODS */

        String album = "The Dark Side of the Moon";

        System.out.println(album.charAt(9));

        System.out.println(album.substring(4, 8));

        System.out.println(album.indexOf('M'));

        System.out.println(album.toUpperCase());

        System.out.println(album.length());

    }
}
