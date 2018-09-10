/*Create a program that accepts a word as input and checks for each single character letter in the word whether it is a consonant or vowel.
Condition:
    a. Print an error message if the input is not a letter
    b. If the input having more than one letter, print the required output
          (Vowel or Consonant) for each letter*/

import java.util.Scanner;

public class VowelCons {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the word");
        String s = input.nextLine();

         s= s.toLowerCase();
        for(int i=0;i<s.length();i++)
        {
            char ch= s.charAt(i);
            if(!Character.isLetter(ch))
            {
                System.out.println("it is not a character");
                break;
            }
            else{
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println(ch + " is a vowel");
            } else {
                System.out.println(ch + " is a consonant");
            }
        }
        }

    }
}
