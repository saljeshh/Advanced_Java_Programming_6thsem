package np.edu.scst.swingpackaged;
import javax.swing.*;
import java.awt.FlowLayout;


public class ProgressBar extends JFrame{
    
    ProgressBar(){
        JProgressBar jb1 = new JProgressBar();
        JProgressBar jb2 = new JProgressBar(0);
        JProgressBar jb3 = new JProgressBar(1);
        JProgressBar jb4 = new JProgressBar(0);
        jb4.setValue(80);
        jb4.setStringPainted(true);
        JProgressBar jb5 = new JProgressBar(1,0,100);
        
        add(jb1);
        add(jb2);
        add(jb3);
        add(jb4);
        add(jb5);
               
        setVisible(true);
        setLayout(new FlowLayout());
        setSize(500,500);
        setDefaultCloseOperation(3);
    }
    
    public static void main(String[] args) {
        new ProgressBar();
    }
}
