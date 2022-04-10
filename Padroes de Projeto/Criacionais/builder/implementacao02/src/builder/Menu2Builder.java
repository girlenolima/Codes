package builder;

public class Menu2Builder extends FastFoodMealBuilder {
    @Override
    public void buildDrink() {
        meal.setDrink("COCA GELADINHA 500ML");
    }

    @Override
    public void buildMain() {
        meal.setMain("HAMBURGUE DE CARNE DE SOL");
    }

    @Override
    public void buildSide() {
        meal.setSide("BATATA FRITAS");
    }

    @Override
    public void buildDessert() {
        meal.setDessert("SORVETE DE MORANGO");
    }

    @Override
    public void buildGift() {
        meal.setGift("BONECO DOS VINGADORES");
    }
}
