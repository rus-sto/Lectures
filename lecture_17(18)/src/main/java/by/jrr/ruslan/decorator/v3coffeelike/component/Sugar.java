package by.jrr.ruslan.decorator.v3coffeelike.component;

import by.jrr.ruslan.decorator.v3coffeelike.Beverage;

public class Sugar extends Beverage {

    public Sugar(Beverage beverage) {
        super(0.01, beverage);
    }
}
