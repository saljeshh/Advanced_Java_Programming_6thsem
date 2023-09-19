package crud;

import com.mysql.cj.protocol.Resultset;

import java.sql.*;

public class SelectDemo {
    public static void main(String[] args) {
        try{
            // in new version mysql.cj in old not needed
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcDemo", "root", "password");
            // this statement is object creatiion but con.create.. gives ready made object like InetAddress
            Statement st = con.createStatement();

            String sql = "SELECT * FROM student";

            ResultSet rs = st.executeQuery(sql);

            while(rs.next()){
                System.out.println(rs.getString("name") + " " + rs.getInt("age"));
            }

            con.close();

        }catch(ClassNotFoundException e) {
            System.out.println("Err: " + e);
        }catch(SQLException s){
            System.out.println("Sql Error: " + s);
            s.printStackTrace();
        }
    }
}
