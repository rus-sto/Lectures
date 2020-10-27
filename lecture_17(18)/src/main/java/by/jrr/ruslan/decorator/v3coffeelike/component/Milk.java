package by.jrr.ruslan.decorator.v3coffeelike.component;

import by.jrr.ruslan.decorator.v3coffeelike.Beverage;

public class Milk extends Beverage {

    public Milk(Beverage beverage) {
        super(0.99, beverage);
    }
}
