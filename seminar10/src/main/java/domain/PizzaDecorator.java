package domain;

public abstract class PizzaDecorator implements Pizza{
    protected Pizza pizza;
    public PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }
    protected Double addedPrice;

    Double getAddedPrice() {
        return addedPrice;
    }

    void setAddedPrice(Double addedPrice) {
        this.addedPrice = addedPrice;
    }

    @Override
    public abstract String toString();
}
