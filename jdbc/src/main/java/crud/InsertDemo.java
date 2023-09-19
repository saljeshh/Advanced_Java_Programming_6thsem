package crud;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertDemo {
    public static void main(String[] args) {
        try{
            // in new version mysql.cj in old not needed
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcDemo", "root", "password");
            // this statement is object creatiion but con.create.. gives ready made object like InetAddress
            Statement st = con.createStatement();

            String sql = "INSERT INTO student(name, age, class) " + "VALUES" + "('saljesh',22,20)," + "('kushal', 34,22)";

            // execute is a car to send to the db
            st.execute(sql);
            con.close();

        }catch(ClassNotFoundException e) {
            System.out.println("Err: " + e);
        }catch(SQLException s){
            System.out.println("Sql Error: " + s);
            s.printStackTrace();
        }
    }
}

