package com.company;

import java.util.Scanner;

public class Menu {

    public static void menu () {
        Scanner console = new Scanner(System.in);
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
                            "           |Enter 1  |   Create new customer        |\n" +
                            "           |Enter 2  |   Update current customer    |\n" +
                            "           |Enter 3  |   Deleting customer          |\n" +
                            "           |Enter 4  |   Return to main menu        |\n" +
                            "           |________________________________________|");
                    int caseOneAnswer = console.nextInt();
                        switch (caseOneAnswer) {
                            case 1:
                                //createNewCustomer();
                                break;
                            case 2:
                                //updateCustomer();
                                break;
                            case 3:
                                //deleteCustomer();
                                break;
                            case 4:
                                break;
                            default:
                                break;
                }

                    break;

                case 2:
                    System.out.println("" +
                            "            ________________________________________ \n" +
                            "           | CAR MANAGE                             |\n" +
                            "           |----------------------------------------|\n" +
                            "           |Enter 1  |   Create new car             |\n" +
                            "           |Enter 2  |   Update current car         |\n" +
                            "           |Enter 3  |   Deleting car               |\n" +
                            "           |Enter 4  |   Return to main menu        |\n" +
                            "           |________________________________________|\n");
                    int caseTwoAnswer = console.nextInt();

                    switch (caseTwoAnswer) {
                        case 1:
                            //createNewCar();
                            break;
                        case 2:
                            //updateCar();
                            break;
                        case 3:
                            //deleteCar();
                            break;
                        case 4:
                            break;
                        default:
                            break;
                    }
                    break;

                case 3:
                    System.out.println(" " +
                            "            _____________________________________________ \n" +
                            "           | RENTAL CONTRACT MANAGE                      |\n" +
                            "           |---------------------------------------------|\n" +
                            "           |Enter 1  |   Create new rental contract      |\n" +
                            "           |Enter 2  |   Update current rental contract  |\n" +
                            "           |Enter 3  |   Deleting rental Contract        |\n" +
                            "           |Enter 4  |   Return to main menu             |\n" +
                            "           |---------------------------------------------|");
                    int caseThreeAnswer = console.nextInt();

                        switch (caseThreeAnswer) {
                            case 1:
                                //createNewCustomer();
                                break;
                            case 2:
                                //updateCustomer();
                                break;
                            case 3:
                                //deleteCustomer();
                                break;
                            case 4:
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
