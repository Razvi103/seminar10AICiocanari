package domain;

public class ProsciuttoEFunghiPizza implements Pizza{
    private Double price;

    public ProsciuttoEFunghiPizza(Double price) {
        this.price = price;
    }

    public Double getPrice(){
        return price;
    }

    public void setPrice(Double price){
        this.price = price;
    }

    @Override
    public String toString() {
        return "ProsciuttoEFunghiPizza{" +
                "price=" + price +
                '}';
    }
}
