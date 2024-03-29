package sample;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.logging.Handler;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Gui extends JFrame {

    private JButton reg;
    private JButton custom;

    public Gui() {
        super("The title");
        setLayout(new FlowLayout());

        reg = new JButton("reg");
        add(reg);

        Icon b = new ImageIcon(getClass().getResource("python.jpg"));
        Icon x = new ImageIcon(getClass().getResource("nature.png"));
        custom = new JButton("custom", b);
        custom.setRolloverIcon(x);

        HandlerClass handler = new HandlerClass();
        reg.addActionListener(handler);
        custom.addActionListener(handler);
    }

    public void getDefaultCloseOperation(int exitOnClose) {
    }

    class HandlerClass implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            JOptionPane.showMessageDialog(null, String.format("%s", event.getActionCommand()));
        }
    }


}


