package patterns.restaurant.data;

import patterns.restaurant.employee.Сhef;

public class Order implements Command {

    private final Сhef chef;
    private final Product productToMake;

    public Order(Сhef barista, Product productToMake) {
        this.chef = barista;
        this.productToMake = productToMake;
    }

    @Override
    public void execute() {
        if (this.productToMake instanceof Burger) {
            chef.makeBurger((Burger) productToMake);
        } else {
            chef.bakePizza((Pizza) productToMake);
        }
    }

    @Override
    public String toString() {
        return "Заказ{" + productToMake + '}';
    }
}
