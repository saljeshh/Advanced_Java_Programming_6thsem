package crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateDemo {
    public static void main(String[] args) {
        try{
            // in new version mysql.cj in old not needed
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcDemo", "root", "password");
            // this statement is object creatiion but con.create.. gives ready made object like InetAddress
            Statement st = con.createStatement();

            String sql = "UPDATE STUDENT SET name = 'bharat' WHERE id=3";
            // update ra deleted ma execute update
            st.executeUpdate(sql);
            con.close();

        }catch(ClassNotFoundException e) {
            System.out.println("Err: " + e);
        }catch(SQLException s){
            System.out.println("Sql Error: " + s);
            s.printStackTrace();
        }
    }
}
