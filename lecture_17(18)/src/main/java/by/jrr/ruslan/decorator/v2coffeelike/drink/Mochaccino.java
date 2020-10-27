package by.jrr.ruslan.decorator.v2coffeelike.drink;

public class Mochaccino extends Beverage {
public Mochaccino(){
    super(3.0);
    name="Mochaccino";
    description="hot drink based on tea";
}


    public double getCost() {
        return cost;
    }
 
}
