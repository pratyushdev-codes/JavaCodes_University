import java.util.Scanner;

// Base class for arithmetic operations
class Arithmetic {
    // Method to perform addition
    public double add(double num1, double num2) {
        return num1 + num2;
    }

    // Method to perform subtraction
    public double subtract(double num1, double num2) {
        return num1 - num2;
    }

    // Method to perform multiplication
    public double multiply(double num1, double num2) {
        return num1 * num2;
    }

    // Method to perform division
    public double divide(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Error: Cannot divide by zero!");
            return 0;
        }
        return num1 / num2;
    }
}

// Intermediate class inheriting from Arithmetic class to implement modulus operation
class AdvancedArithmetic extends Arithmetic {
    // Method to perform modulus operation
    public double modulus(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Error: Cannot compute modulus by zero!");
            return 0;
        }
        return num1 % num2;
    }
}

// Derived class inheriting from AdvancedArithmetic class to implement operations using multi-level inheritance
class MultiLevelArithmetic extends AdvancedArithmetic {
    // Constructor
    public MultiLevelArithmetic() {
        super(); // Call the constructor of the base class
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MultiLevelArithmetic calculator = new MultiLevelArithmetic();

        // Input two numbers
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        // Input the operation
        System.out.println("Choose operation:");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        System.out.println("5. Modulus (%)");
        System.out.print("Enter your choice (1-5): ");
        int choice = scanner.nextInt();

        double result;
        switch (choice) {
            case 1:
                result = calculator.add(num1, num2);
                System.out.println("Result: " + result);
                break;
            case 2:
                result = calculator.subtract(num1, num2);
                System.out.println("Result: " + result);
                break;
            case 3:
                result = calculator.multiply(num1, num2);
                System.out.println("Result: " + result);
                break;
            case 4:
                result = calculator.divide(num1, num2);
                System.out.println("Result: " + result);
                break;
            case 5:
                result = calculator.modulus(num1, num2);
                System.out.println("Result: " + result);
                break;
            default:
                System.out.println("Invalid choice!");
        }

        scanner.close();
    }
}
