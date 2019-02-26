package day_1;

import day_1.Paint;
import day_1.Table;

public class Main {

    public static void main(String[] args) {

        Paint redPaint = new Paint(2);
        Paint greenPaint = new Paint(3);

        Table table01 = new Table();
        Table table02 = new Table (85, 100,220);
        System.out.println(table01);
        System.out.println(table02.calculateVolume());

        System.out.println(table01.howMuchPaint(redPaint));
        System.out.println(table01.howMuchPaint(greenPaint));

    }
}
