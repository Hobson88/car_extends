package animal;

public class Parrot extends Animal {

    @Override
    int dailyFood() {
        return 9;
    }

    public Parrot(String name) {
        super(name);
    }

    public void talk() {
        System.out.println("Parrot talk.");
    }

    @Override
    public void move() {
        System.out.println("Parrot is moving");
    }

    @Override
    protected String presentYourself() {
        return "I am parrot.";
    }

}
