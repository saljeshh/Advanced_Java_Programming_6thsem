package np.edu.scst.swingpackaged;
import java.awt.FlowLayout;
import javax.swing.*;

public class Table extends JFrame{
    Table(){
        
        String[] heading = {"Name","Age"};
        String[][] body = {{"saljesh","21"},{"Aney","21"}};
        
        
        JTable table = new JTable(body,heading);
//        JScrollPane jscrollpane = new JScrollPane(table); // fixing bug of above table , swing ko bug
//        add(jscrollpane);

add(table);
        
        setVisible(true);
        setSize(340,340);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(3);
    }
    
    public static void main(String[] args) {
        new Table();
    }
}
