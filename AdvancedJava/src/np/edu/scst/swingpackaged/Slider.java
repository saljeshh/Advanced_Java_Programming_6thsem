
package np.edu.scst.swingpackaged;
import javax.swing.*;
import java.awt.FlowLayout;

public class Slider extends JFrame{
    
    Slider(){
        JSlider s1 = new JSlider();
        JSlider s2 = new JSlider(0);
        JSlider s3 = new JSlider(1);// vertical
        JSlider s4 = new JSlider(0,10,3);// 0-10; 3 selected
        JSlider s5 = new JSlider(1,0,10,7);// vertical , 0-10, 7 selected
        
        add(s1);
        add(s2);
        add(s3);
        add(s4);
        add(s5);
        
        setVisible(true);
        setLayout(new FlowLayout());
        setSize(500,500);
        setDefaultCloseOperation(3);
    }
    
    public static void main(String[] args) {
        new Slider();
    }
}
