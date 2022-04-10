package normal;

import normal.model.Pasta;
import normal.model.Size;

import java.util.ArrayList;
import java.util.Arrays;

public class Cliente {

    public static void main(String[] args) {

        Pasta pasta = new Pasta(Size.LARG);
        System.out.println(pasta);

        Pasta pasta2 = new Pasta(Arrays.asList("Bancon","Brocoli"),Arrays.asList("Tomato"),Size.SMALL,true);
        System.out.println(pasta2);
    }


}
