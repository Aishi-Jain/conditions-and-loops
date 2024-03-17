package aishi;
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        /*
         Fbonacci numbers : a series of numbers in which each number
        ( Fibonacci number ) is the sum of the two preceding numbers.
        Ex :- 0,1,1,2,3,5,8,13…
         */
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;
        while(count <= n)
        {
            int temp = b;
            b = b + a;
            a = temp;
            count ++;
        }

        System.out.println(b);


    }
}
