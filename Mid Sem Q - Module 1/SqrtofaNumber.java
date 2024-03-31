import java.util.Scanner;

public class SqrtOfaNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();

        if (number < 0) {
            System.out.println("Square root is not defined for negative numbers.");
        } else {
            double low = 0;
            double high = number;
            double epsilon = 1e-15; // Tolerance for precision

            while (high - low > epsilon) {
                double mid = (low + high) / 2;
                if (mid * mid > number) {
                    high = mid;
                } else {
                    low = mid;
                }
            }

            System.out.println("Square root of " + number + " is approximately: " + low);
        }

        scanner.close();
    }
}
