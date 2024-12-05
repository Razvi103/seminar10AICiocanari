package domain;

public class MozarellaToping extends PizzaDecorator{
    private String name="Mozarella";
    public MozarellaToping(Pizza pizza) {
        super(pizza);
        addedPrice = 10.;
    }

    @Override
    public Double getPrice() {
        return pizza.getPrice() + addedPrice;
    }

    @Override
    public String toString(){
        return pizza.toString() + " Decorated with Mozzarella \n";
    }

    public String getName() {
        return name;
    }
}
