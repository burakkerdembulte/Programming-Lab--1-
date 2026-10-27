package Ride_Simulator;

public class PremiumRide extends Ride {
    private double comfortFree,surgeMultiplier;

    public PremiumRide(String passengerName, String pickup, String destination, double distanceKm, double durationMin, double pricePerKm, double comfortFree, double surgeMultiplier) {
        super(passengerName, pickup, destination, distanceKm, durationMin, pricePerKm);
        this.comfortFree = comfortFree;

        if (surgeMultiplier<1 || surgeMultiplier>3){
            System.out.println("WARNING!!! SurgeMultiplier  should be between 1 and 3.");
            this.surgeMultiplier = 1;
        }else {
            this.surgeMultiplier = surgeMultiplier;
        }
    }

    @Override
    public double calculateFare() {
        return ((super.calculateFare()+comfortFree)*surgeMultiplier);
    }

    @Override
    public String toString() {
        return "Passenger Name: "+getPassengerName()+" Pickup: "+getPickup()+" Destination: "+getDestination()+"\n"+
                "Distance Km: "+getDistanceKm()+" Duration Minute: "+getDurationMin()+" Price Per Km: "+getPricePerKm()+
                " Comfort Fee: "+comfortFree+" SurgeMultiplier: "+surgeMultiplier+" Total Fee: "+calculateFare();
    }
}
