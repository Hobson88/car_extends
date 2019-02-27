package Car;

import java.util.Arrays;
import java.util.Collection;

public class Car {
    private Collection<Part> parts;
    //zwraca PRICE  wszystkich kółek

    Car(BasePart... baseParts) {
        this.parts = Arrays.asList(baseParts);
    }

    public int getTotalCost() {
        // Wykorzystujemy stream(). dla każdego obiektu bierzemy
        // return parts.stream().mapToInt(parts ->parts.getPrice()).sum();

        // Inna implementacja tego z góry
        //return parts.stream().mapToInt(BasePart::getPrice).sum();


        int sum = 0;
        for (Part part : parts
        ) {
            sum += part.getPrice();
        }
        return sum;
    }

}
