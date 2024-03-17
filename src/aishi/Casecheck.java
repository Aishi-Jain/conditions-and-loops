package aishi;
import java.util.Scanner;
public class Casecheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // .trim() removes all the extra spaces that are at the end of the word.
        /* for eg:
         System.out.println(input.next().trim());
         OUTPUT:
                   hello (users gives the input)
         hello (.trim() has removed all the extra spaces)
         */
        // .charAt(0) basically means, give me the character at this index of the string.
        /* for eg:
          String word = "hello";
          System.out.println(word.charAt(0));
          OUTPUT:
          h (as the character at the oth index of the string is h)
        */

        char ch = input.next().trim().charAt(0);
        if(ch >= 'a' && ch <= 'z')
        {
            System.out.println("lowercase");
        }
        else
        {
            System.out.println("uppercase");
        }
    }
}
