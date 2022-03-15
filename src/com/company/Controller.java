package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
   // Scanner console = new Scanner (System.in);

    public static void createCustomer(Scanner console, ArrayList<Customer> customers, Customer customer){
        //Scanner console = new Scanner (System.in);
        System.out.println("" +
                "|--------------------------|\n" +
                "|Enter customer first name |\n" +
                "|--------------------------|");
        String firstName = console.next();
        System.out.println("" +
                "|--------------------------|\n" +
                "|Enter customer last name  |\n" +
                "|--------------------------|");
        String lastName = console.next();

        System.out.println("" +
                "|-----------------------|\n" +
                "|Enter customer address |\n" +
                "|-----------------------|");
        console.nextLine();
        String address = console.nextLine();
        System.out.println("" +
                "|-------------------------|\n" +
                "|Enter customer Zip Code  |\n" +
                "|-------------------------|");
        int zipCode = console.nextInt();
        System.out.println("" +
                "|------------|\n" +
                "|Enter City  |\n" +
                "|------------|");
        String city = console.next();
        System.out.println("" +
                "|----------------------------|\n" +
                "|Enter customer Phonenumber  |\n" +
                "|----------------------------|");
        int phoneNumber = console.nextInt();
        System.out.println("" +
                "|--------------------|\n" +
                "|Enter email address |\n" +
                "|--------------------|");
        String email = console.next();
        System.out.println("" +
                "|-------------------------------------|\n" +
                "|Enter customer driverlicense number  |\n" +
                "|-------------------------------------|");
        int driverLicenseNumber = console.nextInt();
        System.out.println("" +
                "|-----------------------------------|\n" +
                "|Enter driver since date (YY-MM-DD) |\n" +
                "|-----------------------------------|");
        String driverSinceDate = console.next();

        customer = new Customer(firstName, lastName, address, zipCode, city, phoneNumber, email, driverLicenseNumber, driverSinceDate);
        customers.add(customer);
        SqlEngine.insertCustomer(customer);


    }
    public static void createCar (Scanner console, ArrayList<CarType> carTypeList, CarType car){
        System.out.println("" +
                "|------------------|\n" +
                "|Enter Brand       |\n" +
                "|------------------|");
        String brand = console.next();

        System.out.println("" +
                "|------------------|\n" +
                "|Enter Model       |\n" +
                "|------------------|");
        String model = console.next();

        System.out.println("" +
                "|--------------------|\n" +
                "|Enter Fuel Type     |\n" +
                "|--------------------|");
        String fuelType = console.next();

        System.out.println("" +
                "|-----------------------|\n" +
                "|Enter License Plate    |\n" +
                "|-----------------------|");
        String licensePlate = console.next();

        System.out.println("" +
                "|------------------------------------------|\n" +
                "|Enter First Registration Date (YY-MM-DD)  |\n" +
                "|------------------------------------------|");
        String firstRegDate = console.next();

        System.out.println("" +
                "|------------------|\n" +
                "|Enter Odometer    |\n" +
                "|------------------|");
        int odometer = console.nextInt();

        System.out.println("" +
                "|------------------|\n" +
                "|Enter carID       |\n" +
                "|------------------|");
        int carID = console.nextInt();

        System.out.println("" +
                "|------------------|\n" +
                "|Enter Car Type    |\n" +
                "|------------------|");
        String carType = console.next();

        System.out.println("" +
                "|----------------------|\n" +
                "|Enter Size of motor   |\n" +
                "|----------------------|");
        int motorSize = console.nextInt();

        System.out.println("" +
                "|------------------|\n" +
                "|Enter Gear Type   |\n" +
                "|------------------|");
        String gearType = console.next();

        System.out.println("" +
                "|---------------------------------|\n" +
                "|Enter AirCondition (Yes or No)   |\n" +
                "|---------------------------------|");
        String airCondition = console.next();

        System.out.println("" +
                "|------------------------------------|\n" +
                "|Enter Cruise Control (yes or No)    |\n" +
                "|------------------------------------|");
        String cruiseControl = console.next();

        System.out.println("" +
                "|------------------|\n" +
                "|Enter seat type   |\n" +
                "|------------------|");
        String seatType = console.next();

        System.out.println("" +
                "|-------------------|\n" +
                "|Enter seat amount  |\n" +
                "|-------------------|");
        int seatAmount = console.nextInt();

        System.out.println("" +
                "|--------------------|\n" +
                "|Enter horsepower    |\n" +
                "|--------------------|");
        int horsePower = console.nextInt();



    }
}
