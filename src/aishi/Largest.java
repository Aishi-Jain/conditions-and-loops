package aishi;
import java.util.Scanner;
public class Largest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Give 3 numbers:");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        if(a>b && a>c)
        {
            System.out.println("a is greater" +a);
        }
        else if(b>a && b>c)
        {
            System.out.println("b is greater" +b);
        }
        else
        {
            System.out.println("c is greater" +c);
        }
    }
}
