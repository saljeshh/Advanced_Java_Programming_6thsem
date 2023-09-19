package np.edu.scst.lab2;
import javax.swing.*;
import java.awt.*;
// wap to display the various font families and styles in a swing application

public class Q1 extends JFrame{

    Q1(){

        JLabel j1 = new JLabel("Font");
        JLabel j2 = new JLabel("Family");
        JLabel j3 = new JLabel("Demo");

        j1.setFont(new Font(Font.SERIF, Font.PLAIN, 10));
        j2.setFont(new Font(Font.DIALOG_INPUT, Font.ITALIC, 20));
        j3.setFont(new Font(Font.MONOSPACED, Font.BOLD, 30));


        add(j1);
        add(j2);
        add(j3);

        setSize(500,500);
        setTitle("Font Family Demo");
        setDefaultCloseOperation(3);
        setVisible(true);
        setLayout(new FlowLayout());
    }

    public static void main(String[] args) {
        new Q1();
    }
}
