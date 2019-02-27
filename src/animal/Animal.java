package animal;

public abstract class Animal {
    protected String name;

    abstract int dailyFood();

    public Animal(String name) {
        this.name = name;
    }

    public void eat(FoodStock foodStock) {
        foodStock.take(dailyFood());
    }

    public abstract void move();

    public void sayHi() {
        System.out.println("Hello, my name is: " + name + ". " + presentYourself());
    }

    protected abstract String presentYourself();

}
