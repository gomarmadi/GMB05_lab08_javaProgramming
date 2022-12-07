package patterns;

import patterns.restaurant.Restaurant;
import patterns.restaurant.data.Burger;
import patterns.restaurant.data.BurgerType;
import patterns.restaurant.data.Pizza;

public class App {

    private static final String CLIENT_NAME_1 = "Мади";
    private static final String CLIENT_NAME_2 = "Азизбек";

    public static void main(String[] args) {

        // Используем паттерн Singleton:
        Restaurant restaurant = Restaurant.getInstance();

        System.out.println("\n" + CLIENT_NAME_1 + " делает заказ...");

        // Используем паттерн Builder:
        Burger burger = new Burger.Builder(CLIENT_NAME_1)
                .withHotPepper(true)
                .sizeBurger(true)
                .burgerType(BurgerType.CHEESEBURGER)
                .build();

        // Используем паттерн Command:
        restaurant.newOrder(burger);

        System.out.println("\n" + CLIENT_NAME_2 + " делает заказ...");
        restaurant.newOrder(new Pizza.Builder(CLIENT_NAME_2)
                .sizePizza(true)
                .weightPizza(true)
                .build());
    }
}
