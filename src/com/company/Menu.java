package com.company;

import javax.naming.ldap.Control;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    public static void menu () {
        Scanner console = new Scanner(System.in);
        Customer customer = new Customer();
        CarType carType = new CarType();
        ArrayList<Customer> customersList = new ArrayList<>();
        ArrayList<CarType> carTypeList = new ArrayList<>();

        Customer simon = new Customer("Simon", "Bang", "Dybendalsvej 70 st tv", 2720, "Vanløse", 29254559, "simonbang0311@hotmail.com", 12345, "15-02-02" );
        Customer nikolaj = new Customer("Nikolaj", "Skibsted", "Kea", 2200, "København", 212345678, "nskibsted@gmail.com", 54321, "00-07-15" );
        customersList.add(simon);
        customersList.add(nikolaj);


        int answer = 0;
        System.out.println("Welcome to Kailua Car Rental. In this program you are able to create, update and delete" +
                "a customer, car and rental contract. You will pull data from a SQL database");

        while (answer != 4) {
            System.out.println("Please select below");

            System.out.println(
                    "            ________________________________________ \n" +
                    "           | Kailua Car Rental menu |||             |\n" +
                    "           |----------------------------------------|\n" +
                    "           |Enter 1  |   for access customer        |\n" +
                    "           |Enter 2  |   for access cars            |\n" +
                    "           |Enter 3  |   for access rental Contract |\n" +
                    "           |Enter 4  |   to exit program            |\n" +
                    "           |________________________________________|");
            answer = console.nextInt();

            switch (answer) {

                case 1:

                    System.out.println("" +
                            "            ________________________________________ \n" +
                            "           | CUSTOMER MANAGE                        |\n" +
                            "           |----------------------------------------|\n" +
                            "           |Enter 1  |   Se all customers           |\n" +
                            "           |Enter 2  |   Create new customer        |\n" +
                            "           |Enter 3  |   Update current customer    |\n" +
                            "           |Enter 4  |   Deleting customer          |\n" +
                            "           |Enter 5  |   Return to main menu        |\n" +
                            "           |________________________________________|");
                    int caseOneAnswer = console.nextInt();
                        switch (caseOneAnswer) {
                            case 1:

                                for (int i = 0; i < customersList.size(); i++){
                                    System.out.println(customersList.get(i));
                                }
                                break;
                            case 2:
                                Controller.createCustomer(console, customersList, customer);
                                break;
                            case 3:
                                //updateCustomer();
                                break;
                            case 4:
                                //deleteCustomer();
                                break;
                            case 5:
                                break;
                            default:
                                break;
                }

                    break;

                case 2:
                    // Sæt menupunkt ind med udprint af alle biler
                    System.out.println("" +
                            "            ________________________________________ \n" +
                            "           | CAR MANAGE                             |\n" +
                            "           |----------------------------------------|\n" +
                            "           |Enter 1  |   See all cars               |\n" +
                            "           |Enter 2  |   Create new car             |\n" +
                            "           |Enter 3  |   Update current car         |\n" +
                            "           |Enter 4  |   Deleting car               |\n" +
                            "           |Enter 5  |   Return to main menu        |\n" +
                            "           |________________________________________|\n");
                    int caseTwoAnswer = console.nextInt();

                    switch (caseTwoAnswer) {
                        case 1:
                            break;
                        case 2:
                            Controller.createCar(console, carTypeList, carType );
                            break;
                        case 3:
                            //updateCar();
                            break;
                        case 4:
                            //deleteCar();
                            break;
                        case 5:
                            break;
                        default:
                            break;
                    }
                    break;

                case 3:
                    // Sæt menupunkt ind med udprint af alle kontrakter
                    System.out.println(" " +
                            "            _____________________________________________ \n" +
                            "           | RENTAL CONTRACT MANAGE                      |\n" +
                            "           |---------------------------------------------|\n" +
                            "           |Enter 1  |   See all rental contracts        |\n" +
                            "           |Enter 2  |   Create new rental contract      |\n" +
                            "           |Enter 3  |   Update current rental contract  |\n" +
                            "           |Enter 4  |   Deleting rental Contract        |\n" +
                            "           |Enter 5  |   Return to main menu             |\n" +
                            "           |---------------------------------------------|");
                    int caseThreeAnswer = console.nextInt();

                        switch (caseThreeAnswer) {
                            case 1:
                                break;
                            case 2:
                                //createNewRentalContract();
                                break;
                            case 3:
                                //updateRentalContract();
                                break;
                            case 4:
                                //deleteRentalContract();
                                break;
                            case 5:
                                break;
                            default:
                                break;
                        }
                        break;

                        case 4:
                            break;


            }

        }
    }


}
