package by.jrr.ruslan.decorator.v3coffeelike;

import by.jrr.ruslan.decorator.v3coffeelike.component.Coffee;
import by.jrr.ruslan.decorator.v3coffeelike.component.Milk;
import by.jrr.ruslan.decorator.v3coffeelike.component.Sugar;
import by.jrr.ruslan.decorator.v3coffeelike.drink.Latte;
import by.jrr.ruslan.decorator.v3coffeelike.drink.Mocha;

public class CoffeeLike {
    public static void main(String[] args) {
        Beverage latte = new Latte();
        Beverage latteWithSugar = new Sugar(latte);
        Beverage latteWithSugarAndMilk = new Milk(latteWithSugar);

        Beverage.print(latteWithSugarAndMilk);
        System.out.println();
        System.out.println();

        Beverage coffee = new Coffee(null);
        Beverage coffeeWithSugar = new Sugar(coffee);
        Beverage coffeeWithSugarAndMilk = new Milk(coffeeWithSugar);

        Beverage.print(coffeeWithSugarAndMilk);

        System.out.println();

        Beverage mocha = new Mocha();
        Beverage.print(mocha);
    }
}

