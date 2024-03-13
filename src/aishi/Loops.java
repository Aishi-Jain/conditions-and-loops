package aishi;
import java.util.Scanner;
public class Loops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // for loop
        for(int num = 1; num<=5; num++)
        {
            System.out.println(num);
        }

        // print numbers from one to n
        System.out.println("Enter any number n:");
        int n = input.nextInt();
        for(int numb = 1; numb<=n; numb++)
        {
            System.out.println(numb);
        }

        //while loop
        int number = 1;
        while(number<=9)
        {
            System.out.println("Hello World");
            number++;
        }

        //do while loop
        int Number = 1;
        do {
            System.out.println(Number);
            Number++;
        }
        while(Number<=6);
        // in do while loop, it will execute the statement first and then it will check the condition in while
    }
}
