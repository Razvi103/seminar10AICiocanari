package domain;

public class ProsciuttoEFunghiPizza implements Pizza{
    private Double price;
    private final String name="ProsciuttoEFunghi";

    public ProsciuttoEFunghiPizza(Double price) {
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
        return "ProsciuttoEFunghiPizza{" +
                "price=" + price +
                '}';
    }
}
