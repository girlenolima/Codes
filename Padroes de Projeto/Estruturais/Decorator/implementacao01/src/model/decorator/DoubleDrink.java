package model.decorator;

import model.Drinks;

public class DoubleDrink extends  DrinakDecorator{
    public DoubleDrink(Drinks drink) {
        super(drink);
    }

    @Override
    public void serve() {
        drink.serve();
        drink.serve();
    }

    @Override
    public Double getPrice() {
        return drink.getPrice() * 1.75d;
    }
}
