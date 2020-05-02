package week12.simple_db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SimpleDB1 {
    private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://localhost/umn_kuliah_oop";
    private static final String USER = "root";
    private static final String PASS = "";

    public static void main(String[] args) {
        ResultSet resultSet = null;
//        String sqlInsert = "INSERT INTO mahasiswa (nim, nama, prodi) VALUES ('001', 'John Thor', 'Informatika')";
//        String sqlUpdate = "UPDATE mahasiswa SET nim='00X', nama='Superman', prodi='Infotaiment' WHERE id=2";
//        String sqlDelete = "DELETE FROM mahasiswa WHERE id=2";
        String sqlSelect = "SELECT * FROM mahasiswa";
        try{
            // Step 1. Create Connection
            Class.forName(JDBC_DRIVER);
            Connection connection = DriverManager.getConnection(DB_URL, USER, PASS);

            // Step 2. What do you want to do?
            Statement statement = connection.createStatement();
//            statement.executeUpdate(sqlInsert);
//            statement.executeUpdate(sqlUpdate);
//            statement.executeUpdate(sqlDelete);

            // SELECT START
            resultSet = statement.executeQuery(sqlSelect);
            if(resultSet != null){
                while(resultSet.next()){
                    System.out.println(resultSet.getString("id"));
                    System.out.println(resultSet.getString("nim"));
                    System.out.println(resultSet.getString("nama"));
                    System.out.println(resultSet.getString("prodi"));
                    System.out.println();
                }
            }
            // SELECT END
            statement.close();
            connection.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
