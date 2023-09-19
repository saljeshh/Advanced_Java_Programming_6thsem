
package np.edu.scst.lab4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class CrudWithJdbc extends JFrame{
    public CrudWithJdbc(){
        JTextField idField = new JTextField(10);
        JTextField nameField = new JTextField(20);
        JTextField ageField = new JTextField(20);
        JTextField genderField = new JTextField(20);
        JTextField classField = new JTextField(20);
        JButton addButton = new JButton("Add");
        JButton updateButton = new JButton("Update");
        JButton deleteButton = new JButton("Delete");
        JButton clearButton = new JButton("Clear");
        JTextArea outputArea = new JTextArea(10,40);
 
        JPanel inputpanel = new JPanel(new GridLayout(6,2));
       inputpanel.add(new JLabel("ID"));
       inputpanel.add(idField);
       inputpanel.add(new JLabel("Name"));
       inputpanel.add(nameField);
       inputpanel.add(new JLabel("Age"));
       inputpanel.add(ageField);
       inputpanel.add(new JLabel("Gender"));
       inputpanel.add(genderField);
       inputpanel.add(new JLabel("Class"));
       inputpanel.add(classField);
       inputpanel.add(addButton);
       inputpanel.add(updateButton);
        
       
       JPanel buttonpanel = new JPanel(new FlowLayout());
       buttonpanel.add(deleteButton);
       buttonpanel.add(clearButton);
       
       Container container = getContentPane();
       container.add(inputpanel,BorderLayout.NORTH);
       container.add(buttonpanel,BorderLayout.CENTER);
       container.add(new JScrollPane(outputArea), BorderLayout.SOUTH);
       
        //event
         addButton.addMouseListener(new MouseAdapter(){
           public void mouseClicked(MouseEvent e){
               System.out.println("Mouse Clicked");
               
               try{
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    String url = "jdbc:mysql://localhost:3306/crudapp";
                    Connection con = DriverManager.getConnection(url,"root","password");
                    
                    PreparedStatement statement = con.prepareStatement("INSERT INTO cruddy values (?,?,?,?,?)");
                    
                    statement.setString(1,idField.getText());
                    statement.setString(2,nameField.getText());
                    statement.setString(3,ageField.getText());
                    statement.setString(4,genderField.getText());
                    statement.setString(5,classField.getText());
                    
                    int rows = statement.executeUpdate();
                    if(rows > 0){
                        outputArea.append("Record added successfully \n");
                    }else{
                        outputArea.append("Record not added. \n");
                    }
                    
               }catch(Exception ex){
                   ex.printStackTrace();
               }
           }
       });
         
       updateButton.addMouseListener(new MouseAdapter(){
           public void mouseClicked(MouseEvent e){
               System.out.println("Mouse Clicked");
               
               try{
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    String url = "jdbc:mysql://localhost:3306/crudapp";
                    Connection con = DriverManager.getConnection(url,"root","password");
                    
                     PreparedStatement statement = con.prepareStatement("UPDATE cruddy SET name=?,age=?,gender=?,class=? WHERE id=?");
                
                statement.setString(1, nameField.getText());
                statement.setString(2, ageField.getText());               
                statement.setString(3, genderField.getText());
                statement.setString(4, classField.getText());
                 statement.setString(5, idField.getText());
                int rows = statement.executeUpdate();
                if (rows > 0) {
                    outputArea.append("Record updated successfully\n");
                } else {
                    outputArea.append("Record not updated\n");
                }
                    
               }catch(Exception ex){
                   ex.printStackTrace();
               }
           }
       });
       
       deleteButton.addMouseListener(new MouseAdapter(){
           public void mouseClicked(MouseEvent e){
               System.out.println("Mouse Clicked");
               
               try{
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    String url = "jdbc:mysql://localhost:3306/crudapp";
                    Connection con = DriverManager.getConnection(url,"root","password");
                    
                      // Delete existing record from database
                    PreparedStatement statement = con.prepareStatement("DELETE FROM cruddy WHERE id=?");
                    statement.setString(1, idField.getText());
                    int rows = statement.executeUpdate();
                    if (rows > 0) {
                                      outputArea.append("Record deleted successfully\n");
                    } else {
                        outputArea.append("Record not deleted\n");
                    }
                    
               }catch(Exception ex){
                   ex.printStackTrace();
               }
           }
       });
       
       clearButton.addMouseListener(new MouseAdapter(){
           public void mouseClicked(MouseEvent e){
               System.out.println("Mouse Clicked");
               
               try{
                    // Clear input fields and output area
                    idField.setText("");
                    nameField.setText("");
                    ageField.setText("");
                    genderField.setText("");
                    classField.setText("");
                    outputArea.setText("");



                    
               }catch(Exception ex){
                   ex.printStackTrace();
               }
           }
       });
       
       setDefaultCloseOperation(3);
       setSize(500,500);
       setVisible(true);
    }
    
    public static void main(String[] args) {
        new CrudWithJdbc();
    }
}
