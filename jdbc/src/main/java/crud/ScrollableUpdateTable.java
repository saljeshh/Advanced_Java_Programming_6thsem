package crud;
// simply formatted sql printing in console

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ScrollableUpdateTable {
    public static void main(String[] args) throws Exception {
        // in new version mysql.cj in old not needed
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcDemo", "root", "password");
        // this statement is object creatiion but con.create.. gives ready made object like InetAddress
        Statement st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);

        String sql = "SELECT * FROM STUDENT";
        System.out.println("before");

        ResultSet rs = st.executeQuery(sql);
        while (rs.next()) {
            System.out.println(rs.getInt("id") + "\t" + rs.getString("name") + "\t" + rs.getInt("class") + "\t" + rs.getInt("age"));
        }

        System.out.println("After");

        // second row
        rs.absolute(2);
        int newAge = rs.getInt("age") + 10;
        rs.updateInt("age", newAge);
        rs.updateRow(); // updated till there
        rs = st.executeQuery(sql);

        while (rs.next()) {
            System.out.println(rs.getInt("id") + "\t" + rs.getString("name") + "\t" + rs.getInt("class") + "\t" + rs.getInt("age"));
        }

        // execute is a car to send to the db
        st.executeQuery(sql);
        con.close();
    }
}

