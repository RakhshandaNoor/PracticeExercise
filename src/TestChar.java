/*Write a program that takes a character from the user as input and determines whether the character entered is a
 capital letter, a small case letter, a digit or a special symbol and display appropriately.*/
import java.util.Scanner;

public class TestChar {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("enter char");
        char c = input.next().charAt(0);
        if (Character.isUpperCase(c))
            System.out.println ( " Uppercase Alphabet ");
        else if (Character.isLowerCase(c))
            System.out.println ( " Lowercase Alphabet ");

            // CHECKING FOR DIGITS
        else if (Character.isDigit(c))
            System.out.println(" Digit ");

            // OTHERWISE SPECIAL CHARACTER
        else
            System.out.println ( " Special Character ");
    }
}


