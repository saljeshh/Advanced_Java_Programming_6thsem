package np.edu.scst.lab4;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

public class Exam extends JFrame{
    
    public Exam(){

        JPanel row1 = new JPanel(new FlowLayout());
        JTextField username = new JTextField(10);
        JTextField password = new JTextField(10);
        JTextField output = new JTextField( 40);
        row1.add(username);
        row1.add(password);
        
        JPanel row2 = new JPanel(new FlowLayout());
        JButton login = new JButton("Login");
        JButton cancel = new JButton("Cancel");
        row2.add(login);
        row2.add(cancel);
        row2.add(output);
        
        
        Container container = getContentPane();
        container.add(row1, BorderLayout.NORTH);
        container.add(row2, BorderLayout.CENTER);
        
        
        login.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                
                String uname = username.getText();
                String pass = password.getText();
                
                try{
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "password");
                    
                    
                    String sql = "select * from student where name=? and password=?";
                    
                    PreparedStatement ps = con.prepareStatement(sql);
                    ps.setString(1,uname);
                    ps.setString(2,pass);
                   ResultSet data = ps.executeQuery();
                    
          
                   if(data.next()){
                       String res = "Id: " + data.getInt("id") + " Name: " + data.getString("name");
                        output.setText("Id: " + data.getInt("id") + " Name: " + data.getString("name"));
                        JOptionPane dialog = new JOptionPane();
                        dialog.showMessageDialog(Exam.this,res);
                   }else{
                       output.setText("User not authenticated");
                   }
                    
                    
                }catch(Exception es){
                    
                }
            }
        });
        
        cancel.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                username.setText("");
                password.setText("");
                output.setText("");
            }
        
                
        }
        
      
         setVisible(true);
        setDefaultCloseOperation(3);
        setSize(500,500);
        setTitle("js");
    }
    
    public static void main(String[] args) {
        new Exam();
    }
}
