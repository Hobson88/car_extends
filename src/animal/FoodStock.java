package animal;

public class FoodStock {
    private int food;

    public FoodStock(int food) {
        this.food = food;
    }

    /**
     * Takes some food out of the stock.
     *
     * @param amount the amount of food to take
     * @throws FoodOutOutOfStockException if there's not enough food in stock
     */
    public void take(int amount) throws FoodOutOutOfStockException {
        if (food < amount)
            throw new FoodOutOutOfStockException("There's not enough food in the stock");
        this.food -= amount;
        System.out.println("Pozostało jedzenia: " + food);
    }
}
