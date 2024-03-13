package aishi;

public class Main {
    public static void main(String[] args) {
        int salary = 25400;
        if(salary > 10000)
        {
            salary= salary + 2000;
            System.out.println(salary);
        }
        else
        {
            salary = salary + 1000;
            System.out.println(salary);
        }

        // multiple if-else statements
        int fees = 35000;
        if (fees < 10000)
        {
            fees += 2000;
            System.out.println(fees);
        }
        else if (salary > 20000)
        {
            fees += 3000;
            System.out.println(fees);
        }
        else
        {
            fees += 1000;
            System.out.println(fees);
        }
    }
}