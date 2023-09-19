
package np.edu.scst.swingpackaged;
import javax.swing.*;
import java.awt.FlowLayout;

public class CheckBox extends JFrame{
    CheckBox(){
        JCheckBox j1 = new JCheckBox();
        JCheckBox j2 = new JCheckBox("Reading",true);
        JCheckBox j3 = new JCheckBox("Singing");
        JCheckBox j4 = new JCheckBox("Dancing");
        JCheckBox j5 = new JCheckBox("Writing");
        
        // button group vayo vane no multiple selection
//        ButtonGroup btGroup = new ButtonGroup();
//        btGroup.add(j1);
//        btGroup.add(j2);
//        btGroup.add(j3);
//        btGroup.add(j4);
//        btGroup.add(j5);
        
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
        new CheckBox();
    }
}
