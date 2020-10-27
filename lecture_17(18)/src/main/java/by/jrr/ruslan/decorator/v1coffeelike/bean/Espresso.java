package by.jrr.ruslan.decorator.v1coffeelike.bean;

public class Espresso extends Beverage {

    public double getCost() {
        double cost = super.getCost();
        cost+=3.0;
        return cost;
    }
}
