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


    public static void updateCustomer (Scanner console, ArrayList<Customer> customerList, Customer customer){

        System.out.println("" +
                "|-----------------------------------------------------------------|" +
                "| Here you will be able to update some information on a customer  |" +
                "|-----------------------------------------------------------------|");

        for (Customer cus: customerList
             ) {
            System.out.println(cus);
        }
        System.out.println("" +
                "|--------------------------------------------------------------|\n" +
                "| Enter which customer you want to change. Enter customer ID   |\n" +
                "|--------------------------------------------------------------|");

        int changeCustomer = console.nextInt();

        for (Customer cus: customerList
             ) {
            if (cus.getCustomerID() == changeCustomer){
                System.out.println(cus);
            }
        }
        System.out.println("" +
                "|--------------------------------------------------------|\n" +
                "|Is this the customer you want to change? (yes or No)    |\n" +
                "|--------------------------------------------------------|");
        String answer = console.next();
        while (!answer.equalsIgnoreCase("yes")){

            for (Customer cus: customerList
                 ) {
                System.out.println(cus);
            }
            System.out.println("" +
                    "|----------------------------------------------|\n" +
                    "|Enter the ID of the car you want to change    |\n" +
                    "|----------------------------------------------|");
            changeCustomer = console.nextInt();
            for (Customer cus : customerList) {
                if (customer.getCustomerID() == changeCustomer) {
                    System.out.println(cus);
                }
            }
            System.out.println("" +
                    "|--------------------------------------------------------|\n" +
                    "|Is this the customer you want to delete? (yes or No)    |\n" +
                    "|--------------------------------------------------------|");
            answer = console.next();
        }


        System.out.println("" +
                "            ________________________________________ \n" +
                "           | CUSTOMER UPDATE                        |\n" +
                "           |----------------------------------------|\n" +
                "           |Enter 1  |   Change first name          |\n" +
                "           |Enter 2  |   Change last name           |\n" +
                "           |Enter 3  |   Change address             |\n" +
                "           |Enter 4  |   Change Zip Code            |\n" +
                "           |Enter 5  |   Change city                |\n" +
                "           |Enter 6  |   Change Phonenumber         |\n" +
                "           |Enter 7  |   Change eMail               |\n" +
                "           |Enter 8  |   Change Driverlicensenumber |\n" +
                "           |Enter 9  |   Change Driver since date   |\n" +
                "           |Enter 10 |   Return to Main Menu        |\n" +
                "           |________________________________________|\n");
        int changeAnswer = console.nextInt();

        switch (changeAnswer){

            case 1:
                for (Customer cus:customerList
                     ) {
                   if (cus.getCustomerID() == changeCustomer){
                       System.out.println(cus.getfName());
                   }
                }
                System.out.println("" +
                        "|---------------------------------------|\n" +
                        "|What is the new customer first name    |\n" +
                        "|---------------------------------------|");
                String newCustomerFName = console.next();
                System.out.println(newCustomerFName);
                System.out.println("" +
                        "|-----------------------------------------|\n" +
                        "|Is this the final first name? Yes or No  |\n" +
                        "|-----------------------------------------|");
                String customerChangeAnswer = console.next();

                while (!customerChangeAnswer.equalsIgnoreCase("yes")){
                    System.out.println("" +
                            "|---------------------------------|\n" +
                            "|Enter new customer first name    |\n" +
                            "|---------------------------------|");
                    System.out.println(newCustomerFName);

                     newCustomerFName = console.next();
                    System.out.println("" +
                            "|-----------------------------------------|\n" +
                            "|Is this the final first name? Yes or No  |\n" +
                            "|-----------------------------------------|");
                    customerChangeAnswer = console.next();

                }

                for (Customer cus:customerList
                ) {
                    if (cus.getCustomerID() == changeCustomer){
                        cus.setfName(newCustomerFName);
                    }
                }

                break;

            case 2:
                for (Customer cus:customerList
                ) {
                    if (cus.getCustomerID() == changeCustomer){
                        System.out.println(cus.getlName());

                    }
                }
                System.out.println("" +
                        "|---------------------------------------|\n" +
                        "|What is the new customer Last  name    |\n" +
                        "|---------------------------------------|");
                String newCustomerLName = console.next();
                System.out.println(newCustomerLName);
                System.out.println("" +
                        "|-----------------------------------------|\n" +
                        "|Is this the final first name? Yes or No  |\n" +
                        "|-----------------------------------------|");
                String customerChangeLNameAnswer = console.next();

                while (!customerChangeLNameAnswer.equalsIgnoreCase("yes")){
                    System.out.println("" +
                            "|---------------------------------|\n" +
                            "|Enter new customer first name    |\n" +
                            "|---------------------------------|");

                    newCustomerLName = console.next();
                    System.out.println(newCustomerLName);
                    System.out.println("" +
                            "|-----------------------------------------|\n" +
                            "|Is this the final first name? Yes or No  |\n" +
                            "|-----------------------------------------|");
                    customerChangeLNameAnswer = console.next();

                }
                for (Customer cus:customerList
                ) {
                    if (cus.getCustomerID() == changeCustomer){
                        cus.setlName(newCustomerLName);
                    }
                }
                break;

            case 3:
                for (Customer cus:customerList
                ) {
                    if (cus.getCustomerID() == changeCustomer){
                        System.out.println(cus.getAddress());

                        System.out.println("" +
                                "|-------------------------------|\n" +
                                "|Enter new customer Address     |\n" +
                                "|-------------------------------|");
                        String newCustomerAddress = console.next();
                        cus.setAddress(newCustomerAddress);
                    }
                }


                break;

            case 4:
                for (Customer cus:customerList
                ) {
                    if (cus.getCustomerID() == changeCustomer){
                        System.out.println(cus.getZipCode());

                        System.out.println("" +
                                "|-------------------------------|\n" +
                                "|Enter new Zip Code             |\n" +
                                "|-------------------------------|");
                        int newCustomerZipCode = console.nextInt();
                        cus.setZipCode(newCustomerZipCode);
                    }
                }
                break;

            case 5:
                for (Customer cus:customerList
                ) {
                    if (cus.getCustomerID() == changeCustomer){
                        System.out.println(cus.getCity());

                        System.out.println("" +
                                "|---------------------------|\n" +
                                "|Enter new city             |\n" +
                                "|---------------------------|");
                        String newCustomerCity = console.next();
                        cus.setCity(newCustomerCity);
                    }
                }
                break;

            case 6:
                for (Customer cus:customerList
                ) {
                    if (cus.getCustomerID() == changeCustomer){
                        System.out.println(cus.getPhoneNumber());

                        System.out.println("" +
                                "|-------------------------------|\n" +
                                "|Enter new Phonenumber          |\n" +
                                "|-------------------------------|");
                        int newCustomerPhonenumber = console.nextInt();
                        cus.setPhoneNumber(newCustomerPhonenumber);
                    }
                }
                break;

            case 7:
                for (Customer cus:customerList
                ) {
                    if (cus.getCustomerID() == changeCustomer){
                        System.out.println(cus.geteMail());

                        System.out.println("" +
                                "|-------------------------------|\n" +
                                "|Enter new Email Address        |\n" +
                                "|-------------------------------|");
                        String newCustomerEmail = console.next();
                        cus.seteMail(newCustomerEmail);
                    }
                }
                break;

            case 8:
                for (Customer cus:customerList
                ) {
                    if (cus.getCustomerID() == changeCustomer){
                        System.out.println(cus.getDriverLicenseNumber());

                        System.out.println("" +
                                "|-------------------------------|\n" +
                                "|Enter new DriverLicense number |\n" +
                                "|-------------------------------|");
                        int newCustomerDriverLicense = console.nextInt();
                        cus.setZipCode(newCustomerDriverLicense);
                    }
                }
                break;

            case 9:
                for (Customer cus:customerList
                ) {
                    if (cus.getCustomerID() == changeCustomer){
                        System.out.println(cus.getDriverSinceDate());

                        System.out.println("" +
                                "|-------------------------------|\n" +
                                "|Enter new driver Since Date    |\n" +
                                "|-------------------------------|");
                        String newCustomerDriverSinceDate = console.next();
                        cus.setDriverSinceDate(newCustomerDriverSinceDate);
                    }
                }
                break;

            case 10:
                break;

            default:
                break;









        }
        SqlEngine.updateCustomer(changeCustomer, customerList);


    }


    public static void deleteCustomer (Scanner console, ArrayList<Customer> customerList, Customer customer){
       /* for (Customer cstm : customerList ) {
            System.out.println(cstm);
        }
        System.out.println("Which Customer do you want to delete? Enter Customer ID : ");
        int customerID = console.nextInt();
        System.out.println("You have chosen to delete Customer with ID = " + customerID +
                "Please confirm your choice, yes or no :");
        String choice = console.next();
        if (choice.toLowerCase() == "no"){}

       //SqlEngine.deleteCustomer(CustomerID);
*/
        System.out.println("Here you will choose which customer you want to delete from the database");
        for (Customer cus: customerList
        ) {
            System.out.println(cus);
        }

        System.out.println(""+
                "            __________________________________________________ \n" +
                "           | Deleting Customer                                |\n" +
                "           |--------------------------------------------------|\n" +
                "           | Enter the ID of the customer you want to delete  |\n" +
                "           |--------------------------------------------------|\n" );
        int deleteCustomer = console.nextInt();

        for (Customer cus : customerList) {
            if (customer.getCustomerID() == deleteCustomer) {
                System.out.println(cus);
            }
        }
        System.out.println("" +
                "|--------------------------------------------------------|\n" +
                "|Is this the customer you want to delete? (yes or No)    |\n" +
                "|--------------------------------------------------------|");
        String answer = console.next();
        while (!answer.equalsIgnoreCase("yes")){
            System.out.println("" +
                    "|----------------------------------------------|\n" +
                    "|Enter the ID of the car you want to delete    |\n" +
                    "|----------------------------------------------|");
            deleteCustomer = console.nextInt();
            for (Customer cus : customerList) {
                if (customer.getCustomerID() == deleteCustomer) {
                    System.out.println(cus);
                }
            }
            System.out.println("" +
                    "|--------------------------------------------------------|\n" +
                    "|Is this the customer you want to delete? (yes or No)    |\n" +
                    "|--------------------------------------------------------|");
            answer = console.next();
        }
        SqlEngine.deleteCustomer(deleteCustomer, customerList);

    }

}
