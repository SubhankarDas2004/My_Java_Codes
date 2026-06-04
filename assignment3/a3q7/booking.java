package a3q7.travel.bookings;

import a3q7.travel.flights.flight;
import a3q7.travel.hotels.hotel;

public class booking {
    
    public void bookFlight(flight f) {
        System.out.println("=== Flight Booking Confirmed ===");
        f.getDetails();
    }

    public void bookHotel(hotel h) {
        System.out.println("=== Hotel Booking Confirmed ===");
        h.getDetails();
    }
}