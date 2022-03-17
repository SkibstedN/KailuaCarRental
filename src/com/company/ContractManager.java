package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class ContractManager {

    public static void createRentalContract(Scanner console, ArrayList<Contract> rentalContractList, Contract contract, ArrayList<CarType> carTypeList){

        for (CarType car: carTypeList
             ) {
            System.out.println(car);
        }
        System.out.println("" +
                "|----------------------------|\n" +
                "|Enter which car to rent ID  |\n" +
                "|----------------------------|");
        int rentalCarID = console.nextInt();

        System.out.println("" +
                "|--------------------|\n" +
                "|Enter renter name   |\n" +
                "|--------------------|");
        String renterName = console.next();

        System.out.println("" +
                "|----------------------|\n" +
                "|Enter renter address  |\n" +
                "|----------------------|");
        console.nextLine();
        String renterAddress = console.nextLine();

        System.out.println("" +
                "|--------------------|\n" +
                "|Enter renter Zip Code   |\n" +
                "|--------------------|");
        int renterZipCode = console.nextInt();

        System.out.println("" +
                "|--------------------|\n" +
                "|Enter renter city   |\n" +
                "|--------------------|");
        String renterCity = console.next();

        System.out.println("" +
                "|-----------------------------|\n" +
                "|Enter driverlicense number   |\n" +
                "|-----------------------------|");
        int driverLicenseNumber = console.nextInt();

        System.out.println("" +
                "|-----------------------------------|\n" +
                "|Enter rental from date (YY-MM-DD)  |\n" +
                "|-----------------------------------|");
        String rentalFromDate = console.next();

        System.out.println("" +
                "|---------------------------------|\n" +
                "|Enter rental to date (YY-MM-DD)  |\n" +
                "|---------------------------------|");
        String rentalToDate = console.next();

        System.out.println("" +
                "|-------------------------------|\n" +
                "|Enter max km i rental period   |\n" +
                "|-------------------------------|");
        int maxKM = console.nextInt();

        System.out.println("" +
                "|---------------------------------------|\n" +
                "|Enter enter current km of rental car   |\n" +
                "|---------------------------------------|");
        int currentKM = console.nextInt();

        System.out.println("" +
                "|-----------------------------------|\n" +
                "|Enter licenseplate of rental car   |\n" +
                "|-----------------------------------|");
        String licensePlate = console.next();
        int contractID = rentalContractList.size()+2;

        contract = new Contract(rentalCarID,contractID, renterName, renterAddress, renterZipCode, renterCity, driverLicenseNumber,
                rentalFromDate, rentalToDate, maxKM, currentKM, licensePlate);
        rentalContractList.add(contract);

    }
    public static void updateContract (){

    }
    public static void deleteContract (){

    }
}
