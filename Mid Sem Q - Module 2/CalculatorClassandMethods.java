// Write a java program for develop the functionality of calculator using classes and methods
// with switch statements

import java.util.Scanner;

public class CalculatorClassandMethods {
   public static void main(String[] args) {

    Scanner sc= new Scanner(System.in);
    double num1 =sc.nextInt();
    double num2= sc.nextInt();

    int choice = sc.nextInt();
     double result =0.0;

    switch (choice){
        case 1: result = Calculator.add(num1, num2);
    }





    
   }class Calculator{
    

     public static double add(double a, double b){
        return a+b;
     }

     public static double sub(double a, double b){
        return a-b;
     }





   }
}
