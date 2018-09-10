/*    Write a program which accepts a number from user as input (set the limit say 1 - 50 or 1 - 100) User should guess until the the target number is guessed correctly.
    Print separate messages for the following:
        a. Number guessed is more than original number
        b. Number guessed is less than original number
        c. Number guessed matches the original number*/
import java.util.Random;
import java.util.Scanner;

public class GuessNum {
    public static void main(String[] args) {
        Random r = new Random();
        int  n = r.nextInt(50) + 1;
        Scanner input= new Scanner(System.in);
        do {
            System.out.println("guess the number within the range 1-50");
            int x = input.nextInt();
            if(x==n)
            {
                System.out.println("Number guessed matches the original number");
                break;
            }
            else if(x< n)
            {
                System.out.println("Number guessed is less than original number");
            }
            else
            {
                System.out.println("Number guessed is more than original number");
            }


        } while(true);
    }
}
