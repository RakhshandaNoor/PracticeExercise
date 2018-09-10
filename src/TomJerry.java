/*    Write a program which accepts an integer number as input from the user and perform the following conditional checks:
    a. Print Tom if number is odd and exists between 20 to 30
    b. Print Jerry, if number is even and exists between 20 and 30*/
import java.util.Scanner;

public class TomJerry {

    public static void main(String[] args) {
         Scanner input= new Scanner(System.in);
         System.out.println("Enter the number");
         int x= input.nextInt();

         if(x>20 && x<30)
         {
             if(x%2==0)
             {
                 System.out.println("Jerry");
             }
             else
                 System.out.println("Tom");
         }
         else
             System.out.println("Number not between 20-30");
    }
}
