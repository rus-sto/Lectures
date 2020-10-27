package by.jrr.ruslan.decorator.v2coffeelike.components;

import by.jrr.ruslan.decorator.v2coffeelike.drink.Beverage;

public class Soy extends BeverageComponents {
     String name = " With soy ";

    public Soy(Beverage beverage) {
        super(0.15, beverage);
       }

    public double getCost() {

        return beverage.getCost() + cost;
    }

}
