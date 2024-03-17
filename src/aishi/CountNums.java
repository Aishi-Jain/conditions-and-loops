package aishi;
import java.util.Scanner;
public class CountNums {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
        suppose we have a number : 133379
        we need to find how many times does the number '3' appear in the given number.
        for that, we do the following calculation:
        133379 % 10
        the answer for the above expression would be the remainder 9
        then, 133379 / 10 = 13337 ( the quotient)
        13337 % 10 = 7
        13337 / 10 = 1333
        1333 % 10 = 3 ( no. of occurences of 3 : 1)
        1333 / 10 = 133
        133 % 10 = 3 (no. of occurences of 3 : 2)
        133 / 10 = 13
        13 % 10 = 3 (no. of occurences of 3 : 3)
        13 / 10 = 1
        1 / 10 = 0 (integer form)
        the loop will be terminated as we will give the condition that the first number should be greater than 0.
        hence, the output should be 3.
         */

    }
}
