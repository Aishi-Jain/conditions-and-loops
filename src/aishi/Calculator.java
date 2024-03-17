package aishi;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // we take input from the user until they press a or A
        int ans = 0;
        while (true) {
            System.out.println("Enter the operator [+, -, *, /, %] :");
            char op = input.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                System.out.println("Enter two numbers:");
                int a = input.nextInt();
                int b = input.nextInt();

                if (op == '+') {
                    ans = a + b;
                }
                if (op == '-') {
                    ans = a - b;
                }
                if (op == '*') {
                    ans = a * b;
                }
                if (op == '/') {
                    ans = a / b;
                }
                if (op == '%') {
                    ans = a % b;
                }
            }
            else if (op == 'a' || op == 'A')
            {
                break;
            }
            else
            {
                System.out.println("Invalid operation");
            }
            System.out.println("Your output is:");
            System.out.println(ans);
        }
    }
}