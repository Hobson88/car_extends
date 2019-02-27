package animal;

public class FeedingExample {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        Zoo<Parrot> zoo = new Zoo(new FoodStock(108));
        //zoo.addAnimal(new Elephant("Johny"));
        zoo.addAnimal(new Parrot("Smith"));
        System.out.println("Zwierzęta dziennie zjadają: " + zoo.totalDailyFood());

        zoo.feedAnimals();
    }
}
