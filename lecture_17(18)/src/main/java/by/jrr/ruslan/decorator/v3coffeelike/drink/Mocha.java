package by.jrr.ruslan.decorator.v3coffeelike.drink;

import by.jrr.ruslan.decorator.v3coffeelike.Beverage;

import java.util.concurrent.ThreadLocalRandom;

public class Mocha extends Beverage{
    public Mocha(){
        super(null);

        description = "Hot drink, based on tea. ";
    }
    private double getMochaCost(){
        cost= ThreadLocalRandom.current().nextDouble(3,9);
        return cost;
    }

    @Override
    public double getCost() {
        return getMochaCost();
    }
    @Override
    public String toString() {
        StringBuffer result = new StringBuffer();
//        if (beverage == null) {
            result.append(String.format(" Beverage  %s %s \n\tCost of %s : %.2f",
                    this.getClass().getSimpleName(), description, this.getClass().getSimpleName(),
                    getCost()));
//        } else {
//            result.append(beverage.toString() +
//                    String.format("\n\tCost of %s: %.2f",
//                            this.getClass().getSimpleName(),
//                            getCost()));
//        }
        return result.toString();
    }
}
