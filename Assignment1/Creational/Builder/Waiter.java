// The Director class (optional)
public class Waiter {
    public void constructMeal(MealBuilder builder) {
        builder.buildMainDish();
        builder.buildSide();
        builder.buildDrink();
    }
}