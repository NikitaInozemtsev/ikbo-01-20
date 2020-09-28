package gh;

import java.util.Scanner;


public class Test {
    public static void main(String[] args) throws InnException{
        Man a = new Man("Egor", "Smirnov", "Olegovich", "023948371232");

        System.out.println(a);
    }
}

class Man {
    private String name;
    private String surname;
    private String middleName;
    private  String inn;

    public Man(String name, String surname, String middleName, String inn) throws InnException {
        if (inn.length() != 12) {
            throw new InnException();
        }
        this.name = name;
        this.surname = surname;
        this.middleName = middleName;
        this.inn = inn;
    }

    @Override
    public String toString() {
        return "Man{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", middleName='" + middleName + '\'' +
                ", inn='" + inn + '\'' +
                '}';
    }
}

class InnException extends Exception {
    InnException() {
        super("В инн должно быть 12 цифр");
    }
}
