package gh;

public class Test_1
{
    public static void main(String[] args)
    {
        int[] arr = {45, 2, 7, 12, 67, 12};

        int res = 0;

        for (int i = 0; i < arr.length; i++)
        {
            res += arr[i];
        }

        System.out.println("Result with cycle \"for\" = " + res);

        int i = 0;
        res = 0;

        while (i != arr.length)
        {
            res += arr[i];
            i++;
        }

        System.out.println("Result with cycle \"while\" = " + res);

        i = 0;
        res = 0;

        do {
            res += arr[i];
            i++;

        } while(i != arr.length);

        System.out.println("Result with cycle \"do while\" = " + res);
    }
}
