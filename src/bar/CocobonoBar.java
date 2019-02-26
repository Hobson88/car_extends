package bar;

public class CocobonoBar implements Bar {

    @Override
    public Drink order(MenuItem drink) {
        switch (drink) {
            case TEA:
                return new Tea();
            case BEER:
                return new Beer();
            case MOJITO:
                return new Mohito();
            default:
                throw new IllegalArgumentException("Drink type z poza danych.");
        }

    }
}
