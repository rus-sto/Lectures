package by.jrr.ruslan.decorator.v2coffeelike.components;

import by.jrr.ruslan.decorator.v2coffeelike.drink.Beverage;

public class Mocha extends BeverageComponents {
    String name = " With mocha ";

    public Mocha(Beverage beverage) {
        super(0.2, beverage);
         }

    public double getCost() {

        return beverage.getCost() + cost;
    }

}
