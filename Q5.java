package Lab10; 
import javax.swing.*;
import java.awt.*;
public class Q5 extends JFrame {
    public Q5() {
        setTitle("Font Styles Demo");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        add(new FontPanel());
        setVisible(true);
    }
    class FontPanel extends JPanel {
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            String name = "Harini Mehta"; 

            // Style 1: Plain, Small Size
            Font font1 = new Font("Serif", Font.PLAIN, 20);
            g.setFont(font1);
            g.drawString(name, 50, 100);

            // Style 2: Bold, Medium Size
            Font font2 = new Font("SansSerif", Font.BOLD, 40);
            g.setFont(font2);
            g.drawString(name, 50, 180);

            // Style 3: Italic, Large Size
            Font font3 = new Font("Monospaced", Font.ITALIC, 60);
            g.setFont(font3);
            g.drawString(name, 50, 280);
        }
    }

    public static void main(String[] args) {
        new Q5();
    }
}
