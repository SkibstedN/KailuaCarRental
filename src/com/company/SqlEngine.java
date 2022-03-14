package com.company;

import java.sql.*;

public class SqlEngine {

    public static final String jdbc_driver = "com.mysql.jdbc.Driver";
    public static final String database_url = "jdbc:mysql://localhost:3306/ap";
    public static Connection con;

    public static void main(String[] args) {
        try{
            con = DriverManager.getConnection(database_url, "root", "");
            Statement s = con.createStatement();
            ResultSet rs = s.executeQuery("/*SQL STATEMENT HERE*/");

            if (rs != null){
                while (rs.next()){
                    /*System.out.print("something,something");*/
                }
            }
            s.close();
            con.close();
        }catch(SQLException sqlException){
            System.out.println("SqlException: "+sqlException.getMessage());
            System.exit(1);
        }
    }
}
