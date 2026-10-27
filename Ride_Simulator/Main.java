package Ride_Simulator;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Ride> rides = new ArrayList<>();


        rides.add(new Ride("Burak", "Erciyes Üniversitesi", "Talas", 5.5, 12.0, 20.0));
        rides.add(new EconomyRide("Ali", "Kayseri Meydan", "Otogar", 15.0, 25.0, 15.0, 2.0));
        rides.add(new PremiumRide("Ayşe", "Erkilet Havalimanı", "Kayseri Forum", 22.0, 30.0, 25.0, 150.0, 1.5));
        rides.add(new SharedRide("Mehmet", "Kocasinan", "Melikgazi", 10.0, 20.0, 12.0, 1.5, 3));




        for (Ride r : rides) {

            System.out.println(r);
            System.out.println("--------------------------------------------------");


        }


    }
}