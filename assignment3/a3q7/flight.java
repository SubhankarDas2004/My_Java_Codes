package a3q7.travel.flights;

public class flight {
    String flightNumber;
    String destination;
    double price;

    public flight(String flightNumber, String destination, double price) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.price = price;
    }

    public void getDetails() {
        System.out.println("Flight Number: " + flightNumber);
        System.out.println("Destination: " + destination);
        System.out.println("Price: $" + price);
    }
}