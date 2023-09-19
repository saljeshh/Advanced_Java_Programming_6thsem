package np.edu.scst.jdbcpractise;

import java.sql.*;

public class CreateAvenger {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ajp", "root","password");
            
            Statement st = con.createStatement();
            String sql = "INSERT INTO avengers(name,super_power,planet)" + "VALUES(?,?,?),(?,?,?)";
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1,"Saljesh");
            ps.setString(2,"Coding");
            ps.setString(3,"Earth");
            ps.setString(4,"Annika");
            ps.setString(5,"Eating");
            ps.setString(6,"Mars");
            
            ps.execute();
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
