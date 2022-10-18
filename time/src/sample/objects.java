package sample;

import java.awt.*;

public class objects {
    public static void main(String[] args) {
        //create new instance
        Point blank = new Point(3, 4);
        Rectangle box = new Rectangle(0, 0, 100, 200);

        System.out.println("(" + blank.x + "," + blank.y + ")");
        int sum = (blank.x * blank.x + blank.y * blank.y);
        System.out.println("\t" + sum);
        printPoint(blank);
        //findCenter(box);


    }//EO main()

    public static void printPoint(Point p) {
        System.out.println("(" + p.x + "," + p.y + ")");
    }//EO printPoint()

    public static Point findCenter(Rectangle box) {
        int x = box.x + box.width / 2;
        int y = box.y + box.width / 2;
        return new Point(x, y);
    }


}//EO objects class
