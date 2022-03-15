package com.company;

public class CarType extends Car{
    protected int carID;
    protected String carType;
    protected int motorSize;
    protected String gearType;
    protected String airCondition;
    protected String cruiseControl;
    protected String seatType;
    protected int seatAmount;
    protected int horsePower;

    public CarType(String brand, String model, String fuelType, String regNumber, String date, int odometer, int carID,
                   String carType, int motorSize, String gearType, String airCondition, String cruiseControl,
                   String seatType, int seatAmount, int horsePower) {
        super(brand, model, fuelType, regNumber, date, odometer);
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

    public CarType(String brand, String model, String fuelType, String regNumber, String date, int odometer) {
        super(brand, model, fuelType, regNumber, date, odometer);
    }

    public CarType() {
        super();
    }

    public String toString (){
        return super.toString() +

                "Car ID             ||    " + carID + "|\n" +
                "Car Type           ||    " + carType + "\n" +
                "Motor Size         ||    " + motorSize + "\n" +
                "Gear Type          ||    " + gearType + "\n" +
                "Air Condition      ||    " + airCondition + "\n" +
                "Cruise Control     ||    " + cruiseControl + "\n" +
                "Seat Type          ||    " + seatType + "\n" +
                "Seat Amount        ||    " + seatAmount + "\n" +
                "Horsepower         ||    " + horsePower + "\n";
    }

}
