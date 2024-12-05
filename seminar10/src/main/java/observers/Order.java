package observers;

import domain.Pizza;

import java.util.List;
import java.util.ArrayList;

public class Order implements Subject{
    private List<Observer> observers;
    private ArrayList<Pizza> list;
    public Order() {
        this.observers = new ArrayList<>();
        this.list = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : this.observers) {
            observer.update();
        }
    }

    public void addPizza(Pizza pizza) {
        this.list.add(pizza);
        this.notifyObservers();
    }

    public void clearOrder() {
        this.list.clear();
        this.notifyObservers();
    }

    public Pizza getPizzaAt(Integer index){
        return this.list.get(index);
    }

    public ArrayList<Pizza> getList() {
        return this.list;
    }

}
