package by.jrr.ruslan.decorator.v2coffeelike.components;

import by.jrr.ruslan.decorator.v2coffeelike.drink.Beverage;

public abstract class BeverageComponents extends Beverage {
    Beverage beverage;

    public BeverageComponents(Double cost, Beverage beverage) {
        super(cost);
        this.beverage=beverage;
    }

    @Override
    public String toString() {
        return beverage.toString()+
                "\n"+
                String
                .format("\tCost of %s: %.2f",
                this.getClass().getSimpleName(), beverage.cost);
    }
}
