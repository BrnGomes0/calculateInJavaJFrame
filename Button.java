import javax.swing.*;
import java.awt.*;
public class Button extends JButton{
        // Constructor
        public Button(String title, int x, int y, int size, int height, int rgb01, int rgb02, int rgb03, int rgb04, int rgb05, int rgb06){
            super(title);
            this.setBounds(x, y, size, height);
            this.setBackground(new Color(rgb01, rgb02, rgb03));
            this.setFont(new Font("Arial", Font.BOLD, 20));
            this.setForeground(new Color(rgb04, rgb05, rgb06));
            this.setBorderPainted(false);
            this.setContentAreaFilled(false);
            this.setOpaque(true);
        }
}
