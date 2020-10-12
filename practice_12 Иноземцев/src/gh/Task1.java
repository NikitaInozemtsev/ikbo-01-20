package gh;

public class Task1 {
    public static void main(String[] args) {
        Person p = new Person("Никита", "Иноземцев", "");

        System.out.println(p);
    }
}

class Person {
    private String name;
    private String surname;
    private String patronymic;

    public Person(String name, String surname, String patronymic) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
    }

    @Override
    public String toString() {
        return
                new StringBuilder(surname)
                        .append(" ")
                        .append((name != null && !name.isEmpty())? name.charAt(0) + ".": "")
                        .append((patronymic != null && !patronymic.isEmpty())? patronymic.charAt(0) + ".": "")
                        .toString();
    }
}