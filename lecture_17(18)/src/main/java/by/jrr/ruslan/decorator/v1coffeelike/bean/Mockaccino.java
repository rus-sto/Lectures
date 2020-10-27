package by.jrr.ruslan.decorator.v1coffeelike.bean;

public class Mockaccino extends Beverage {

    public double getCost() {
        double cost = super.getCost();
        cost+=6.0;
        return cost;
    }
}
