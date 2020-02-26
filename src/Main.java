import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Tic Tac Toe - Hopps");
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        int width = 720;
        int height = 719;
        frame.setPreferredSize(new Dimension(width, height + 24));


        JPanel panel = new (width, height); //put whatever type of panel we want
        panel.setFocusable(true);
        panel.grabFocus();

        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
        frame.setResizable(false);
    }
}