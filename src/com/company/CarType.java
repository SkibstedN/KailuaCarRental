package com.company;

public class CarType extends Car{
    protected int carType_ID;
    protected String carType;
    protected int motorSize;
    protected String gearType;
    protected String airCondition;
    protected String cruiseControl;
    protected String seatType;
    protected int seatAmount;
    protected int horsePower;

    public CarType(int carID, String brand, String model, String fuelType, String regNumber, String date, int odometer, int carType_ID,
                   String carType, int motorSize, String gearType, String airCondition, String cruiseControl,
                   String seatType, int seatAmount, int horsePower) {
        super(carID,brand, model, fuelType, regNumber, date, odometer);
        this.carID = carID;
        this.carType = carType;
        this.motorSize = motorSize;
        this.gearType = gearType;
        this.airCondition = airCondition;
        this.cruiseControl = cruiseControl;
        this.seatType = seatType;
        this.seatAmount = seatAmount;
        this.horsePower = horsePower;
    }

    public CarType(int carID,String brand, String model, String fuelType, String regNumber, String date, int odometer) {
        super(carID,brand, model, fuelType, regNumber, date, odometer);
    }

    public CarType() {
        super();
    }

    @Override
    public String toString (){
        return super.toString() +

                "Car ID                      ||    " + carID + "\n" +
                "Car Type                    ||    " + carType + "\n" +
                "Motor Size                  ||    " + motorSize + "\n" +
                "Gear Type                   ||    " + gearType + "\n" +
                "Air Condition               ||    " + airCondition + "\n" +
                "Cruise Control              ||    " + cruiseControl + "\n" +
                "Seat Type                   ||    " + seatType + "\n" +
                "Seat Amount                 ||    " + seatAmount + "\n" +
                "Horsepower                  ||    " + horsePower + "\n";
    }

    public int getCarType_ID() {
        return carType_ID;
    }

    public void setCarType_ID(int carType_ID) {
        this.carType_ID = carType_ID;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public int getMotorSize() {
        return motorSize;
    }

    public void setMotorSize(int motorSize) {
        this.motorSize = motorSize;
    }

    public String getGearType() {
        return gearType;
    }

    public void setGearType(String gearType) {
        this.gearType = gearType;
    }

    public String getAirCondition() {
        return airCondition;
    }

    public void setAirCondition(String airCondition) {
        this.airCondition = airCondition;
    }

    public String getCruiseControl() {
        return cruiseControl;
    }

    public void setCruiseControl(String cruiseControl) {
        this.cruiseControl = cruiseControl;
    }

    public String getSeatType() {
        return seatType;
    }

    public void setSeatType(String seatType) {
        this.seatType = seatType;
    }

    public int getSeatAmount() {
        return seatAmount;
    }

    public void setSeatAmount(int seatAmount) {
        this.seatAmount = seatAmount;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }
}
