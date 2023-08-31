import javax.swing.*;
import java.awt.*;

public class Display extends JTextField {
    // Constructor
    public Display(int rgb01, int rgb02, int rgb03){
        this.setBounds(0,0, 320, 150);
        this.setBackground(new Color(rgb01, rgb02, rgb03));
        this.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(68,68,68)));
        this.setForeground(new Color(255, 255, 255));
        this.setFont(new Font("Calibri", 0, 50));
        this.setEditable(false);
    }
}