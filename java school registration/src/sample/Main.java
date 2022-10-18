package sample;


import javax.swing.JFrame;

class Main {
    public static void main(String[] args) {

        Gui go = new Gui();
        go.getDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        go.setSize(300, 200);
        go.setVisible(true);
    }
}