public class BuilderDemo {
    public static void main(String[] args) {
        System.out.println("--- Custom Meal Builder ---");
        Waiter waiter = new Waiter();

        System.out.println("\nBuilding a Veg Meal:");
        MealBuilder vegBuilder = new VegMealBuilder();
        waiter.constructMeal(vegBuilder);
        Meal vegMeal = vegBuilder.getMeal();
        System.out.println("Veg Meal is ready: " + vegMeal);
        
    }
}