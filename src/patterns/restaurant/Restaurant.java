package patterns.restaurant;

import patterns.restaurant.data.Order;
import patterns.restaurant.data.Product;
import patterns.restaurant.employee.Сhef;
import patterns.restaurant.employee.Waiter;

public class Restaurant {

    private static Restaurant instance = null;

    private final Сhef chef;
    private final Waiter waiter;

    // Приватный конструктор: инстанцирование разрешено только внурти этого класса.
    private Restaurant() {
        this.chef = new Сhef();
        this.waiter = new Waiter();
    }

    public void newOrder(Product product) {
        // Command - behavioral pattern (паттерны для взаимодействия классов).
        //
        // Создается конкретная комманда (Order), реализующая интерфейс Command,
        // которая просит получателя (Сhef) совершить действие и отправляется
        // вызывающему (Waiter). Вызывающий - тот, кто знает когда дать эту
        // команду. Получатель - тот, кто знает что делать, когда дается 
        // конкретная команда.
        //
        // Таким образом, когда выполняется метод execute вызывающего, он,
        // в свою очередь, вызывает метод получателя, тем самым выполняя необходимые действия.
        Order order = new Order(chef, product);
        waiter.execute(order);
    }

    // Singleton - creational pattern (паттерны для инстанцирования классов).
    //
    // Создает только один объект класса, и предоставляет
    // только один глобальный доступ к этому объекту.
    public static Restaurant getInstance() {
        synchronized (Restaurant.class) {
            if (instance == null) {
                instance = new Restaurant();
            }
        }
        return instance;
    }
}
