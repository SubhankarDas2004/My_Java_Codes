package a3q7.travel.hotels;


public class hotel {
    String hotelName;
    String location;
    double price;

    public hotel(String hotelName, String location, double price) {
        this.hotelName = hotelName;
        this.location = location;
        this.price = price;
    }

    public void getDetails() {
        System.out.println("Hotel Name: " + hotelName);
        System.out.println("Location: " + location);
        System.out.println("Price per night: $" + price);
    }
}