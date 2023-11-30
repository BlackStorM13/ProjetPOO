package com.tld.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnexionJDBC {

    private String jdbcUrl = "jdbc:mysql://localhost:3306/produit";
    private String login = "root";
    private String mdp = "";

    Connection connection;
    Statement stmt;

    public Statement getStmt(){
        return stmt;
    }

    public ConnexionJDBC(){
        try {
            Connection conn = DriverManager.getConnection(jdbcUrl,login,mdp);
            System.out.println("connection successfull !!");
            this.connection= conn;
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void setStmt(Statement stmt){
        this.stmt = stmt;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public Connection getConnection() throws SQLException {
        return this.connection;
    }

    public Statement createStatement(Connection connection) throws SQLException{
        return connection.createStatement();
    }

}
