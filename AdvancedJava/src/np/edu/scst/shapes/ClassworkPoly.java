package np.edu.scst.shapes;
import java.awt.*;
import javax.swing.*;

public class ClassworkPoly extends JFrame{
    ClassworkPoly(){
        
        JPanel jp = new JPanel(){
            @Override
            public void paintComponent(Graphics g){
                // (Graphics2D) type casting from graphics to 2d
                Graphics2D g2 = (Graphics2D) g.create();
                
                //making trinalge using line
                g2.drawLine(350, 180, 350, 350);//ab
                g2.drawLine(350,350,180,350);//bc
                g2.drawLine(180,350,350,180);//ca
                
                
                // making trinalge usins draw poly
                // (400,100) (400,400) (100,400)
                int[] triX = {400,400,100};
                int[] triY = {100,400,400};
                
                g2.drawPolygon(triX,triY,3);
            }
        };
        
        add(jp);
        
        setVisible(true);
        setSize(700,700);
        setDefaultCloseOperation(3);
    }
    
    
    public static void main(String[] args) {
        new ClassworkPoly();
    }
}
