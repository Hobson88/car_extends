package animal;

public class FeedingExample {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.addAnimal(new Elephant("Johny"));
        zoo.addAnimal(new Parrot("Smith"));
        System.out.println(zoo.totalDailyFood());

        zoo.feedAnimals();
    }




}
