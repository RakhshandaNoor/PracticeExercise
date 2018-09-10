/*    Write a program for the following condition:

Given 2 inputs , where input1 is string and input 2 is integer value,
the last n characters should repeat n number of times in the output String.*/
import java.util.Scanner;

public class CharRepeat {

    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println("enter the String");
        String s= input.nextLine();
        System.out.println("enter the number");
        int n= input.nextInt();
        System.out.print(s);

        for(int j=n; j>1; j--) {
            for (int i = s.length() - n; i < s.length(); i++) {
                System.out.print(s.charAt(i));
            }
        }
    }
}
