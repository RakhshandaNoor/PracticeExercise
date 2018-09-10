/*Write a program to reverse any string without using String Buffer.*/
import java.util.Scanner;

public class RevString {

    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println("enter the String");
        String s, rev="";
         s= input.nextLine();
         for(int i= s.length()-1; i>0;i--)
         {
             rev = rev + s.charAt(i);
         }
         System.out.println("the reverse of string is "+ rev);
    }
}
