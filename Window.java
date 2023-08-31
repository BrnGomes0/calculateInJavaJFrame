import javax.swing.*;
import java.awt.*;
public class Window extends JFrame {
    //Constructor
    public Window(String title, int rgb01, int rgb02, int rgb03){
        super(title);
        this.setSize(320, 600); // Size the window
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(new Color(rgb01, rgb02, rgb03));
        this.setResizable(false); // Can't change position the window
        this.setLocationRelativeTo(null); // The window go quite the Screen
        this.setLayout(null);
        this.setVisible(true);
    }
}