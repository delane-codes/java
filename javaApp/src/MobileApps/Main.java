package MobileApps;
import javax.swing.*;

abstract class Triangle{

    public Triangle() {
        super();
    }
}




public class Main {
    public static void main(String[] args) {
        gui ui = new gui();//create obj
        droid1 droid = new droid1();
        ui.setVisible(true);
        ui.setSize(400, 300);
        ui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//terminate
    }
}
