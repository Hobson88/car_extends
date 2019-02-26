package Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Car {
    private Collection<Part> parts;
    //zwraca PRICE  wszystkich kółek

    Car (Part... parts){
        this.parts = Arrays.asList(parts);
    }

    public int getTotalCost(){
        // Wykorzystujemy stream(). dla każdego obiektu bierzemy
      //  return parts.stream().mapToInt(parts ->parts.getPrice()).sum();

        // Inna implementacja tego z góry
        return parts.stream().mapToInt(Part::getPrice).sum();


//        int sum = 0;
//        for (Part part: parts
//             ) {
//            sum+=part.getPrice();
//        }
//        return sum;
    }

}
