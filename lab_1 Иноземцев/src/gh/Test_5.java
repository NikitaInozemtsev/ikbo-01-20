package gh;

import java.util.Scanner;

public class Test_5
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter integer number: ");
        int n;

        while (!sc.hasNextInt())
        {
            System.out.println("This is not integer number, try again");
            sc.next();
        }
        n = sc.nextInt();
        long res = 1;

        for (int i = 1; i <= n; i++)
        {
            res *= i;
        }

        System.out.println("Result = " + res);
    }
}
