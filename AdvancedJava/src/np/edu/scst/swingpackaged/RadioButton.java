
package np.edu.scst.swingpackaged;
import java.awt.FlowLayout;
import javax.swing.*;

public class RadioButton extends JFrame {
    
    RadioButton(){
        JRadioButton j1 = new JRadioButton();
        JRadioButton j2 = new JRadioButton("test");
        JRadioButton j3 = new JRadioButton("test2",true);
        JRadioButton j4 = new JRadioButton("male");
        JRadioButton j5 = new JRadioButton("female");
        
        ButtonGroup btGroup = new ButtonGroup();
        btGroup.add(j1);
        btGroup.add(j2);
        btGroup.add(j3);
        btGroup.add(j4);
        btGroup.add(j5);
        
        add(j1);
        add(j2);
        add(j3);
        add(j4);
        add(j5);
        
        
        setVisible(true);
        setLayout(new FlowLayout());
        setSize(500,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args) {
        new RadioButton();
    }
}
