package by.jrr.ruslan.decorator.v1coffeelike.bean;

public class Latte extends Beverage {

    public double getCost() {
        double cost = super.getCost();
        cost+=7.0;
        return cost;
    }
}
