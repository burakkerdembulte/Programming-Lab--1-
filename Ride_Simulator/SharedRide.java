package Ride_Simulator;

public class SharedRide extends EconomyRide{
    private int passengerCount;

    public SharedRide(String passengerName, String pickup, String destination, double distanceKm, double durationMin, double pricePerKm, double pricePerMin, int passengerCount) {
        super(passengerName, pickup, destination, distanceKm, durationMin, pricePerKm, pricePerMin);

        if (passengerCount<1 || passengerCount>4){
            System.out.println("WARNING!!! Passenger count should be between 1 and 4.");
            this.passengerCount=1;
        }else {
            this.passengerCount = passengerCount;
        }
    }
    @Override
    public double calculateFare() {
        double person = super.calculateFare()/passengerCount;
        person += person*0.1;
        if (person <= 50){
            return 50;
        }else {
            return person;
        }
    }
    @Override
    public String toString() {
        return super.toString()+" Passenger Count: "+passengerCount;
    }
}
