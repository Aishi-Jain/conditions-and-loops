package aishi;
import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
        let's say we have to reverse the given number [n] : 12345
        to reverse that number we'll be doing the following steps:
        we'll first initialize int ans = 0
        then, while(n>0)
        12345 % 10 = 5
        12345 / 10 = 1234
        ans = ans * 10 + rem which will give us :
        ans = 0 * 10 + 5
        ans = 5
        so now, the ans = 5
        1234 % 10 = 4
        1234 / 10 = 123
        ans = 5 * 10 + 4
        ans = 54
        123 % 10 = 3
        123 / 10 = 12
        ans = 54 * 10 + 3
        ans = 543
        12 % 10 = 2
        12 / 10 = 1
        ans = 543 * 10 + 2
        ans = 5432
        1 % 10 = 1
        1 / 10 = 0
        ans = 5432 * 10 + 1
        ans = 54321
        the loop will eb terminated as the condition is n > 0 and the output will be :
        54321
         */
        int ans = 0;
        System.out.println("Give any number:");
        int a = input.nextInt();
        while (a>0)
        {
            int rem = a % 10;
            a = a / 10;
            ans = ans * 10 + rem;
        }
        System.out.println(ans);
    }
}
