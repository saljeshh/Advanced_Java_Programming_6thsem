package crud;

import java.sql.*;

public class PreparedInsert {
    public static void main(String[] args) {
        try{
            // in new version mysql.cj in old not needed
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcDemo", "root", "password");
            // this statement is object creatiion but con.create.. gives ready made object like InetAddress
            Statement st = con.createStatement();

            String sql = "INSERT INTO student(name, age, class) " + "VALUES (?,?,?) ,(?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1,"Pratap");
            ps.setInt(2,45);
            ps.setInt(3,77);

            ps.setString(4, "madhav");
            ps.setInt(5,34);
            ps.setInt(6,12);

            ps.execute();

            con.close();

        }catch(ClassNotFoundException e) {
            System.out.println("Err: " + e);
        }catch(SQLException s){
            System.out.println("Sql Error: " + s);
            s.printStackTrace();
        }
    }
}
