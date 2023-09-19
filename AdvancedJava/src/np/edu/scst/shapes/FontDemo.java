package np.edu.scst.shapes;

import javax.swing.*;
import java.awt.*;
import static java.awt.font.TextAttribute.FONT;

public class FontDemo extends JFrame{
    FontDemo(){
        // font-family: Serif sansSerif Dialog DialogInput MOnospace
        // font style: Plain bold italic
        JLabel j1 = new JLabel("LEVEL 1");
        JLabel j2 = new JLabel("LEVEL 2");
        JLabel j3 = new JLabel("LEVEL 3");
        JLabel j4 = new JLabel("LEVEL 4");
        JLabel j5 = new JLabel("LEVEL 5");
        
        j1.setFont(new Font(Font.SERIF, Font.PLAIN, 10));
        j2.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 12));
        j3.setFont(new Font(Font.DIALOG, Font.ITALIC, 14));
        j4.setFont(new Font(Font.DIALOG_INPUT, Font.BOLD|Font.ITALIC, 16));
        j5.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 8));
        
        add(j1);
        add(j2);
        add(j3);
        add(j4);
        add(j5);
        
        setVisible(true);
        setDefaultCloseOperation(3);
        setSize(400,400);
        setLayout(new FlowLayout());
        
    }
    
    public static void main(String[] args) {
        new FontDemo();
    }
}
