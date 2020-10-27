package by.jrr.ruslan.decorator.v2coffeelike;

import by.jrr.ruslan.decorator.v2coffeelike.components.*;
import by.jrr.ruslan.decorator.v2coffeelike.drink.Beverage;
import by.jrr.ruslan.decorator.v2coffeelike.drink.Cappuccino;
import by.jrr.ruslan.decorator.v2coffeelike.drink.Latte;

public class AppCoffeeLike {
    public static void main(String[] args) {

        Beverage latte = new Latte();
        BeverageComponents withSugar = new Sugar(latte);
        BeverageComponents withCoffee = new Coffee(withSugar);
        BeverageComponents withMilk = new Milk(withCoffee);
//        System.out.println(withMilk.toString());
//        System.out.println("===================");
//        System.out.println(String.format("\n\tTotal: %.2f ",withMilk.getCost()));
    Beverage.print(withMilk);
        System.out.println(Beverage.check(withMilk));
    }
}
