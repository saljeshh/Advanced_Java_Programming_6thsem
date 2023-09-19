package np.edu.scst.lab3;

import java.sql.*;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;

public class Question5RowSetDemo {
    public static void main(String[] args) throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        JdbcRowSet rs = RowSetProvider.newFactory().createJdbcRowSet();

        rs.setUrl("jdbc:mysql://localhost:3306/ajp");
        rs.setUsername("root");
        rs.setPassword("password");

        rs.setCommand("select * from avengers where planet = 'Earth'");

        rs.execute();


        while(rs.next()) {
            System.out.println(rs.getInt("id") + "\t" + rs.getString("name") + "\t" +rs.getString("super_power") + "\t" +rs.getString("planet"));

        }

        rs.close();
    }
}
