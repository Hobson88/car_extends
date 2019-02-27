package Car;

public class BasePart implements Part {
    protected int price;

    public BasePart(int price) {
        this.price = price;
    }



    @Override
    public int getPrice() {
        return price;
    }


}
