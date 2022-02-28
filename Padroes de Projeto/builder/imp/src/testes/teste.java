package testes;

import builder.MainDishBuilder;
import classes.*;

public class teste {


    public static void main(String[] args) {

        //Exemplo de objeto complexo de se criar, o mealbox precisa de varios outros.
       /* Beans beans = new Beans("Feijao",8.0);
        Beverage beverage = new Beverage("Cerveja",7.0);
        Dessert dessert = new Dessert("Bolo",6.0);
        Meat meat = new Meat("Picanha",60.0);
        Rice rice = new Rice("arroz",5.0);

        MealBox mealBox = new MealBox();
        mealBox.add(beans,beverage,dessert,meat,rice);

        System.out.println(mealBox.getPrice());*/

        //Apos implementar padrao builder

        MainDishBuilder mainDishBuilder = new MainDishBuilder();
        mainDishBuilder.makeMeal()
                .makeDeseert()
                        .makeBeverage();

        System.out.println(mainDishBuilder.toString());
        System.out.println(mainDishBuilder.getPrice());
        System.out.println(mainDishBuilder.getMeal().getPrice());


    }
}
