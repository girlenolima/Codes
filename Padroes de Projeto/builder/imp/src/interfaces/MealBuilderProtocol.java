package interfaces;

import builder.MainDishBuilder;

public interface MealBuilderProtocol  {

    MainDishBuilder makeMeal();
    MainDishBuilder makeBeverage();
    MainDishBuilder makeDeseert();



}
