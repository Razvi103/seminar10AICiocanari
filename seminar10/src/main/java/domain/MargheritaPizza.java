package domain;

public class MargheritaPizza implements Pizza{
    private Double price;

    public MargheritaPizza(Double price) {
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
        return "MargheritaPizza{" +
                "price=" + price +
                '}';
    }
}
