package gh;

public class Task3 {
    public static void main(String[] args) {
        String[] shirts = {
                "S001, Black Polo Shirt, Black, XL",
                "S002, Black Polo Shirt, Black, L",
                "S003, Blue Polo Shirt, Blue, XL",
                "S004, Blue Polo Shirt, Blue, M",
                "S005, Tan Polo Shirt, Tan, XL",
                "S006, Black T-Shirt, Black, XL",
                "S007, White T-Shirt, White, XL",
                "S008, White T-Shirt, White, L",
                "S009, Green T-Shirt, Green, S",
                "S010, Orange T-Shirt, Orange, S",
                "S011, Maroon Polo Shirt, Maroon, S"
        };


        Shirt[] res = new Shirt[shirts.length];
        for (int i = 0; i < res.length; i++) {
            res[i] = new Shirt(shirts[i]);
        }

        for (int i = 0; i < 11; i++) {
            System.out.println(res[i]);
        }

    }
}



class Shirt {
    private String number;
    private String model;
    private String color;
    private String size;

    public Shirt(String s) {
        String[] res = s.split(",");
        if (res.length != 4)
            throw new IllegalStateException("Неправильно введены исходные данные");
        number = res[0].trim();
        model = res[1].trim();
        color = res[2].trim();
        size = res[3].trim();
    }

    @Override
    public String toString() {
        return "number = " + number + "\nmodel = " + model + "\ncolor = " + color + "\nsize = " + size;
    }
}
