package np.edu.scst.swingpackaged;
import java.awt.FlowLayout;
import javax.swing.*;

public class ComboBox extends JFrame{
    ComboBox(){
        String[] countries = {"Nepal","India","China"};
        JComboBox j1 = new JComboBox();
        
        JComboBox j2 = new JComboBox(countries);
        JComboBox j3 = new JComboBox(countries);
        j3.setSelectedIndex(1);
        
        add(j1);
        add(j2);
        add(j3);
        
        setVisible(true);
        setSize(340,340);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(3);
    }
    
    public static void main(String[] args) {
        new ComboBox();
    }
}
