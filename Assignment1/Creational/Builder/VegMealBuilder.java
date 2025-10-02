// A Concrete Builder
public class VegMealBuilder implements MealBuilder {
    private Meal meal = new Meal();

    @Override
    public void buildMainDish() {
        meal.setMainDish("Veggie Burger");
    }

    @Override
    public void buildSide() {
        meal.setSide("Fries");
    }

    @Override
    public void buildDrink() {
        meal.setDrink("Coke");
    }

    @Override
    public Meal getMeal() {
        return meal;
    }
}