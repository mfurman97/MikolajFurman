package pl.gda.wsb;

public class Main {


    public static void main(String[] args) {
        Car car1 = new Car("GLE553","YYARN064000000427","blue", 20000.00, 5.0,900.0,4.3,5);
        Car car2 = new Car( "GA5432", "WAUZZZ8E63A292587", "red", 18500.00, 2.0, 1000.0,2.2,4);

        car1.drive(889.00);
        car2.distance();
        car1.refuel();



        Motorcycle motorcycle1 = new Motorcycle("WW434343","YV1DZ7056B2224670","black", 12000.00, 1.3,200.0,4.3,2.0);
        Motorcycle motorcycle2 = new Motorcycle( "WA43454", "WAUZZZ8E13A154665", "grey", 16660.00, 1.3, 300.0,2.2,4.0);

        motorcycle1.drive(250.00);
        motorcycle2.distance();
        motorcycle2.refuel();


        Truck truck1 = new Truck("GD43244","WF0GXXGCDG9K21610","blue", 222000.00, 7.3,1200.0,4.3,7700.0);
        Truck truck2 = new Truck( "GD2323", "W0L0SDL68B4011713", "red", 243000.00, 5.3, 1300.0,2.2,13000.0);

        truck1.drive(1199.00);
        truck2.distance();
        truck1.refuel();
    }
}
