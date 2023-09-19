package np.edu.scst.lab2;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyEventLab extends JFrame{
    KeyEventLab(){
        JTextField field = new JTextField(5);
        field.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                System.out.println(e.getKeyChar() + " key typed");
            }

            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println(e.getKeyChar() + " key pressed");
            }

            @Override
            public void keyReleased(KeyEvent e) {
                System.out.println(e.getKeyChar() + " key released.");
            }
        });

        add(field);

        setVisible(true);
        setSize(500,500);
        setDefaultCloseOperation(3);
        setTitle("Key Events");
    }

    public static void main(String[] args) {
        new KeyEventLab();
    }
}
