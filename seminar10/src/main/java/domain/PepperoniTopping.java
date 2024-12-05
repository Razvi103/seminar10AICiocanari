package domain;

public class PepperoniTopping extends PizzaDecorator{
    private String name = "Pepperoni";
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

    public String getName(){
        return name;
    }

}
