package domain;

public class CapriciossaPizza implements Pizza{
    private Double price;

    public CapriciossaPizza(Double price) {
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
        return "CapriciossaPizza{" +
                "price=" + price +
                '}';
    }
}
