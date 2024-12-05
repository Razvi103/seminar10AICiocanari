package observers;

import domain.Pizza;

public class ConcreteObserver implements Observer {
    private Double totalPrice;
    private final Order order;

    public ConcreteObserver(Order order) {
        this.totalPrice = 0.;
        this.order = order;

    }

    @Override
    public void update() {
        if (order.getList().isEmpty()){
            totalPrice = 0.;
        }
        else {
            for (Pizza pizza: order.getList()){
                totalPrice += pizza.getPrice();
            }
        }
    }
}
