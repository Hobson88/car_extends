package animal;

public class Elephant extends Animal {

    @Override
    int dailyFood() {
        return 100;
    }

    public Elephant(String name) {
        super(name);
    }

    public void stomp() {
        System.out.println("Elephant stomp.");
    }

    @Override
    protected String presentYourself() {
        return "I am elephant.";
    }

    @Override
    public void move() {
        stomp();
//        System.out.println("Elephant is moving.");
    }
}
