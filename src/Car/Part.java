package Car;

public class Part implements PartInterface {
    protected int price;

    public Part (int price){
        this.price = price;
    }

    @Override
    public int getPrice(){
        return price;
    }



}
