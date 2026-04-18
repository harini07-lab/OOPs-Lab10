package Lab10;
import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Q1 extends JFrame {

    JLabel clockLabel;

    public Q1() {
        setTitle("Digital Clock");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        clockLabel = new JLabel();
        clockLabel.setFont(new Font("Arial", Font.BOLD, 20));
        clockLabel.setHorizontalAlignment(JLabel.CENTER);

        add(clockLabel);

        // Timer to update clock every second
        Timer timer = new Timer(1000, e -> updateClock());
        timer.start();

        setVisible(true);
    }

    // Method to update date and time
    public void updateClock() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        String currentTime = sdf.format(new Date());
        clockLabel.setText(currentTime);
    }

    public static void main(String[] args) {
        new Q1();
    }
}