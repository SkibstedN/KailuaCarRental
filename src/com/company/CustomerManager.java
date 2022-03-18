package com.company;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class CustomerManager {


    // TODO metoden skal kunne opdaterer en customer ud for forskellige kriterier


    public static void createCustomer(Scanner console, ArrayList<Customer> customerList, Customer customer){
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
                "|Enter driver since date (YYYY-MM-DD) |\n" +
                "|-----------------------------------|");
        String driverSinceDate = console.next();
        int customerId = customerList.size()+2;

        customer = new Customer(customerId,firstName, lastName, address, zipCode, city, phoneNumber, email, driverLicenseNumber, driverSinceDate);
        customerList.add(customer);
        SqlEngine.insertCustomer(customer, customerList);


    }


    public static void updateCustomer (){

    }


    public static void deleteCustomer (Scanner console, ArrayList<Customer> customerList, Customer customer){
        for (Customer cstm : customerList ) {
            System.out.println(cstm);
        }
        System.out.println("Which Customer do you want to delete? Enter Customer ID : ");
        int customerID = console.nextInt();
        System.out.println("You have chosen to delete Customer with ID = " + customerID +
                "Please confirm your choice, yes or no :");
        String choice = console.next();
        if (choice.toLowerCase() == "no"){}


       SqlEngine.deleteCustomer(CustomerID);

    }
}
