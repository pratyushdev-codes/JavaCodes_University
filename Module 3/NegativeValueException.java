package Module 3;

public // NegativeValueException.java
public class NegativeValueException extends Exception {
    public NegativeValueException(String message) {
        super(message);
    }
}

// NegativeValueChecker.java
import java.util.Scanner;

public class NegativeValueChecker {
    public static void checkValue(int value) throws NegativeValueException {
        if (value < 0) {
            throw new NegativeValueException("Negative values are not allowed: " + value);
        } else {
            System.out.println("The entered value is: " + value);
        }
    }
}

// Main.java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a value: ");
        int value = scanner.nextInt();

        try {
            NegativeValueChecker.checkValue(value);
        } catch (NegativeValueException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
 {
    
}
