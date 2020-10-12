package gh;

public class Task4 {
    public static void main(String[] args) {
        PhoneNumber p = new PhoneNumber("+34568928900");

        System.out.println(p);

        //p = new PhoneNumber("+90");

        p = new PhoneNumber("89462318832");

        System.out.println(p);
    }
}

class PhoneNumber {
    private String countryCode;
    private String operatorCode;
    private String prefix;
    private String num;

    public PhoneNumber(String number) {
        if (number.length() == 12) {
            countryCode = String.valueOf(number.charAt(1));
            operatorCode = number.substring(2, 5);
            prefix = number.substring(5, 8);
            num = number.substring(8);
        }
        else if (number.length() == 11)
        {
            countryCode = "7";
            operatorCode = number.substring(1, 4);
            prefix = number.substring(4, 7);
            num = number.substring(7);
        }
        else {
            throw new IllegalStateException("Неправильно введены исходные данные");
        }
    }

    @Override
    public String toString() {
        return "+" + countryCode + operatorCode + "-" + prefix + "-" + num;
    }
}
