package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class CarManager {

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
                "|----------------------------|\n" +
                "|Enter Size of motor (CCM)   |\n" +
                "|----------------------------|");
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

        car = new CarType(carID, brand, model, fuelType, licensePlate, firstRegDate, odometer, carID, carType, motorSize, gearType,
                airCondition, cruiseControl, seatType, seatAmount, horsePower);
        carTypeList.add(car);
    }

    public static void updateCar (){

    }

    public static void deleteCar (){

    }
}
