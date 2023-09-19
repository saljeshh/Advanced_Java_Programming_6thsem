package np.edu.scst.layout;

import javax.swing.*;
import java.awt.*;

public class FlowDemo extends JFrame{
    FlowDemo(){
        //layout = arrangement of components
        JLabel jLabel = new JLabel("Hello 1");
        JLabel jLabel2 = new JLabel("Hello 2");
        
        add(jLabel);
        add(jLabel2);
        
        //flow layout makes sure that the component stay near the center
        setLayout(new FlowLayout());
        setVisible(true);
        setTitle("Flow layout demo");
        setSize(500,500);
        setDefaultCloseOperation(3);
    }
    
    public static void main(String[] args) {
        new FlowDemo();
    }
}
