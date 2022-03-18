package com.company;

import java.sql.*;
import java.util.ArrayList;

public class SqlEngine {

    public static final String jdbc_driver = "com.mysql.jdbc.Driver";
    public static final String database_url = "jdbc:mysql://localhost:3306/kailua";
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
    public static void getCustomer (Customer customer1, ArrayList<Customer> customerList){
        try{
            con = DriverManager.getConnection(database_url, "root", "Thc52cgj");
            Statement s = con.createStatement();
            ResultSet rs = s.executeQuery(" SELECT c.customer_id, c.customer_first_name, c.customer_last_name, c.customer_licensenumber, c.customer_driver_since_date, r.customer_address, r.customer_city, \n" +
                    "r.customer_zip_code, cc.customer_phonenumber, cc.customer_email\n" +
                    "FROM customer c \n" +
                    "JOIN residence r ON c.customer_id = r.FK_residence_customer_id\n" +
                    "JOIN contact cc ON r.customerResidence_id = cc.FK_contact_customer_id;");

            if (rs != null){
                while (rs.next()){

                     int customerID = rs.getInt("customer_id");
                     String fName = rs.getString("customer_first_name");
                    String lName = rs.getString("customer_last_name");
                     String address = rs.getString("customer_address");
                     int zipCode = rs.getInt("Customer_zip_code");
                     String city = rs.getString("customer_city");
                     int phoneNumber = rs.getInt("customer_phonenumber");
                     String eMail = rs.getString("customer_email");
                     int driverLicenseNumber = rs.getInt("customer_licensenumber");
                     String driverSinceDate = rs.getString("customer_driver_since_date");

                     customer1 = new Customer(customerID, fName, lName, address, zipCode, city, phoneNumber, eMail, driverLicenseNumber, driverSinceDate);
                     customerList.add(customer1);

                }
            }
            s.close();
            con.close();
        }catch(SQLException sqlException){
            System.out.println("SqlException: "+sqlException.getMessage());
            System.exit(1);
        }
    }

    public static void insertCustomer(Customer customer1, ArrayList<Customer> customerList){
        try{
            con = DriverManager.getConnection(database_url, "root", "Thc52cgj");
            Statement s = con.createStatement();


            String customerQuery = "INSERT INTO customer (customer_first_name, customer_last_name, customer_licensenumber," +
                    " customer_driver_since_date)" + "VALUES(?,?,?,?)";
            PreparedStatement preparedStatement = con.prepareStatement(customerQuery);
            preparedStatement.setString(1,customer1.getfName());
            preparedStatement.setString(2, customer1.getlName());
            preparedStatement.setInt(3, customer1.getDriverLicenseNumber());
            preparedStatement.setString(4,customer1.getDriverSinceDate());
            preparedStatement.execute();



            String residenceQuery = "INSERT INTO residence (FK_Residence_customer_id, customer_address, customer_city," +
                    " customer_zip_code)"
                    + "VALUES (?, ?, ?, ?)";

            PreparedStatement preparedStatement1 = con.prepareStatement(residenceQuery);
            preparedStatement1.setInt(1,customerList.size()+1);
            preparedStatement1.setString(2, customer1.getAddress());
            preparedStatement1.setString(3,customer1.getCity());
            preparedStatement1.setInt(4,customer1.getZipCode());

            preparedStatement1.execute();

            String contactQuery = "INSERT INTO contact (FK_Contact_customer_id, customer_phonenumber, customer_email)" +
                     "VALUES (?, ?, ?)";

            PreparedStatement preparedStatement2 = con.prepareStatement(contactQuery);
            preparedStatement2.setInt(1,customerList.size()+1);
            preparedStatement2.setInt(2,customer1.getPhoneNumber());
            preparedStatement2.setString(3,customer1.geteMail());

            preparedStatement2.execute();



            s.close();
            con.close();
        }catch(SQLException sqlException){
            System.out.println("SqlException: "+sqlException.getMessage());
            System.exit(1);
        }

    }
    public static void updateCustomer(int customerID, ArrayList<Customer> customerList){
        for (Customer cus: customerList
             ) {
            if (cus.getCustomerID() == customerID) {
            }
            try {
                con = DriverManager.getConnection(database_url, "root", "Thc52cgj");
                Statement s = con.createStatement();


                String contactQuery = "UPDATE contact SET customer_phonenumber = ?, customer_email =? WHERE FK_contact_customer_id = ?";
                PreparedStatement preparedStatement = con.prepareStatement(contactQuery);
                preparedStatement.setInt(1, cus.getPhoneNumber());
                preparedStatement.setString(2, cus.geteMail());
                preparedStatement.setInt(3,customerID);
                preparedStatement.execute();

                String residenceQuery = "UPDATE residence SET customer_address = ?, customer_city = ?, customer_zip_code =? WHERE FK_residence_customer_id = ? ";
                PreparedStatement preparedStatement1 = con.prepareStatement(residenceQuery);
                preparedStatement1.setString(1,cus.getAddress());
                preparedStatement1.setString(2,cus.getCity());
                preparedStatement1.setInt(3,cus.getZipCode());
                preparedStatement1.setInt(4,customerID);
                preparedStatement1.execute();


                String customerQuery = "UPDATE customer SET customer_first_name = ?, customer_last_name = ?, customer_licensenumber = ?," +
                        "customer_driver_since_date = ? WHERE customer_id = ? ";
                PreparedStatement preparedStatement2 = con.prepareStatement(customerQuery);
                preparedStatement2.setString(1,cus.getfName());
                preparedStatement2.setString(2, cus.getlName());
                preparedStatement2.setInt(3, cus.getDriverLicenseNumber());
                preparedStatement2.setString(4, cus.getDriverSinceDate());
                preparedStatement2.setInt(5,customerID);
                preparedStatement2.execute();


                s.close();
                con.close();
            } catch (SQLException sqlException) {
                System.out.println("SqlException: " + sqlException.getMessage());
                System.exit(1);


            }
        }
    }

