package Lab10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Q3 extends JFrame {

    int x1, y1, x2, y2;

    public Q3() {
        setTitle("Draw with Mouse");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        DrawingPanel panel = new DrawingPanel();
        add(panel);

        setVisible(true);
    }

    class DrawingPanel extends JPanel {

        public DrawingPanel() {

            // Mouse Pressed
            addMouseListener(new MouseAdapter() {
                public void mousePressed(MouseEvent e) {
                    x1 = e.getX();
                    y1 = e.getY();
                }
            });

            // Mouse Dragged
            addMouseMotionListener(new MouseMotionAdapter() {
                public void mouseDragged(MouseEvent e) {
                    x2 = e.getX();
                    y2 = e.getY();

                    Graphics g = getGraphics();
                    g.drawLine(x1, y1, x2, y2);

                    x1 = x2;
                    y1 = y2;
                }
            });
        }
    }

    public static void main(String[] args) {
        new Q3();
    }
}