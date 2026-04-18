package Lab10;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Q6 extends JPanel implements KeyListener, ActionListener {
    private String text = "";
    private int x;
    private Timer timer;

    public Q6() {
        setFocusable(true);
        addKeyListener(this);
        // Start position (right side)
        x = 400;
        // Timer for animation (speed control)
        timer = new Timer(50, this);
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setFont(new Font("Arial", Font.BOLD, 24));
        g.drawString(text, x, 100);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Move text left
        x -= 5;
        // Reset position when text goes out of screen
        if (x + getFontMetrics(getFont()).stringWidth(text) < 0) {
            x = getWidth();
        }

        repaint();
    }

    // KeyListener methods
    @Override
    public void keyTyped(KeyEvent e) {
        text += e.getKeyChar(); // Add typed character
    }

    @Override
    public void keyPressed(KeyEvent e) {}

    @Override
    public void keyReleased(KeyEvent e) {}

    public static void main(String[] args) {
        JFrame frame = new JFrame("Moving Text Demo");
        Q6 panel = new Q6();
        frame.add(panel);
        frame.setSize(500, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
