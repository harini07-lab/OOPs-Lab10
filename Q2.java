package Lab10;
import javax.swing.*;
import java.awt.*;
import javax.sound.sampled.*;
import java.io.File;
public class Q2 extends JFrame {

    Image img;
    Clip clip;

    public Q2() {
        setTitle("Image and Audio in Swing");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Load Image
        img = Toolkit.getDefaultToolkit().getImage("picture.jpg");

        // Load and play audio
        playAudio("sound.wav");

        setVisible(true);
    }

    // Method to play audio in loop
    
    public void playAudio(String fileName) {
        try {
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(new File(fileName));
            clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.loop(Clip.LOOP_CONTINUOUSLY); // loop audio
        } catch (Exception e) {
            System.out.println("Error loading audio: " + e);
        }
    }

    // Draw image
    public void paint(Graphics g) {
        super.paint(g);
        if (img != null) {
            g.drawImage(img, 50, 80, this);
        }
    }

    public static void main(String[] args) {
        new Q2();
    }
}
