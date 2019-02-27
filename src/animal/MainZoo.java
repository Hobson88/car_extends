package animal;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;

public class MainZoo {

    public static void main(String[] args) {
        Elephant elephant = elephant();
        Parrot parrot = parrot();

        Collection<Animal> animalsToEat = new ArrayList<>();

        animalsToEat.add(elephant);
        animalsToEat.add(parrot);

        for (Animal a: animalsToEat
             ) {
            a.eat();
        }

//        elephant.sayHi();
//        elephant.eat();
//        elephant.move();
//        parrot.sayHi();
//        parrot.eat();
//
//        parrot.talk();
//        elephant.stomp();
    }

    private static Parrot parrot() {
        return new Parrot("Willy");
    }

    private static Elephant elephant() {
        return new Elephant("George");
    }
}
