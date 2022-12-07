package patterns.restaurant.employee;

import patterns.restaurant.data.Order;

public class Waiter {

    public void execute(Order order) {
        System.out.println("Официант получил " + order);
        order.execute();
    }
}
