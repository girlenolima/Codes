package padraoBuilder.model;

import normal.model.Size;

import java.util.List;

public class Pasta extends Meal {

    public Pasta(List<String> toppings, List<String> sauces, Size size, boolean cheese, boolean pepper) {
        super(toppings, sauces, size, cheese, pepper);
    }


}
