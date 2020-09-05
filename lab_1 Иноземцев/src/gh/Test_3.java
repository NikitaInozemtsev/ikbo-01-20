package gh;

public class Test_3
{
    public static void main(String[] args)
    {
        for (int i = 1; i < 11; i++)
        {
            System.out.print("1/" + i + " ");
        }

        System.out.println();

        for (int i = 1; i < 11; i++)
        {
            double k = 1.0 / i;
            System.out.print(k + " ");
        }
    }
}
