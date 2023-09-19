package np.edu.scst.lab3;

import java.sql.*;
/*
 Write a java program using JDBC to populate the avengers table with at least 10 rows, assuming that the "avengers”
 table residing inside “ajp” database, has four attributes (id, name, super_power, planet).
* */

public class Question2CreateAvengerTable{
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ajp", "root", "password");

            Statement st = con.createStatement();

            String sql = "INSERT INTO avengers(name, super_power,planet)" + "VALUES (?,?,?), (?,?,?), (?,?,?), (?,?,?), (?,?,?), (?,?,?), (?,?,?), (?,?,?), (?,?,?), (?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, "Saljesh");
            ps.setString(2, "Eating");
            ps.setString(3, "Earth");

            ps.setString(4, "Kushal");
            ps.setString(5, "Riding");
            ps.setString(6, "Earth");

            ps.setString(7, "Saugat");
            ps.setString(8, "Laughing");
            ps.setString(9, "Mars");

            ps.setString(10, "Shirish");
            ps.setString(11, "Smiling");
            ps.setString(12, "Venus");

            ps.setString(13, "Rohan");
            ps.setString(14, "Coding");
            ps.setString(15, "Jupyter");

            ps.setString(16, "Sulove");
            ps.setString(17, "Secret");
            ps.setString(18, "Saturan");

            ps.setString(19, "Anish");
            ps.setString(20, "Reading");
            ps.setString(21, "Mercury");

            ps.setString(22, "Chirag");
            ps.setString(23, "Studying");
            ps.setString(24, "Pluto");

            ps.setString(25, "Parle");
            ps.setString(26, "Biscuit");
            ps.setString(27, "Andromeda");

            ps.setString(28, "Vishnu");
            ps.setString(29, "Creating Universe");
            ps.setString(30, "Multiverse");


            ps.execute();

            con.close();

        }catch(Exception e){
            System.out.println(e);
        }
    }
}
