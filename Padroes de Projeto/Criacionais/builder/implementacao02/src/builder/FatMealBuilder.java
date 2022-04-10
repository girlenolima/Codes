package builder;

public class FatMealBuilder extends FastFoodMealBuilder{


    @Override
    public void buildDrink() {
        meal.setDrink("COCA COLA GELADINHA 1 LITRO  (CASCO DE VIDRO)");

    }

    @Override
    public void buildMain() {
        meal.setMain("HAMBURGUER TRIPLO DE CHEDAR COM BACON");
    }

    @Override
    public void buildSide() {
        meal.setSide("ANEIS DE CEBOLA FRITOS");
    }

    @Override
    public void buildDessert() {
        meal.setDessert("SORVETE DE CHOCOLATE");
    }

    @Override
    public void buildGift() {
        meal.setGift("PERSONAGEM DO DRAGAO BALL");

    }
}
