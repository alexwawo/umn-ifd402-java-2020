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

    void insert(String nim, String nama, String prodi){
        String sqlInsert = "INSERT INTO mahasiswa(nim, nama, prodi) VALUES ('" + nim + "', '" + nama + "', '" + prodi + "')";
        try{
            Class.forName(JDBC_DRIVER);
            Connection connection = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement statement = connection.createStatement();
            statement.executeUpdate(sqlInsert);
            statement.close();
            connection.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    void update(String nim, String nama, String prodi) {
        String sqlUpdate = "UPDATE mahasiswa " +
                "SET nama = '" + nama + "', prodi = '" + prodi + "'" +
                "WHERE nim = '" + nim + "'";
        try{
            Class.forName(JDBC_DRIVER);
            Connection connection = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement statement = connection.createStatement();
            statement.executeUpdate(sqlUpdate);
            statement.close();
            connection.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    void delete(String nim){
        String sqlDelete = "DELETE FROM mahasiswa WHERE nim = " + nim;
        try{
            Class.forName(JDBC_DRIVER);
            Connection connection = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement statement = connection.createStatement();
            statement.executeUpdate(sqlDelete);
            statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    ResultSet select(){
        ResultSet resultSet = null;
        String sql = "SELECT * FROM mahasiswa";
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
