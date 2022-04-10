package model.decorator;

import model.Drinks;

public class MIlk extends  DrinakDecorator{

    public MIlk(Drinks drink) {
        super(drink);
    }

    @Override
    public void serve() {
        drink.serve();
        System.out.println("- Adding 30ml of milk");
    }

    @Override
    public Double getPrice() {
        return drink.getPrice() + 0.5d;
    }
}
