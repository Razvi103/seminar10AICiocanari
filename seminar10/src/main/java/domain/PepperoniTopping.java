package domain;

public class PepperoniTopping extends PizzaDecorator{
    public PepperoniTopping(Pizza pizza) {
        super(pizza);
        addedPrice = 5.0;
    }

    @Override
    public Double getPrice() {
        return pizza.getPrice() + addedPrice;
    }

    @Override
    public String toString(){
        return pizza.toString() + " Decorated with Pepperoni \n";
    }


}
