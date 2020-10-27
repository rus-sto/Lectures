package by.jrr.ruslan.decorator.v2coffeelike.components;

import by.jrr.ruslan.decorator.v2coffeelike.drink.Beverage;

public class Cinnamon extends BeverageComponents {
      String name = " With cinnamon ";

    public Cinnamon(Beverage beverage) {
        super(0.09, beverage);
     }

    public double getCost() {
        return beverage.getCost() + cost;
    }


}
