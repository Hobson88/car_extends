package animal;

public class Elephant extends Animal {

    public Elephant(String name) {
        super(name);
    }

    public void stomp() {
        System.out.println("Elephant stomp.");
    }

    @Override
    public void sayHi() {
        super.sayHi();
        System.out.println("and I am elephant.");
    }

    @Override
    public void eat() {
        System.out.println("Elephant "+name+" is eating.");
    }

    @Override
    public void move() {
        stomp();
//        System.out.println("Elephant is moving.");
    }
}
