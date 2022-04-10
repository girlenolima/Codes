import model.Drinks;
import model.Expresso;
import model.Tea;
import model.decorator.DoubleDrink;
import model.decorator.MIlk;

public class Cliente {


    public static void order(String name, Drinks drink){

        System.out.println("Ordering a " + name);
        drink.serve();
        System.out.println(drink.getPrice());
        System.out.println("-------------------------------------");


    }


    public static void main(String[] args) {

        order("Expresso", new Expresso());
        order("Tea", new Tea());
        order("Lungo", new DoubleDrink(new Expresso()));
        order("Cafe Au Lait", new MIlk(new Expresso()));
        order("English Tea", new MIlk(new DoubleDrink(new Tea())));



    }



}
