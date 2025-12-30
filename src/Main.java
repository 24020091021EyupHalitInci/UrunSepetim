import javax.swing.*;

public class Main {
    static void main(String[] args) {
        JFrame frame = new JFrame("Urun Sepetim");
        Menu menuForm = new Menu();
        frame.setContentPane(menuForm.getMainPanel());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(800,600);
        frame.setVisible(true);
    }
}
