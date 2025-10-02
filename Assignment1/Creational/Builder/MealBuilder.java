// The Builder interface
public interface MealBuilder {
    void buildMainDish();
    void buildSide();
    void buildDrink();
    Meal getMeal();
}