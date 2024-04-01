import java.util.Scanner;

// Base class for shapes
class Shape {
    // Method to calculate area (to be overridden by subclasses)
    public double calculateArea() {
        return 0; // Default implementation for unspecified shapes
    }
}

// Subclass representing a square
class Square extends Shape {
    private double side;

    // Constructor
    public Square(double side) {
        this.side = side;
    }

    // Override method to calculate area of square
    @Override
    public double calculateArea() {
        return side * side;
    }
}

// Subclass representing a rectangle
class Rectangle extends Shape {
    private double length;
    private double width;

    // Constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Override method to calculate area of rectangle
    @Override
    public double calculateArea() {
        return length * width;
    }
}

// Subclass representing a triangle
class Triangle extends Shape {
    private double base;
    private double height;

    // Constructor
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    // Override method to calculate area of triangle
    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }
}

// Subclass representing a circle
class Circle extends Shape {
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Override method to calculate area of circle
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for shapes
        System.out.println("Calculate Area of Shapes:");
        System.out.println("1. Square");
        System.out.println("2. Rectangle");
        System.out.println("3. Triangle");
        System.out.println("4. Circle");
        System.out.print("Enter your choice (1-4): ");
        int choice = scanner.nextInt();

        double area;
        switch (choice) {
            case 1:
                System.out.print("Enter side length of square: ");
                double side = scanner.nextDouble();
                Square square = new Square(side);
                area = square.calculateArea();
                System.out.println("Area of Square: " + area);
                break;
            case 2:
                System.out.print("Enter length of rectangle: ");
                double length = scanner.nextDouble();
                System.out.print("Enter width of rectangle: ");
                double width = scanner.nextDouble();
                Rectangle rectangle = new Rectangle(length, width);
                area = rectangle.calculateArea();
                System.out.println("Area of Rectangle: " + area);
                break;
            case 3:
                System.out.print("Enter base length of triangle: ");
                double base = scanner.nextDouble();
                System.out.print("Enter height of triangle: ");
                double height = scanner.nextDouble();
                Triangle triangle = new Triangle(base, height);
                area = triangle.calculateArea();
                System.out.println("Area of Triangle: " + area);
                break;
            case 4:
                System.out.print("Enter radius of circle: ");
                double radius = scanner.nextDouble();
                Circle circle = new Circle(radius);
                area = circle.calculateArea();
                System.out.println("Area of Circle: " + area);
                break;
            default:
                System.out.println("Invalid choice!");
        }

        scanner.close();
    }
}
