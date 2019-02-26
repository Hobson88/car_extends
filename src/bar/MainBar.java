package bar;

public class MainBar {

    public static void main(String[] args) {
        Bar bar = new CocobonoBar();
        Drink drink = bar.order(MenuItem.BEER);

        drink.drink("Grażyna");



    }
}
