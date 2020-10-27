package by.jrr.ruslan.decorator.v3coffeelike.component;

import by.jrr.ruslan.decorator.v3coffeelike.Beverage;

public class Coffee extends Beverage {

    public Coffee(Beverage beverage) {
        super(0.50, beverage);
    }
}
