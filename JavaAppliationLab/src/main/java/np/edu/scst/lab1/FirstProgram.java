package np.edu.scst.lab1;

import javax.swing.*;
import java.awt.*;

public class FirstProgram  extends JFrame{
    FirstProgram(){
        
        JPanel jp = new JPanel(){
            @Override
            public void paintComponent(Graphics g){
                Graphics2D g2 = (Graphics2D) g.create();
                
               int[] starX = {200,150,0,150,200,250,400,250};
               int[] starY = {0,100,120,180,300,180,120,100};
               
               g2.drawPolygon(starX, starY,8);
            }
        };
        
        add(jp);
        
        
        setVisible(true);
        setSize(500,500);
        setTitle("Hello world JLabel");
        setDefaultCloseOperation(3);
    }
    
    public static void main(String[] args) {
        new FirstProgram();
    }
}
