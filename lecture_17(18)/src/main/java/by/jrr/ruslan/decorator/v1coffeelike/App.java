package by.jrr.ruslan.decorator.v1coffeelike;

import by.jrr.ruslan.decorator.v1coffeelike.bean.Beverage;
import by.jrr.ruslan.decorator.v1coffeelike.bean.Espresso;

public class App {
    public static void main(String[] args) {
        Beverage espresso = new Espresso();
        espresso.setChocolate(true);
        System.out.println(espresso.getCost());
    }
}
