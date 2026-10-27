package Ride_Simulator;

public class EconomyRide extends Ride{
    private double pricePerMin;

    public EconomyRide(String passengerName, String pickup, String destination, double distanceKm, double durationMin, double pricePerKm, double pricePerMin) {
        super(passengerName, pickup, destination, distanceKm, durationMin, pricePerKm);
        this.pricePerMin = pricePerMin;
    }

    @Override
    public double calculateFare() {
        double temp = super.calculateFare()+(getDurationMin()*pricePerMin);
        if (temp <= 50){
            return 50;
        }else {
            return temp;
        }
    }

    @Override
    public String toString() {
        return "Passenger Name: "+getPassengerName()+" Pickup: "+getPickup()+" Destination: "+getDestination()+"\n"+
                "Distance Km: "+getDistanceKm()+" Duration Minute: "+getDurationMin()+" Price Per Km: "+getPricePerKm()+" Price Per Min: "+pricePerMin+" Total Fee: "+calculateFare();
    }
}
