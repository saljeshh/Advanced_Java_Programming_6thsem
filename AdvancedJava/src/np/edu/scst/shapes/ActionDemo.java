package np.edu.scst.shapes;
import javax.swing.*;
import java.awt.*;
// * only goes to awt level not event i.e insde the folder
import java.awt.event.*;


public class ActionDemo extends JFrame{
    
    ActionDemo(){
        JButton jb = new JButton("click me");
        
        jb.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                System.out.println("Hello");
            }
        });
        
        add(jb);
        
        
        setVisible(true);
        setDefaultCloseOperation(3);
        setSize(400,400);
        setTitle("Action event demo");
        setLayout(new FlowLayout());
    }
    
    //action event is defined by mouse click
    public static void main(String[] args) {
        new ActionDemo();
    }
}
