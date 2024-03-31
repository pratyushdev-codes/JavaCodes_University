// Write a java program for area calculation (circle, square, rectangle, cone and triangle) using
// classes and methods with switch statements.

import java.util.*;

import javax.print.attribute.standard.Sides;

public class AreaCalculation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose A shape to calculate Area");
        System.out.println(1);
        System.out.println(2);
        


        int choice = sc.nextInt();
        switch(choice){
            case 1:
            System.out.println("the area of  circle is : " );
            double radius =sc.nextInt();
            System.out.println(areaCircle(radius));
            break;

            case 2:
            System.out.println(" ");

            break;

            default :
            System.out.println("Invalid CHoice");
        }
    }
    
    
    
    
    public static double areaCircle(double radius){
        return Math.PI * radius * radius;
}public static double calculateSquarreArea(double sides){
    return sides * sides;
}

}