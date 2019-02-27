package animal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.ToIntFunction;

public class Zoo<T extends Animal> {
    private FoodStock foodStock;
    private Collection<T> animals = new ArrayList<>();
    
    public Zoo(Collection<T> animals, FoodStock foodStock) {
        this.animals = animals;
        this.foodStock = foodStock;
    }

    public Zoo(FoodStock foodStock) {
        this.foodStock = foodStock;
    }

    public void addAnimal(T animal) {
        animals.add(animal);
    }

    public void feedAnimals() {
        for (T animal :
                animals) {
            try {
                animal.eat(foodStock);
            } catch (FoodOutOutOfStockException e) {
                // TODO: send sms to the zoo keeper
                sendAlarmSms();
            }
        }
        // this is equivalent to
        // animals.forEach(animal -> animal.eat(foodStock));
    }

    private void sendAlarmSms() {
        System.out.println("Not enough food - sending a message to the zoo keeper");
    }

    public int totalDailyFood() {
        int sum = 0;
        for (Animal animal : animals
        ) {
            sum += animal.dailyFood();
        }
        return sum;
        // this is equivalent to
        // return animals.stream().mapToInt(Animal::dailyFood).sum();
    }

}
