package week14;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    public Connection connect() {
        try {
            String url = "jdbc:mysql://localhost/umn_kuliah_oop";
            String user = "root";
            String password = "";

            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, user, password);
            return conn;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
