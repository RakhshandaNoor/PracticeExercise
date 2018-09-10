/*    Write a program which accepts a number as input and check whether the given number is palindrome or not If it is a palindrome then
    a. Add all the even numbers and check whether the sum is more than 25.
    b. Print success and failure messages for all 3 conditions*/

import java.util.Scanner;

public class Pallindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        long x = input.nextLong();

        long rev = 0, n,rem, sum=0;
        n=x;
        while (n > 0) {
            rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
            if(rem%2==0) {
                sum += rem;
            }

        }


        if(x==rev) {
            System.out.println("pallindrome");
            if(sum>25)
            {
                System.out.println("sum is greater than 25");
            }
            else
                System.out.println("sum is less than 25");


        }
        else
        {
            System.out.println("Not a pallindrome");
        }
    }
}
