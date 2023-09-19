package np.edu.scst.lab3;

import java.sql.*;

public class Question4Scrollable {
    public static void main(String[] args) throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ajp", "root", "password");

        Statement st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);

        String sql = "SELECT * FROM avengers";
        System.out.println("before");

        ResultSet rs = st.executeQuery(sql);
        while(rs.next()) {
            System.out.println(rs.getInt("id") + "\t" + rs.getString("name") + "\t" +rs.getString("super_power") + "\t" +rs.getString("planet"));

        }

        System.out.println("After");

        rs.absolute(2);
        String newName = rs.getString("name");
        newName = "Jay shree ram";
        rs.updateString("name", newName);
        rs.updateRow();

        rs = st.executeQuery(sql);

        while(rs.next()) {
            System.out.println(rs.getInt("id") + "\t" + rs.getString("name") + "\t" +rs.getString("super_power") + "\t" +rs.getString("planet"));

        }

        con.close();

    }
}
