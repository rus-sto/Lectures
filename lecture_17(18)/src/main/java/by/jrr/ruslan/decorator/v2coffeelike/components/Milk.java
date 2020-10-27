package by.jrr.ruslan.decorator.v2coffeelike.components;

import by.jrr.ruslan.decorator.v2coffeelike.drink.Beverage;

public class Milk extends BeverageComponents {
    String name = " With milk ";

    public Milk(Beverage beverage) {
        super(1.0, beverage);
      }

    public double getCost() {

        return beverage.getCost() + cost;
    }
}
