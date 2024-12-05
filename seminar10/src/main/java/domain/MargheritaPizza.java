package domain;

public class MargheritaPizza implements Pizza{
    private Double price;
    private final String name="Margherita";

    public MargheritaPizza(Double price) {
        this.price = price;
    }

    public Double getPrice(){
        return price;
    }

    public void setPrice(Double price){
        this.price = price;
    }

    public String getName(){
        return name;
    }

    @Override
    public String toString() {
        return "MargheritaPizza{" +
                "price=" + price +
                '}';
    }
}
