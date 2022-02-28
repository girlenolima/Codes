package abstracts;

import interfaces.MealCompositeProtocol;

public class AbstractMeal implements MealCompositeProtocol {

    String name;
    Double price;

    public AbstractMeal(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public Double getPrice() {

        return price;
    }

    @Override
    public String getName() {
        return name;
    }

}
