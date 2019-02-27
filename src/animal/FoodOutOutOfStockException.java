package animal;

public class FoodOutOutOfStockException extends RuntimeException {
    public FoodOutOutOfStockException(String message) {
        super(message);
    }

    public FoodOutOutOfStockException(String message, Throwable cause) {
        super(message, cause);
    }
}
