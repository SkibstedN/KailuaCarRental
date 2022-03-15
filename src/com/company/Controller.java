package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Controller {


    public static void createCustomer(ArrayList<Customer> customers, Customer customer){
        Scanner console = new Scanner (System.in);
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
                "|------------------------|\n" +
                "|Enter driver since date |\n" +
                "|------------------------|");
        String driverSinceDate = console.next();

        customer = new Customer(firstName, lastName, address, zipCode, city, phoneNumber, email, driverLicenseNumber, driverSinceDate);
        customers.add(customer);
        SqlEngine.insertCustomer(customer);


    }
}
