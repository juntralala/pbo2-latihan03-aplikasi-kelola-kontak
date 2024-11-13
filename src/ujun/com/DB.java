package ujun.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import org.sqlite.JDBC;

public class DB {

    private static String database = "contact_app";
    private static String host = "localhost";
    private static String username = "root";
    private static String password = "";
    private static int port = 3306;
    private static Connection connection = null;

    public static Connection getConnection() throws SQLException {
        if (DB.connection == null) {
            DB.registerSqliteDriver();
            String jdbcUrl = String.format("jdbc:sqlite:database.sqlite");
//            String jdbcUrl = String.format("jdbc:mysql://%s:%d/%s", DB.host, DB.port, DB.database);
            return DB.connection = DriverManager.getConnection(jdbcUrl, DB.username, DB.password);
        } else {
            return DB.connection;
        }
    }

    public static void registerSqliteDriver() throws SQLException{
        DriverManager.registerDriver(new JDBC());
    }
    
}
