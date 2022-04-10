package model.decorator;

import model.Drinks;

public abstract class DrinakDecorator  implements Drinks {

    protected Drinks drink;

    public DrinakDecorator(Drinks drink) {
        this.drink = drink;
    }


}
