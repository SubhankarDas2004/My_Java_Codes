abstract class Shape 
{
    String color;

    Shape(String color) 
    {
        this.color = color;
    }

    abstract double calculateArea();
    abstract void draw();
}

class Circle extends Shape {
    double radius;

    Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    double calculateArea() {
        return 3.14* radius * radius;  
    }

    void draw() {
        System.out.println("Drawing " + color + " Circle");
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + calculateArea());
    }
}

class Rectangle extends Shape {
    double length;
    double breadth;

    Rectangle(String color, double length, double breadth) {
        super(color);
        this.length = length;
        this.breadth = breadth;
    }

    double calculateArea() {
        return length * breadth;  
    }

    void draw() {
        System.out.println("Drawing " + color + " Rectangle");
        System.out.println("Length: " + length + ", Breadth: " + breadth);
        System.out.println("Area: " + calculateArea());
    }
}

public class a3q4 {
    public static void main(String[] args) {
        
        Circle c = new Circle("Red", 5);
        c.draw();
        
        System.out.println("------X------");
        
        
        Rectangle r = new Rectangle("Blue", 4, 6);
        r.draw();
    }
}
