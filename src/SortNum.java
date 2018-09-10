/*Write a program which accepts a number as input from user and perform the following:
a. sort the number in non-increasing order
b. after sorting sum all the even numbers, the sum should be greater than 15 .
c. if sum is more than 15,then print output as true or false.*/
import java.util.Arrays;
import java.util.Scanner;

public class SortNum {

    public static void main(String[] args) {
        int x, n, i, count,sum=0;
        Scanner input= new Scanner(System.in);
        System.out.println("enter the number");
         n = input.nextInt();
          x=n;
        for(count=0;x!=0;x/=10, count++);
        int[] arr = new int[count];
        x=n;
        for(i=0;i<count;i++)
        {
            arr[i]=n%10;
            n=n/10;
            if(arr[i]%2==0)
                sum+= arr[i];

        }
        Arrays.sort(arr);
        System.out.print("output ");
        for(i=count-1;i>=0;i--)
        {
            System.out.print(arr[i]);
        }
        System.out.println();
        System.out.println("sum of even number is"+ sum);
        if(sum>15)
            System.out.println("true");
        else
            System.out.println("false");


    }
}
