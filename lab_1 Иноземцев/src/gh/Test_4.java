package gh;


import java.lang.Math;
import java.util.Formatter;

public class Test_4
{
    public  static void main(String[] args)
    {
        int N = (int)(Math.random() * 101);

        int[] arr = new int[N];

        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = (int)(Math.random() * 100);
            Formatter f = new Formatter();
            System.out.print(f.format("%2d", arr[i]));
            System.out.print(" ");
        }

        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 1; j < arr.length; j++)
            {
                if (arr[j-1] > arr[j])
                {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
        System.out.println();

        for (int i = 0; i < arr.length; i++)
        {
            Formatter f = new Formatter();
            System.out.print(f.format("%2d", arr[i]));
            System.out.print(" ");
        }
    }
}
