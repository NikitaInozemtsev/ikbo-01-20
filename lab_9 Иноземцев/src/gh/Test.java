package gh;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //Exception1 a = new Exception1();

       //a.exceptionDemo();
        ThrowsDemo01 b = new ThrowsDemo01();
        b.printMessage(null);

        ThrowsDemo02 c = new ThrowsDemo02();
        c.getKey();

        ThrowsDemo03 d = new ThrowsDemo03();
        d.getKey();
    }
}

class Exception1 {
    public void exceptionDemo() {
        Scanner myScanner = new Scanner( System.in );
        System.out.print( "Enter an integer ");

        try {
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println( 2 / i );
        } catch (NumberFormatException e) {

            System.out.println("Not number");

        } catch (Exception e) {

            System.out.println("Общее исключение");

        } finally {
            System.out.println("Выполняется всегда");
        }

    }
}

class ThrowsDemo01 {

    public void printMessage(String key) {
        String message = getDetails(key); System.out.println( message );
    }
    public String getDetails(String key) {
        try {
            if (key == null) {
                throw new NullPointerException("null key in getDetails");
            }
        }catch (NullPointerException e) {
            return "Key is null";
        }
        return "data for" + key;
    }
}

class ThrowsDemo02 {

    public void getKey() {
        Scanner myScanner = new Scanner(System.in);
        String key = myScanner.next();
        printDetails(key);
    }

    public void printDetails(String key) {
        try {
            String message = getDetails(key);
            System.out.println(message);
        } catch (Exception e) {
            throw e;
        }
    }

    private String getDetails(String key) {
        try {
            if (key.equals("")) {
                throw new Exception("Key set to empty string");
            }
        }catch (Exception e) {
            System.out.println("Key is empty");
        }
        return "data for " + key;
    }
}

class ThrowsDemo03 {
    public void getKey()  {
        Scanner myScanner = new Scanner( System.in );
        System.out.print("Enter Key ");
        String key = myScanner.nextLine();
        try {
            printDetails(key);
        }
        catch (Exception e) {
            System.out.println("Key is empty");
        }
    }

    public void printDetails(String key) throws Exception {
        String message = getDetails(key);
        System.out.println( message );
    }
    private String getDetails(String key) throws Exception {
        if(key.equals("")) {
            throw new Exception( "Key set to empty string" );
        }
        return "data for " + key;
    }

}

