package by.jrr.ruslan.decorator.v2coffeelike.drink;

public class Americano extends Beverage {
public Americano(){
    super(3.0);
    name="Americano";
    description="hot drink based on coffee";
}
    public double getCost() {
        return cost;
    }
}
