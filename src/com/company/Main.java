package com.company;

import java.sql.*;

public class Main {

    public static void main(String[] args) {

        String sqlSelectAllPersons = "SELECT * FROM users";
        String connectionUrl = "jdbc:mariadb://localhost:3306/company_ms";
        try {
            Connection conn = DriverManager.getConnection(connectionUrl, "root",null);
            PreparedStatement ps = conn.prepareStatement(sqlSelectAllPersons);
            ResultSet rs = ps.executeQuery();

            System.out.println("asd");
            while (rs.next()) {
                long id = rs.getLong("id");
                String name = rs.getString("username");
                String lastName = rs.getString("password");

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}
