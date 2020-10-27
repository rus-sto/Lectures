package by.jrr.ruslan.decorator.v2coffeelike.components;

import by.jrr.ruslan.decorator.v2coffeelike.drink.Beverage;

public class Sugar extends BeverageComponents {
      String name = " With Sugar ";

    public Sugar(Beverage beverage) {
        super(0.01, beverage);
     }

    public double getCost() {

        return beverage.getCost() + cost;
    }
}
