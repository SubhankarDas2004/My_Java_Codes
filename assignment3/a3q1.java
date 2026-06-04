class Vehicle {
    String brand;
    String model;
    int year;

    Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        System.out.println("Vehicle constructor called");
    }

    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}

class Car extends Vehicle {
    String fuelType;

    Car(String brand, String model, int year, String fuelType) {
        super(brand, model, year); 
        this.fuelType = fuelType;
        System.out.println("Car constructor called");
    }

    void displayDetails() {
        super.displayDetails();  
        System.out.println("Fuel Type: " + fuelType);
    }
}

class LuxuryCar extends Car {
    String feature;

    LuxuryCar(String brand, String model, int year, String fuelType, String feature) {
        super(brand, model, year, fuelType);  
        this.feature = feature;
        System.out.println("LuxuryCar constructor called");
    }


    void displayDetails() {
        super.displayDetails(); 
        System.out.println("Feature: " + feature);
    }
}

public class a3q1 {
    public static void main(String[] args) {
    
        LuxuryCar lc = new LuxuryCar("Tesla", "Model S", 2023, "Electric", "Autopilot");
        
        System.out.println("details!!!!");
        lc.displayDetails();
    }
}