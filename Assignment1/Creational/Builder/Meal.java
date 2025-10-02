public class Meal {
    private String mainDish;
    private String side;
    private String drink;

    public void setMainDish(String mainDish) { this.mainDish = mainDish; }
    public void setSide(String side) { this.side = side; }
    public void setDrink(String drink) { this.drink = drink; }

    @Override
    public String toString() {
        return "Meal{" +
                "mainDish='" + mainDish + '\'' +
                ", side='" + side + '\'' +
                ", drink='" + drink + '\'' +
                '}';
    }
}