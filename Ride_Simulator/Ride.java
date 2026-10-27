package Ride_Simulator;

public class Ride {
    private String passengerName,pickup,destination;
    private double distanceKm,durationMin,pricePerKm;

    public Ride(String passengerName, String pickup, String destination, double distanceKm, double durationMin, double pricePerKm) {
        this.passengerName = passengerName;
        this.pickup = pickup;
        this.destination = destination;
        this.distanceKm = distanceKm;
        this.durationMin = durationMin;
        this.pricePerKm = pricePerKm;

        if( distanceKm <= 0 ){
            System.out.println("WARNING !!! Distance  must be positive.");
            this.distanceKm = 1;
        }
        if( durationMin <= 0 ){
            System.out.println("WARNING !!! Duration  must be positive.");
            this.durationMin = 1;
        }
        if( pricePerKm <= 0 ){
            System.out.println("WARNING !!! Price per Km  must be positive.");
            this.pricePerKm = 1;
        }

    }

    public String getPassengerName() {
        return passengerName;
    }

    public String getPickup() {
        return pickup;
    }

    public String getDestination() {
        return destination;
    }

    public double getDistanceKm() {
        return distanceKm;
    }

    public double getDurationMin() {
        return durationMin;
    }

    public double getPricePerKm() {
        return pricePerKm;
    }
    public double calculateFare(){
        return (distanceKm*pricePerKm);
    }

    @Override
    public String toString() {
        return "Passenger Name: "+passengerName+" Pickup: "+pickup+" Destination: "+destination+"\n"+
                " Distance Km: "+distanceKm+" Duration Minute: "+durationMin+" Price Per Km: "+pricePerKm+" Total Fee: "+calculateFare();
    }
}
