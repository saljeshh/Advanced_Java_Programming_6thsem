/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package np.edu.scst.shapes;
import javax.swing.*;
import java.awt.*;

public class DesktopPaneExample extends JFrame {
    private JDesktopPane desktopPane;

    public DesktopPaneExample() {
        setTitle("Desktop Pane Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setVisible(true);

        desktopPane = new JDesktopPane();

        JInternalFrame internalFrame1 = new JInternalFrame("Internal Frame 1", true, true, true, true);
        internalFrame1.setSize(200, 150);
        internalFrame1.setLocation(50, 50);
        internalFrame1.setVisible(true);
        desktopPane.add(internalFrame1);

        JInternalFrame internalFrame2 = new JInternalFrame("Internal Frame 2", true, true, true, true);
        internalFrame2.setSize(200, 150);
        internalFrame2.setLocation(200, 100);
        internalFrame2.setVisible(true);
        desktopPane.add(internalFrame2);

        //getContentPane().add(desktopPane, BorderLayout.CENTER);
        add(desktopPane);
    }

    public static void main(String[] args) {
        new DesktopPaneExample();
    }
}
