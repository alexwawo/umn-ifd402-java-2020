package week12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DB {
    private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://localhost/umn_kuliah_oop";
    private static final String USER = "root";
    private static final String PASS = "";

    void addDB(int id, String nama, String penulis){
        System.out.println(nama);
        String sqlAdd = "INSERT INTO buku(id, judul, penulis) VALUES (\"" + id + ", \"" + nama + ", \"" + penulis + "\")";
        sqlAdd = "INSERT INTO buku(id, judul, penulis) VALUES ('1', '2', '3')";
        try{
            Class.forName(JDBC_DRIVER);
            Connection connection = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement statement = connection.createStatement();
            statement.executeUpdate(sqlAdd);
            statement.close();
            connection.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    void delDB(int id){
        String delSql = "DELETE FROM buku WHERE id = " + id;
        try{
            Class.forName(JDBC_DRIVER);
            Connection connection = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement statement = connection.createStatement();
            statement.executeUpdate(delSql);
            statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    ResultSet showDB(){
        ResultSet resultSet = null;
        String sql = "SELECT * FROM buku";
        try{
            Class.forName(JDBC_DRIVER);
            Connection connection = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);
            return resultSet;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return resultSet;
    }
}
