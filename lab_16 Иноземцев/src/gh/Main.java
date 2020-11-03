package gh;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Item[] menu = {
                new Drink(180, "San Pellegrino с/г", "250мл"),
                new Drink(190, "Чай черный", "300 мл Ассам Мелленг/Блю Эрл Грей/Пу Эр"),
                new Drink(150, "Капучино", "200 мл"),
                new Drink(250, "Пина колада б/а", "300 мл"),
                new Drink(215, "Аперетив Martini Bianco", "100 мл"),
                new Drink(240, "Ром Bacardi Superior", "50 мл"),
                new Drink(280, "Виски Jameson", "50 мл"),
                new Dish(750, "Стейк лосося, запеченый в пергаменте", " соусом из сливок и шпината 260 г"),
                new Dish(260, "Стейк из свинины", "с картофелем фри и соусом «барбекю» 130/50 г"),
                new Dish(380, "Паста “Карбонара”", "300 г. Спагетти с беконом, сливочным соусом и сыром пармезан"),
                new Dish(380, "Бургер-Стейк", "320 г"),
                new Dish(990, "Каре ягненка", "200 г"),
                new Dish(890, "Ризотто с тартаром", "ИЗ МРАМОРНОЙ ГОВЯДИНЫ, 380 г")
        };

        Order order = new OrderManager();

        System.out.println("Выбери тип заказа: 1 - интернет заказ, 2 - заказ в ресторане");
        int typeOrder = 0;
        Scanner sc = new Scanner(System.in);
        typeOrder = sc.nextInt();

        while(typeOrder != 1 && typeOrder != 2){

            System.out.println("Нет такого типа заказа!");
            System.out.println("Выбери тип заказа: 1 - интернет заказ, 2 - заказ в ресторане");
            typeOrder = sc.nextInt();
        }

        String adress = "";
        InternetOrder orderInt = null;
        if (typeOrder == 1) {
            orderInt = new InternetOrder();
            System.out.println("Введите адрес: ");
            Scanner sc1 = new Scanner(System.in);
            adress = sc1.nextLine();
        }
        else {
            order = new RestaurantOrder();
        }

        System.out.println("Меню:");

        for (int i = 0; i < menu.length; i++) {
            System.out.println(i + " - " + menu[i]);
        }

        System.out.println("Выберите блюда(через пробел): ");

        Scanner sc2 = new Scanner(System.in);
        String it = sc2.nextLine();

        String res = "";

        for (int i = 0; i < it.length(); i++) {
            if (it.charAt(i) != ' ') {
                res += it.charAt(i);
            }
            else {
                int ad = Integer.parseInt(res);
                if (ad >= 0 && ad < menu.length) {
                    order.add(menu[ad]);
                }

                res = "";

            }
        }

        int ad = Integer.parseInt(res);
        if (ad >= 0 && ad < menu.length) {
            order.add(menu[ad]);
        }

        if(typeOrder == 1) {
            orderInt.add(adress, order);
        }

        System.out.println("Ваш заказ");

        if (typeOrder == 1) {
            orderInt.getOrders();
        }
        else {
            System.out.println(Arrays.toString(order.getArray()));
        }
    }
}
