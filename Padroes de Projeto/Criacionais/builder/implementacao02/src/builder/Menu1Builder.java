package builder;

public class Menu1Builder extends FastFoodMealBuilder {
    @Override
    public void buildDrink() {
        meal.setDrink("COCA GELADINHA 500ML");
    }

    @Override
    public void buildMain() {
        meal.setMain("X-TUDO");
    }

    @Override
    public void buildSide() {
        meal.setSide("BATATA FRITAS");
    }

    @Override
    public void buildDessert() {
        meal.setDessert("COCADA");
    }

    @Override
    public void buildGift() {
        meal.setGift("BONECO DOS TRANSFORMES");
    }
}
