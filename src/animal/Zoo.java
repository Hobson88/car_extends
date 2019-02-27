package animal;

import java.util.ArrayList;
import java.util.Collection;

public class Zoo {
    private FoodStock foodStock = new FoodStock(10000);

    private Collection<Animal> animals = new ArrayList<>();

    public void addAnimal (Animal animal){
        animals.add(animal);
    }

    public Zoo(Collection<Animal> animals) {
        this.animals = animals;
    }

    public Zoo() {
    }

    public void feedAnimals(){
        animals.forEach(animal -> animal.eat(foodStock));
    }

    public int totalDailyFood(){
        return animals.stream().mapToInt(animal -> animal.dailyFood()).sum();
    }



}
