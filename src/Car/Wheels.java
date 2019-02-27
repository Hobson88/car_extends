package Car;

public class Wheels extends BasePart {
    private int numberOfWheels;
    public Wheels(int price, int numberOfWheels) {
        super(price);
        this.numberOfWheels = numberOfWheels;
    }

    @Override
    public int getPrice() {
        return super.getPrice()*numberOfWheels;
    }
}
