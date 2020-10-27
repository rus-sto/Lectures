package by.jrr.ruslan.decorator.v2coffeelike.components;

import by.jrr.ruslan.decorator.v2coffeelike.drink.Beverage;

public class Chocolate extends BeverageComponents {
      String name = " With chocolate ";


    public Chocolate(Beverage beverage) {
        super(0.75, beverage);
       }

    public double getCost() {

        return beverage.getCost() + cost;
    }
}
