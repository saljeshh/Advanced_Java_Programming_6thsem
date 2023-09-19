package np.edu.scst.lab3;


import java.sql.*;

public class Question3ExtractEarth {
    public static void main(String[] args) throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ajp", "root", "password");

        Statement st = con.createStatement();
        String sql = "SELECT * FROM avengers where planet = 'Earth'";

        ResultSet rs = st.executeQuery(sql);

        while(rs.next()){
            System.out.println(rs.getString("name") + " " + rs.getString("super_power") + " " + rs.getString("planet"));
        }

        con.close();
    }

}
