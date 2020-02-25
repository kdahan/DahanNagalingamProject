import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Main {

    public Main(){


    }

    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;

    }

    public static void main(String[] args) {
        //The JFrame class represents the window that holds the graphics
        JFrame window = new JFrame("tristan did nothing and kyle and keren did it all! :D");
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setBounds(0, 0, 800, 800 + 22); //(x, y, w, h) 22 due to title bar.

        Main panel = new Main(600, 800);

        panel.setFocusable(true);
        panel.grabFocus();

        window.add(panel);
        window.setVisible(true);
        window.setResizable(false);
    }


}
