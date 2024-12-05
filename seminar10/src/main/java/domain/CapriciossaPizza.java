package domain;

public class CapriciossaPizza implements Pizza{
    private Double price;
    private final String name="Capriciossa";


    public CapriciossaPizza(Double price) {
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
        return "CapriciossaPizza{" +
                "price=" + price +
                '}';
    }
}
