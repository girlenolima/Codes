package builder;

import classes.*;
import interfaces.MealBuilderProtocol;


public class MainDishBuilder implements MealBuilderProtocol {

    private MealBox meal = new MealBox();

    MainDishBuilder reset() {

        this.meal = new MealBox();

        return this;
    }


    @Override
    public MainDishBuilder makeMeal() {

        Meat meat = new Meat("Picanha", 60.0);
        Rice rice = new Rice("Arroz", 5.0);
        Beans beans = new Beans("Feijao", 8.0);
        this.meal.add(rice, beans, meat);

        return this;

    }

    @Override
    public MainDishBuilder makeBeverage() {
        Beverage beverage = new Beverage("Bebida", 14.0);
        this.meal.add(beverage);
        return this;
    }

    @Override
    public MainDishBuilder makeDeseert() {

        Dessert dessert = new Dessert("Bolo", 7.0);
        this.meal.add(dessert);
        return this;

    }


    //ponto final, por isso ele nao retorna o encadeamento com this na classe pricipal
    public MealBox getMeal() {

        return this.meal;

    }

    public Double getPrice(){
            return this.meal.getPrice();
    }


    @Override
    public String toString() {
        return "MainDishBuilder{" +
                "meal=" + meal +
                '}';
    }
}
