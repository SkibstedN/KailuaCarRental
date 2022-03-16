package com.company;

public class Car {
    protected int carID;
    protected String brand;
    protected String model;
    protected String fuelType;
    protected String regNumber;
    protected String date;
    protected int odometer;

    public Car(int carID,String brand, String model, String fuelType, String regNumber, String date, int odometer) {
        this.carID = carID;
        this.brand = brand;
        this.model = model;
        this.fuelType = fuelType;
        this.regNumber = regNumber;
        this.date = date;
        this.odometer = odometer;
    }

    public Car() {

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    @Override
    public String toString() {
        return "" +
                "|--------------------------------------------|\n" +
                "|      Kailua CarRental >> CAR <<            |\n" +
                "|--------------------------------------------|\n\n" +
                "Brand                       ||    " + brand + "\n" +
                "Model                       ||    " + model + "\n" +
                "Fuel Type                   ||    " + fuelType + "\n" +
                "License Plate               ||    " + regNumber + "\n" +
                "First Registration Date     ||    " + date + "\n" +
                "Current Odometer            ||    " + odometer + "\n" ;


        /*"com.company.Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", fuelType='" + fuelType + '\'' +
                ", regNumber=" + regNumber +
                ", date='" + date + '\'' +
                ", odometer=" + odometer +
                '}';*/
    }
}
