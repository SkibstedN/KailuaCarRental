package com.company;

import java.sql.*;
import java.util.ArrayList;

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
    // TODO Opret metode som henter data fra customer tabellen og sætter det ind i customer objectet og customerlist listen.
    public static void getCustomer (){
        try{
            con = DriverManager.getConnection(database_url, "root", "Thc52cgj");
            Statement s = con.createStatement();
            ResultSet rs = s.executeQuery(" SELECT c.car_id, c.car_brand, c.car_model, ci.car_fueltype, ci.car_licenseplate, ci.car_first_registration, ci.car_odometer," +
                    " ct.carType_id, c.car_type,\n" +
                    " ct.carType_motorSize,ct.carType_geartype, ct.carType_airCondition, ct.carType_cruiseControl, ct.carType_seatType, \n" +
                    " ct.carType_seatAmount, ct.carType_horsepower\n" +
                    "FROM car c\n" +
                    "INNER JOIN carInformation ci ON c.car_id = ci.FK_carInformation_car_id\n" +
                    "INNER JOIN carType ct ON ci.FK_carInformation_car_id = ct.FK_carType_car_id;");

            if (rs != null){
                while (rs.next()){

                }
            }
            s.close();
            con.close();
        }catch(SQLException sqlException){
            System.out.println("SqlException: "+sqlException.getMessage());
            System.exit(1);
        }
    }
    // TODO Tage informationerne fra CustomerManager.createCustomer og sæt dem ind i databasen
    public static void insertCustomer(Customer customer){

    }

    public static void getCar (CarType carType1, ArrayList<CarType> carTypeList){
        try{
            con = DriverManager.getConnection(database_url, "root", "Thc52cgj");
            Statement s = con.createStatement();
            ResultSet rs = s.executeQuery(" SELECT c.car_id, c.car_brand, c.car_model, ci.car_fueltype, ci.car_licenseplate, ci.car_first_registration, ci.car_odometer," +
                    " ct.carType_id, c.car_type,\n" +
                    " ct.carType_motorSize,ct.carType_geartype, ct.carType_airCondition, ct.carType_cruiseControl, ct.carType_seatType, \n" +
                    " ct.carType_seatAmount, ct.carType_horsepower\n" +
                    "FROM car c\n" +
                    "INNER JOIN carInformation ci ON c.car_id = ci.FK_carInformation_car_id\n" +
                    "INNER JOIN carType ct ON ci.FK_carInformation_car_id = ct.FK_carType_car_id;");

            if (rs != null){
                while (rs.next()){
                    int carID = rs.getInt("car_id");
                    String brand = rs.getString("car_brand");
                    String model = rs.getString("car_model");
                    String fueltype = rs.getString("car_fueltype");
                    String regNumber = rs.getString("car_licenseplate");
                    String date = rs.getString("car_first_registration");
                    int odometer = rs.getInt("car_odometer");
                    int carType_ID = rs.getInt("carType_id");
                    String carType = rs.getString("car_type");
                    int motorSize = rs.getInt("carType_motorSize");
                    String gearType = rs.getString("carType_geartype");
                    String airCondition = rs.getString("carType_airCondition");
                    String cruiseControl = rs.getString("carType_cruiseControl");
                    String seatType = rs.getString("carType_seatType");
                    int seatAmount = rs.getInt("carType_seatAmount");
                    int horsePower = rs.getInt("carType_horsepower");


                    carType1 = new CarType(carID, brand,model, fueltype, regNumber, date,odometer, carType_ID, carType, motorSize, gearType, airCondition, cruiseControl,
                    seatType, seatAmount, horsePower);
                    carTypeList.add(carType1);
                }

                /*protected int carID;

    protected String airCondition;
    protected String cruiseControl;
    protected String seatType;
    protected int seatAmount;
    protected int horsePower;*/
            }
            s.close();
            con.close();
        }catch(SQLException sqlException){
            System.out.println("SqlException: "+sqlException.getMessage());
            System.exit(1);
        }

    }
}
