// Write a java program to implement the arithmetic operations using inheritance.

import java.util.Scanner;

public class ArithmeticOperationInheritance {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        AdvancedArithmetic calculator = new AdvancedArithmetic();



 System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

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

        
    } class ArithmeticOperatrions{
  public double add(double num1, double num2){
    return num1+num2;
  }


  public  double subtract(double num1, double num2){
    return num1-num2;
  }
  public double multiply(double num1, double num2) {
    return num1 * num2;
}

class ArithmeticOperatrions extennds Artihmetic{
    public double
}

    }
}
