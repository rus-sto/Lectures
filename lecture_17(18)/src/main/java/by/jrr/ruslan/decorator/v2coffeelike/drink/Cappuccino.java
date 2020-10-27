package by.jrr.ruslan.decorator.v2coffeelike.drink;

public class Cappuccino extends Beverage {
public Cappuccino(){
    super(3.0);
    name="Cappuccino";
    description="hot drink based on coffee";
}

    public double getCost() {
        return cost;
    }


}
