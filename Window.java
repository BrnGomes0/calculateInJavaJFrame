import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {
    // Constructor
    public Window(String title){
        super(title);
        this.setSize(450, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false); // Can't change a position of window
        this.setLayout(null); // Can change the components in window
        this.setBackground(new Color(0,0,0));
        this.setVisible(true);
    }
}
