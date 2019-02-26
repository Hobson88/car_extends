package Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Engine engine = new Engine(5500);
        Body body = new Body(200);
        List<Wheel> wheels = new ArrayList<>();

        wheels.add(new Wheel(100));
        wheels.add(new Wheel(105));
        wheels.add(new Wheel(122));
        wheels.add(new Wheel(144));

        Car car = new Car(engine,body, wheels);

        System.out.println("Całkowity koszt samochodu wynosi: " + car.getTotalCost()+" zł.");
    }
}
