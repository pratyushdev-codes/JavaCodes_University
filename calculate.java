import java.util.Scanner;
class Circle {
    double radius;
    
    public Circle() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        radius = scanner.nextDouble();
    }
    
    public void area() {
        double circleArea = Math.PI * Math.pow(radius, 2);
        System.out.println("Area of the circle will be: " + circleArea);
    }
    
    public void circumference() {
        double circleCircumference = 2 * Math.PI * radius;
        System.out.println("Circumference of the circle will be: " + circleCircumference);
    }
}

class calculate {
    public static void main(String[] args) {
        
        Circle c = new Circle();

        c.area();
        c.circumference();
    }
}