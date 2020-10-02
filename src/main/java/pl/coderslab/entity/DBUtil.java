package pl.coderslab.entity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {

    public static String DB_URL = "jdbc:mysql://localhost:3306";
    public static String DB_USER = "root";
    public static String DB_PASS = "coderslab";

    public static Connection connect() throws SQLException {
        String conn = String.format("%s/%s?useSSL=False&characterSet=utf8mb4&serverTimezone=UTC",DB_URL,"workshop2");
        Connection connection = DriverManager.getConnection(conn,DB_USER,DB_PASS);
        return connection;

    }
}
