package classes;


import interfaces.MealCompositeProtocol;

import java.util.ArrayList;



//usando padrao compsite, logo depois sera usado o Builder
public class MealBox implements MealCompositeProtocol {


    ArrayList<MealCompositeProtocol> child = new ArrayList();

    @Override
    public Double getPrice() {

        Double somatoria = 0.0;

        for (MealCompositeProtocol elemento : child) {

            somatoria += elemento.getPrice();
        }

        return somatoria;
    }

    @Override
    public String getName() {
        return null;

    }

    //Usando operador spread podemos receber um ou varios argumentos do mesmo tipo
    public void add(MealCompositeProtocol ... meal) {


        for (MealCompositeProtocol elemento : meal) {

            this.child.add(elemento);

        }

    }



}
