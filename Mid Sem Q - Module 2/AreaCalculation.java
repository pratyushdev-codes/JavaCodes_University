import java.util.Scanner;

public class AreaCalculation {

    public static void main(String[] args) {

        Shape circle = new Shape("circle");
        circle.calculateArea();
        circle.displayArea();


        Shape square = new Shape("square");
        square.calculateArea();
        square.displayArea();


        Shape square = new Shape("square");
        square.calculateArea();
        square.displayArea();

        Shape square = new Shape("square");
        square.calculateArea();
        square.displayArea();





        
    }class Shape{
        String type;
        double area;
        public Shape(String Type){
            this.type = Type;
        }


        public void calculateArea() {
            Scanner scanner = new Scanner(System.in);
            switch (type.toLowerCase()) {
                case "circle":
                    System.out.print("Enter the radius of the circle: ");
                    double radius = scanner.nextDouble();
                    area = Math.PI * radius * radius;
                    break;
                case "square":
                    System.out.print("Enter the side length of the square: ");
                    double side = scanner.nextDouble();
                    area = side * side;
                    break;
                case "rectangle":
                    System.out.print("Enter the length of the rectangle: ");
                    double length = scanner.nextDouble();
                    System.out.print("Enter the width of the rectangle: ");
                    double width = scanner.nextDouble();
                    area = length * width;
                    break;
                case "cone":
                    System.out.print("Enter the radius of the cone: ");
                    double coneRadius = scanner.nextDouble();
                    System.out.print("Enter the height of the cone: ");
                    double coneHeight = scanner.nextDouble();
                    area = Math.PI * coneRadius * (coneRadius + Math.sqrt(coneHeight * coneHeight + coneRadius * coneRadius));
                    break;
                case "triangle":
                    System.out.print("Enter the base length of the triangle: ");
                    double base = scanner.nextDouble();
                    System.out.print("Enter the height of the triangle: ");
                    double height = scanner.nextDouble();
                    area = 0.5 * base * height;
                    break;
                default:
                    System.out.println("Invalid shape type!");
                    break;
            }
            scanner.close();
        }
        public void displayArea() {
            System.out.println("Area of " + type + ": " + area);
        }
    }









        }



    

