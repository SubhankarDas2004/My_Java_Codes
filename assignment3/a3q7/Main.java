package a3q7;

import a3q7.travel.flights.flight;
import a3q7.travel.hotels.hotel;
import a3q7.travel.bookings.booking;

public class Main {
    public static void main(String[] args) {
        flight f1 = new flight("AI101", "New York", 450);
        hotel h1 = new hotel("Grand Plaza", "New York", 200);
        
        booking booking = new booking();
        
        booking.bookFlight(f1);
        System.out.println();
        booking.bookHotel(h1);
    }
}