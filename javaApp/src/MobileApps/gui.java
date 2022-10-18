package MobileApps;

import javax.swing.*;
import java.awt.*;

public class gui extends JFrame {

    private JLabel item1;

    public gui(){
        super("title b");
        setLayout(new FlowLayout());

        item1 = new JLabel("this hover");
        item1.setToolTipText("hovered");
        add(item1);
    }
}
