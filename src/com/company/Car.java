package com.company;

public class Car {

    private String brand;
    private String model;
    private String fuelType;
    private int regNumber;
    private String date;
    private int odometer;

    public Car(String brand, String model, String fuelType, int regNumber, String date, int odometer) {
        this.brand = brand;
        this.model = model;
        this.fuelType = fuelType;
        this.regNumber = regNumber;
        this.date = date;
        this.odometer = odometer;
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

    public int getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(int regNumber) {
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
        return "com.company.Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", fuelType='" + fuelType + '\'' +
                ", regNumber=" + regNumber +
                ", date='" + date + '\'' +
                ", odometer=" + odometer +
                '}';
    }
}
