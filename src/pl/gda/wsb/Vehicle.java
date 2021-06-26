package pl.gda.wsb;


public abstract class Vehicle {

    protected String registrationNumber;
    protected String VinNumber;
    protected String color;
    protected Double price;
    protected Double fuelState;
    protected Double distanceCounter;
    protected Double getFuelState;


    protected Vehicle(String registrationNumber, String vinNumber, String color, Double price, Double fuelState, Double distanceCounter, Double getFuelState) {

        this.registrationNumber = registrationNumber;
        VinNumber = vinNumber;
        this.color = color;
        this.price = price;
        this.fuelState = fuelState;
        this.distanceCounter = distanceCounter;
        this.getFuelState = getFuelState;
    }

}
