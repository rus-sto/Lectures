package by.jrr.ruslan.decorator.v2coffeelike.components;

import by.jrr.ruslan.decorator.v2coffeelike.drink.Beverage;

public class ArtSugar extends BeverageComponents {
     String name = " With artificial Sugar ";

    public ArtSugar(Beverage beverage) {
        super(0.99, beverage);
    }

    public double getCost() {
        return beverage.getCost() + cost;
    }
}
