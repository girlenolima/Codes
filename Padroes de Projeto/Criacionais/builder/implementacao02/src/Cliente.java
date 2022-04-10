import builder.FastFoodMealBuilder;
import builder.Menu1Builder;
import director.MealDirector;
import model.FastFoodMeal;

public class Cliente {


    public static void order(String name, FastFoodMealBuilder builder) {

        System.out.println("Ordering a " + name);
        MealDirector director = new MealDirector(builder);
        director.constructCombo();
        System.out.println(director.getCombo());

        System.out.println("---------------------------------");
    }

    public static void main(String[] args) {

        order("BURGUER", new Menu1Builder());


    }


}
