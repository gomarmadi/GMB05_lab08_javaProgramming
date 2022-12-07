package patterns.restaurant.employee;

import patterns.restaurant.data.Burger;
import patterns.restaurant.data.Pizza;

public class Сhef {

    public void makeBurger(Burger burger) {
        System.out.println("Шеф-повар сделал " + burger);
    }

    public void bakePizza(Pizza pizza) {
        System.out.println("Шеф-повар испек " + pizza);
    }
}
