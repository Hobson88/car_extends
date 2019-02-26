package day_1;

public class Table {
    private int height;
    private int width;
    private int length;


    Table (){
        height = 80;
        length = 60;
        width = 80;
    }

    Table(int height, int width, int length) {
        this.height = height;
        this.width = width;
        this.length = length;
    }

    @Override
    public String toString() {
        return "Stół o posiada blat wymiarach: " + width /100.+ " [m] x "+ length/100.+" [m]";
    }


    int howMuchPaint(Paint paint) {
        return calculateArea() / paint.getEfficiency();
    }

    private int calculateArea(){
        return width *length;
    }

    int calculateVolume(){
        return width *length*height;
    }

}
