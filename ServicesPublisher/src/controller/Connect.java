package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {

    public Connect() {
    }

    public Connection createConnection() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/webServicesDB";
        return DriverManager.getConnection(url, "postgres", "cw-g&6c)aaZP%g{9");
    }


}
