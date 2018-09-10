/*Write a program that reads an unspecified number of integer arguments using Scanner Class and adds them together.
 The program should display total of the given input number and should only consider integer value.
The program should display an error message if there are any non integer values*/
import java.util.Scanner;

public class UnspecifiedNumSum {

    public static void main(String[] args) {

        int n, sum=0;
        Scanner input= new Scanner(System.in);
        System.out.println("enter the numbers");
        do {
            n= input.nextInt();
            sum += n;

        }while(input.hasNextInt());
        System.out.println("sum "+ sum);
    }
}
