package animal;

public class FoodStock {
    private int food;

    public FoodStock(int food) {
        this.food = food;
    }

    public void take(int amount) {
        this.food -= amount;
        System.out.println(food);
    }
}
