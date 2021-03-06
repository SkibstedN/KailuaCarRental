package com.company;

public class Contract {
    private int rentalCarID;
    private int contractID;
    private String renterName;
    private String renterAddress;
    private int renterZipCode;
    private String city;
    private int driverLicensNumber;
    private String rentalFromDate;
    private String rentalToDate;
    private int maxKM;
    private int currentKM;
    private String licensePlate;

    public Contract(int rentalCarID, int contractID, String renterName, String renterAddress, int renterZipCode, String city, int driverLicensNumber,
                    String rentalFromDate, String rentalToDate, int maxKM, int currentKM, String licensePlate) {
        this.rentalCarID = rentalCarID;
        this.contractID = contractID;
        this.renterName = renterName;
        this.renterAddress = renterAddress;
        this.renterZipCode = renterZipCode;
        this.city = city;
        this.driverLicensNumber = driverLicensNumber;
        this.rentalFromDate = rentalFromDate;
        this.rentalToDate = rentalToDate;
        this.maxKM = maxKM;
        this.currentKM = currentKM;
        this.licensePlate = licensePlate;
    }
    public Contract (){

    }
}
