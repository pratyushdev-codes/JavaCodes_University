public class MathOperations {
    // Method to add two integers
    public static int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers
    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to add two doubles
    public static double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        int sum1 = MathOperations.add(5, 10);
        System.out.println("Sum of two integers: " + sum1);

        int sum2 = MathOperations.add(5, 10, 15);
        System.out.println("Sum of three integers: " + sum2);

        double sum3 = MathOperations.add(3.5, 2.5);
        System.out.println("Sum of two doubles: " + sum3);
    }
}
