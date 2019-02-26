package Car;



/**
 * Konstruktor zawierający jeden parametr - jego cenę
 *
 *  @author Robert Krawczak
 * Jazda jazda {@link Car} najczęściej używany w tejże klasie.
 */


public class Body {
    private int price;


    public Body(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
