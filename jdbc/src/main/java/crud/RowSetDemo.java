package crud;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;

public class RowSetDemo {

    public static void main(String[] args) throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        JdbcRowSet rs = RowSetProvider.newFactory().createJdbcRowSet();

        rs.setUrl("jdbc:mysql://localhost:3306/jdbcDemo");
        rs.setUsername("root");
        rs.setPassword("password");

        rs.setCommand("select * from student");

        rs.execute();

        System.out.println("hellow");

        while (rs.next()) {
            System.out.println(rs.getInt("id") + "\t" + rs.getString("name") + "\t" + rs.getInt("class") + "\t" + rs.getInt("age"));
        }

        rs.close();
    }
}
