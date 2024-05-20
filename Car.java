public class Car {
    private String make;
    private String model;
    private int year;

    // Constructor with parameters
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Method to display car information
    public void displayInfo() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }

    // Main method
    public static void main(String[] args) {
        // Creating an object of Car with constructor
        Car myCar = new Car("Toyota", "Corolla", 2020);

        // Calling the method to display car information
        myCar.displayInfo();
    }
}
