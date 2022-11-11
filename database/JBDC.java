package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JBDC {
    
    private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";

    private static final String DATABASE_LINK = "";

    public static Connection Connect(){
        Connection con = null;
        try {
            //Nạp driver
            Class.forName(JDBC_DRIVER);
            //tk,mk db
            String Username = "root";
            String Password = "123456789";
            //Kết nối đến db
            con = DriverManager.getConnection(DATABASE_LINK, Username, Password);
        } catch (SQLException e) {
            System.err.println("Error Connection!!!" + "\n" + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.err.println("Can't found driver MySQL!!!" + "\n" + e.getMessage());
        }
        return con;
    }
}
