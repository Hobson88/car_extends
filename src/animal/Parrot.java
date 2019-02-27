package animal;

public class Parrot extends Animal {

    public Parrot(String name) {
        super(name);
    }

    public void talk() {
        System.out.println("Parrot talk.");
    }

    @Override
    public void eat() {
        System.out.println("Parrot is eating.");
    }

    @Override
    public void move() {
        System.out.println("Parrot is moving");
    }

}
