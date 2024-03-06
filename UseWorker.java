import java.util.Scanner;

class Worker {
    private int hoursWorked;
    private double payRate;

    // Setter method to set the hours worked and pay rate
    public void setData(int hoursWorked, double payRate) {
        this.hoursWorked = hoursWorked;
        this.payRate = payRate;
    }

    // Calculate and return the salary of the worker
    public double calculateSalary() {
        double baseSalary = hoursWorked <= 40 ? hoursWorked * payRate : 40 * payRate;
        double overtimeSalary = hoursWorked > 40 ? (hoursWorked - 40) * (2 * payRate) : 0;
        return baseSalary + overtimeSalary;
    }
}

public class UseWorker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter hours worked: ");
        int hoursWorked = scanner.nextInt();

        System.out.print("Enter pay rate: ");
        double payRate = scanner.nextDouble();

        Worker worker = new Worker();
        worker.setData(hoursWorked, payRate);

        // Display the salary of the worker
        System.out.println("Salary of the worker: $" + worker.calculateSalary());

        scanner.close();
    }
}
