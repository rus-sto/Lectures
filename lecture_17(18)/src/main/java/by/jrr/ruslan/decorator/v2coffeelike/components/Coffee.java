package by.jrr.ruslan.decorator.v2coffeelike.components;

import by.jrr.ruslan.decorator.v2coffeelike.drink.Beverage;

public class Coffee extends BeverageComponents {
     String name = " With coffee ";

    public Coffee(Beverage beverage) {
        super(0.05, beverage);
     }

    public double getCost() {

        return beverage.getCost() + cost;
    }

}
