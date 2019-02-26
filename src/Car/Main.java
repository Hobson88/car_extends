package Car;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Engine engine = new Engine(1999);
        Body body = new Body(4699);
        Wheels wheels = new Wheels(299,4);
        Car car = new Car(engine, body, wheels);
        System.out.println("Całkowity koszt samochodu wynosi: " + car.getTotalCost()+" zł.");
    }
}
