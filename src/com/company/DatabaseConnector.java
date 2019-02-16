package com.company;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;

public class DatabaseConnector {
    public final String url = "jdbc:postgresql://localhost:5432/postgres";
    public final String user = "postgres";
    public final String password = "123";

    public Connection connect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println(""); //Successfully connected to the Database
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

    public HashMap<Auto, Info> getAuto() {
        HashMap<Auto, Info> autos = new HashMap();
        String SQL = "select a.*, i.* from automobiles a join info i on a.id = i.id";
        try (Connection conn = connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(SQL)) {
            while (rs.next()) {
                Auto auto = new Auto(rs.getInt("id"), rs.getString("number"));
                Info info = new Info(rs.getString("date_of_creation"), rs.getString("model"),
                        rs.getDouble("price"), rs.getString("color"), auto);
                autos.put(auto, info);
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return autos;
    }
}
