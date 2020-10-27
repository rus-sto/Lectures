package by.jrr.ruslan.decorator.v1coffeelike.bean;

public class Cappuccino extends Beverage {

    public double getCost() {
        double cost = super.getCost();
        cost+=5.0;
        return cost;
    }
}
