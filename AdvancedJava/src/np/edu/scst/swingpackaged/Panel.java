package np.edu.scst.swingpackaged;
import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.Color;

public class Panel extends JFrame{
    
    Panel(){
        JPanel jp1 = new JPanel();
        //JPanel jp2 = new JPanel(new FlowLayout());
        jp1.setBackground(Color.red);
        
        
        add(jp1);
        JLabel jb1 = new JLabel("Hello");
        jp1.add(jb1);


        
        setVisible(true);
        //setLayout(new FlowLayout());
        setSize(500,500);
        setDefaultCloseOperation(3);
    }
    
    public static void main(String[] args) {
        new Panel();
    }
}
