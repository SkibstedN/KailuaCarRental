package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Controller {


    public void createCustomer(ArrayList<Customer> customers){
        Scanner console = new Scanner (System.in);
        System.out.println("Enter customer first name");
        String firstName = console.next();
        System.out.println("Enter customer last name");
        String lastName = console.next();
        System.out.println("Enter customer address");
        String address = console.next();
        System.out.println("Enter customer Zip Code");
        int zipCode = console.nextInt();
        System.out.println("Enter City");
        String city = console.next();
        System.out.println("Enter customer Phonenumber");
        int phoneNumber = console.nextInt();
        System.out.println("Enter email address");
        String email = console.next();
        System.out.println("Enter customer driverlicense number ");
        int driverLicenseNumber = console.nextInt();
        System.out.println("Enter driver since date");
        String driverSinceDate = console.next();

        Customer customer = new Customer(firstName, lastName, address, zipCode, city, phoneNumber, email, driverLicenseNumber, driverSinceDate);
        customers.add(customer);
        SqlEngine.insertCustomer(customer);


    }
}
