
package np.edu.scst.exampractise;

import javax.swing.*;
import java.awt.*;

public class GraphicsDemo extends JFrame{
    GraphicsDemo(){
//        JLabel j1 = new JLabel("Hellow World");
//        j1.setForeground(Color.red);
        
        JPanel jp = new JPanel(){
            @Override
            public void paintComponent(Graphics g){
                Graphics2D g2 = (Graphics2D) g.create();
                int[] starx = {200,150,0,150,200,250,400,250};
                int[] stary = {0,100,120,180,300,180,120,100};
                
                g2.drawPolygon(starx,stary,8);
                
            
            }
            
            
        };
        
        add(jp);
//        add(j1);
                
                      setVisible(true);
            setSize(600,600);
            setDefaultCloseOperation(3);
            
    }
    
    public static void main(String[] args) {
        new GraphicsDemo();
    }
}
