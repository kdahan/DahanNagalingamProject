import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class Canvas extends JPanel{

    private int width;
    private int height;

    public Canvas(int w, int h){
        width = w;
        height = h;
        setSize(width, height);

        addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {

            }

            @Override
            public void mouseMoved(MouseEvent e) {

            }
        });

    }


}
