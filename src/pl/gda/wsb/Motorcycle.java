package pl.gda.wsb;

public class Motorcycle extends Vehicle {

    private Double engineCapacity;

    public Motorcycle(String registrationNumber, String vinNumber, String color, Double price, Double fuelState, Double distanceCounter, Double getFuelState, Double engineCapacity) {

        super(registrationNumber, vinNumber, color, price, fuelState, distanceCounter, getFuelState);
        this.engineCapacity = engineCapacity;
    }

    public void drive(Double kilometersCounter){

        if (kilometersCounter <= this.distance()){
            System.out.println(("Przejechales: " + kilometersCounter + "km"));
            System.out.println(this.distanceCounter);
            this.distanceCounter += this.fuelState*100.00/this.getFuelState;
            System.out.println(this.distanceCounter);
            System.out.println(this.fuelState);
            this.fuelState -= (kilometersCounter/100.00)*this.getFuelState;
        }
        else System.out.println("Nie wystarczy Ci paliwa.");
    }

    public void refuel(){
        System.out.println(("Zatankuj"));
    }

    public Double distance(){

        if (this.fuelState!= 0){

            System.out.println("Mozesz jeszcze jechac");
        }
        return distanceCounter;
    }
}
