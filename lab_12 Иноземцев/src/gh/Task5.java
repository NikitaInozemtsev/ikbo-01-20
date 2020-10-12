package gh;

import java.util.regex.Pattern;

public class Task5 {
    public static void main(String[] args) {
        Pattern pat = Pattern.compile("(?=.*[a-z])(?=.*[A-Z])(?=.*[1-9])[0-9a-zA-Z[_]]{8,}");

        String[] test = {
                "F032_Password",
                "TrySpy1", //в примере этот пароль помечен как правильный, но это ошибка в нем 7 символов, а должно быть минимум 8
                "smart_pass",
                "A007",
                "TrySpy12"
        };

        for (String t : test)
            System.out.println(pat.matcher(t).matches() + "\t:" + t);
    }
}
