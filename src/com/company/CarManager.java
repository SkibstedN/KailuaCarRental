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

        //int carID = carTypeList.size() +2;
        int carID = 0;
        car = new CarType(carID, brand, model, fuelType, licensePlate, firstRegDate, odometer, carID, carType, motorSize, gearType,
                airCondition, cruiseControl, seatType, seatAmount, horsePower);
        carTypeList.add(car);
        SqlEngine.insertCar(car, carTypeList);
    }

    public static void updateCar (Scanner console, CarType carType1,ArrayList<CarType>carTypeList){
        boolean ValidateCarId = false;
        CarType carToUpdate = null;
        while(ValidateCarId != false) {
            System.out.println("List of all cars :");
            SqlEngine.getCar(carType1, carTypeList);
            for (CarType car : carTypeList
            ) {
                System.out.println(car);
            }
            System.out.println("Which car do you want to update? \n Enter Car ID : ");
            int input = console.nextInt();
            for (CarType car : carTypeList) {
                if (car.carID == input) {
                    System.out.println(car);
                    carToUpdate = car;
                    ValidateCarId = true;
                }
            }
            if(carToUpdate == null){
                System.out.println("The chosen Car ID does not exist, Enter a valid Car ID :");
            }

        }
        System.out.println(""+
                "            ________________________________________ \n" +
                "           | Update Odometer                        |\n" +
                "           |----------------------------------------|\n" +
                "           | Enter new odometer value:              |\n" +
                "           |----------------------------------------|\n" );
        int newOdometer = console.nextInt();
        carToUpdate.setOdometer(newOdometer);

        SqlEngine.updateCar(carToUpdate,carTypeList);

    }

    public static void deleteCar (Scanner console, CarType carType1,ArrayList<CarType>carTypeList){
        System.out.println("Here you will choose which car you want to delete from the database");
        for (CarType car: carTypeList
             ) {
            System.out.println(car);
        }

        System.out.println(""+
                "            _____________________________________________ \n" +
                "           | Deleting car                                |\n" +
                "           |---------------------------------------------|\n" +
                "           | Enter the ID of the car you want to delete  |\n" +
                "           |---------------------------------------------|\n" );
        int deleteCar = console.nextInt();

        for (CarType car : carTypeList) {
            if (car.carID == deleteCar) {
                System.out.println(car);
            }
        }
        System.out.println("" +
                "|---------------------------------------------------|\n" +
                "|Is this the car you want to delete? (yes or No)    |\n" +
                "|---------------------------------------------------|");
        String answer = console.next();
        while (!answer.equalsIgnoreCase("yes")){
            System.out.println("" +
                    "|----------------------------------------------|\n" +
                    "|Enter the ID of the car you want to delete    |\n" +
                    "|----------------------------------------------|");
            deleteCar = console.nextInt();
            for (CarType car : carTypeList) {
                if (car.carID == deleteCar) {
                    System.out.println(car);
                }
            }
            System.out.println("" +
                    "|---------------------------------------------------|\n" +
                    "|Is this the car you want to delete? (yes or No)    |\n" +
                    "|---------------------------------------------------|");
            answer = console.next();
        }
        SqlEngine.deleteCar(deleteCar);

    }
}
