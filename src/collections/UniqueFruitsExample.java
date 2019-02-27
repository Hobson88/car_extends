package collections;

import com.sun.javafx.collections.MappingChange;

import java.util.*;

public class UniqueFruitsExample {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("orange","apple","orange","banana","pineapple","raspberry","pineapple");
        Set<String> fruitTypes = new HashSet<>(fruits);

        System.out.println(fruitTypes);


    }
}
