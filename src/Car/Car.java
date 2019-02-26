package Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Car {
    private Engine engine;
    private Body body;
    private List<Wheel> wheels;

    public Car(Engine engine, Body body, List<Wheel> wheels) {
        this.engine = engine;
        this.body = body;
        this.wheels = wheels;
    }
    //zwraca PRICE  wszystkich kółek
    private int sumWheels() {
        int sum = 0;
        for (Wheel w : wheels) {
            sum += w.getPrice();
        }
        return sum;
    }

    int getTotalCost() {
        return (engine.getPrice() + body.getPrice() + wheels.get(0).getPrice() + wheels.get(1).getPrice() + wheels.get(2).getPrice() + wheels.get(3).getPrice());
    }
}