    public static void deleteCustomer (int deleteCustomer, ArrayList<Customer> customerList){
        try{
            con = DriverManager.getConnection(database_url, "root", "Thc52cgj");
            Statement s = con.createStatement();


            String contactQuery = "DELETE FROM contact WHERE FK_contact_customer_id = ?";
            PreparedStatement preparedStatement = con.prepareStatement(contactQuery);
            preparedStatement.setInt(1,deleteCustomer);
            preparedStatement.executeUpdate();

            String residenceQuery = "DELETE FROM residence WHERE FK_residence_customer_id = ?";
            PreparedStatement preparedStatement1 = con.prepareStatement(residenceQuery);
            preparedStatement1.setInt(1,deleteCustomer);
            preparedStatement1.executeUpdate();

            String customerQuery = "DELETE FROM customer WHERE customer_id = ?";
            PreparedStatement preparedStatement2 = con.prepareStatement(customerQuery);
            preparedStatement2.setInt(1,deleteCustomer);
            preparedStatement2.executeUpdate();

            for (Customer cus: customerList
            ) {
                if (cus.getCustomerID() == deleteCustomer) {
                    customerList.remove(cus);
                }
            }

            s.close();
            con.close();
        }catch(SQLException sqlException){
            System.out.println("SqlException: "+sqlException.getMessage());
            System.exit(1);
        }

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

            }
            s.close();
            con.close();
        }catch(SQLException sqlException){
            System.out.println("SqlException: "+sqlException.getMessage());
            System.exit(1);
        }

    }

    public static void insertCar (CarType car, ArrayList<CarType> carTypeList){
        try{
            con = DriverManager.getConnection(database_url, "root", "Thc52cgj");
            Statement s = con.createStatement();
            String carType = car.getCarType();
            //ResultSet rs = s.executeQuery("INSERT INTO car (car_type, car_brand, car_model) VALUES(?, ? , ?)");

            String carQuery = "INSERT INTO CAR (car_type, car_brand, car_model)" + "VALUES(?,?,?)";
        PreparedStatement preparedStatement = con.prepareStatement(carQuery);

        preparedStatement.setString(1,car.getCarType());
        preparedStatement.setString(2,car.getBrand());
        preparedStatement.setString(3, car.getModel());
        preparedStatement.execute();

        String carInformation = "INSERT INTO carInformation (FK_carInformation_car_id, car_fueltype, car_licenseplate, car_first_registration, car_odometer)"
                + "VALUES (?, ?, ?, ?, ?)";


        PreparedStatement preparedStatement1 = con.prepareStatement(carInformation);
        preparedStatement1.setInt(1,carTypeList.size()+1);
        preparedStatement1.setString(2, car.getFuelType());
        preparedStatement1.setString(3,car.getRegNumber());
        preparedStatement1.setString(4,car.getDate());
        preparedStatement1.setInt(5,car.getOdometer());
        preparedStatement1.execute();

        String carTypeQuery = "INSERT INTO carType (FK_carType_car_id, carType_gearType, carType_horsepower," +
                " carType_motorSize, carType_airCondition, cartype_cruiseControl, cartype_seatType, cartype_seatAmount)"
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        PreparedStatement preparedStatement2 = con.prepareStatement(carTypeQuery);
        preparedStatement2.setInt(1,carTypeList.size()+1);
        preparedStatement2.setString(2,car.getCarType());
        preparedStatement2.setInt(3,car.getHorsePower());
        preparedStatement2.setDouble(4,car.getMotorSize());
        preparedStatement2.setString(5,car.getAirCondition());
        preparedStatement2.setString(6,car.getCruiseControl());
        preparedStatement2.setString(7,car.getSeatType());
        preparedStatement2.setInt(8,car.getSeatAmount());
        preparedStatement2.execute();



            s.close();
            con.close();
        }catch(SQLException sqlException){
            System.out.println("SqlException: "+sqlException.getMessage());
            System.exit(1);
        }

    }

    public static void updateCar(CarType carToUpdate,ArrayList<CarType> carTypeList){
        try{
            con = DriverManager.getConnection(database_url, "root", "Thc52cgj");
            Statement s = con.createStatement();
            //ResultSet rs = s.executeQuery("INSERT INTO car (car_type, car_brand, car_model) VALUES(?, ? , ?)");

            String carQuery = "UPDATE carInformation SET car_odometer = ? WHERE car_id = ?";
            PreparedStatement preparedStatement = con.prepareStatement(carQuery);
            preparedStatement.setInt(1,carToUpdate.getOdometer());
            preparedStatement.setInt(2,carToUpdate.getCarID());
            preparedStatement.execute();
            s.close();
            con.close();
        }catch(SQLException sqlException){
            System.out.println("SqlException: "+sqlException.getMessage());
            System.exit(1);
        }

    }

    public static void deleteCar(int deleteCar, ArrayList<CarType> carTypeList){
        try{
            con = DriverManager.getConnection(database_url, "root", "Thc52cgj");
            Statement s = con.createStatement();


            String carInformationQuery = "DELETE FROM carInformation WHERE FK_carInformation_car_id = ?";
            PreparedStatement preparedStatement = con.prepareStatement(carInformationQuery);
            preparedStatement.setInt(1,deleteCar);
            preparedStatement.executeUpdate();

            String carTypeQuery = "DELETE FROM carType WHERE FK_carType_car_id = ?";
            PreparedStatement preparedStatement1 = con.prepareStatement(carTypeQuery);
            preparedStatement1.setInt(1,deleteCar);
            preparedStatement1.executeUpdate();

            String carQuery = "DELETE FROM car WHERE car_id = ?";
            PreparedStatement preparedStatement2 = con.prepareStatement(carQuery);
            preparedStatement2.setInt(1,deleteCar);
            preparedStatement2.executeUpdate();

            for (CarType car: carTypeList
                 ) {
                if (car.getCarID() == deleteCar) {
                carTypeList.remove(car);
                }
            }

            s.close();
            con.close();
        }catch(SQLException sqlException){
            System.out.println("SqlException: "+sqlException.getMessage());
            System.exit(1);
        }
    }

    public static void getContract (Contract contract, ArrayList<Contract> contractList){
        /*try{
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

            }
            s.close();
            con.close();
        }catch(SQLException sqlException){
            System.out.println("SqlException: "+sqlException.getMessage());
            System.exit(1);
        }

    }*/

    }



}
