package gh;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Item drink1 = new Drink(250, "Молочные коктейли", "Ванильный / Банановый / Ягодный");
        Item drink2 = new Drink(300, "Холодный кофе", "Цитрусовый / Пряный / Классический");
        Item dish1 = new Dish(420, "Буррито", "Кесадилья с говяжьей вырезкой, сыром чеддер, грибами с соусом томатная сальса в сырной тортилье");
        Item dish2 = new Dish(529, "Пицца Гавайская", "Томатный соус, сыр, курица, ананасы");

        Order ord1 = new RestaurantOrder();
        ord1.add(dish1);
        ord1.add(drink2);
        System.out.println("Order1: " + Arrays.toString(ord1.getArray()));

        Order ord2 = new InternetOrder();
        ord2.add(drink1);
        ord2.add(dish2);
        System.out.println("Order2: " + Arrays.toString(ord2.getArray()));

        System.out.println("Order2: " + ord2.getSumPrice());

        System.out.println("Order2: " + Arrays.toString(ord2.getArrayOfNames()));

        System.out.println("Order2: " + Arrays.toString(ord2.getSortedArray()));
    }
}
