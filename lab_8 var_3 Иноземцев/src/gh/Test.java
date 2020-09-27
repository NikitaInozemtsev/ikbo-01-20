package gh;


import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        try(FileWriter writer = new FileWriter("Test.txt", false))
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите что-нибудь: ");
            String text = sc.nextLine();
            writer.write(text);


            writer.close();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
