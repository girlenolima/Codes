package padraoBuilder.model;

import normal.model.Size;

import java.util.List;

public class Salad extends Meal{

    public Salad(List<String> toppings, List<String> sauces, Size size, boolean cheese, boolean pepper) {
        super(toppings, sauces, size, cheese, pepper);
    }

}
