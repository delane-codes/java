package MobileApps;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class droid1 {
    private JButton button1;
    private JPanel panel1;

    public droid1() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

            }
        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
        button1.setSize(20,20);
        button1.reshape(10,10,10,10);
    }
}
