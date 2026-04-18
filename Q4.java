package Lab10;

import javax.swing.*;
import java.awt.*;

public class Q4 extends JFrame {

    int size = 6;
    boolean increasing = true;

    public Q4() {
        setTitle("Expanding & Collapsing Text");
        setSize(600, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        AnimationPanel panel = new AnimationPanel();
        add(panel);

        // Timer for animation
        Timer timer = new Timer(100, e -> {
            if (increasing) {
                size += 2;
                if (size >= 96) {
                    increasing = false;
                }
            } else {
                size -= 2;
                if (size <= 6) {
                    increasing = true;
                }
            }
            panel.repaint();
        });

        timer.start();
        setVisible(true);
    }

    class AnimationPanel extends JPanel {

        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            // Set dynamic font size
            Font font = new Font("Arial", Font.BOLD, size);
            g.setFont(font);

            String text = "HELLO";

            // Center the text
            FontMetrics fm = g.getFontMetrics();
            int x = (getWidth() - fm.stringWidth(text)) / 2;
            int y = getHeight() / 2;

            g.drawString(text, x, y);
        }
    }

    public static void main(String[] args) {
        new Q4();
    }
}
