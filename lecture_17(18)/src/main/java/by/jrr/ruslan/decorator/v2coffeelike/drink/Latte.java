package by.jrr.ruslan.decorator.v2coffeelike.drink;

public class Latte extends Beverage {
public Latte(){
    super(3.0);
       name="Latte";
    description="hot drink based on coffee";
}


    public double getCost() {
        return cost;
    }

}
