import java.util.Scanner;

// Employee class with encapsulated properties
class Employee {
    private int empId;
    private String name;
    private double salary;
    private double pf;
    private double hra;

    // Constructor to initialize employee details
    public Employee(int empId, String name, double salary, double pf, double hra) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
        this.pf = pf;
        this.hra = hra;
    }

    // Getter methods for encapsulated properties
    public int getEmpId() {
        return empId;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public double getPf() {
        return pf;
    }

    public double getHra() {
        return hra;
    }

    // Method to calculate total salary
    public double calculateTotalSalary() {
        return salary + hra - pf;
    }
}

public class EmployeDetais {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        // Create an array to store employee objects
        Employee[] employees = new Employee[n];

        // Input employee details
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Employee " + (i + 1) + ":");
            System.out.print("Employee ID: ");
            int empId = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Salary: ");
            double salary = scanner.nextDouble();
            System.out.print("PF: ");
            double pf = scanner.nextDouble();
            System.out.print("HRA: ");
            double hra = scanner.nextDouble();

            // Create employee object and add to the array
            employees[i] = new Employee(empId, name, salary, pf, hra);
        }

        // Calculate and display total salary for all employees
        System.out.println("\nEmployee Details:");
        double totalSalary = 0;
        for (Employee emp : employees) {
            System.out.println("\nEmployee ID: " + emp.getEmpId());
            System.out.println("Name: " + emp.getName());
            System.out.println("Salary: " + emp.getSalary());
            System.out.println("PF: " + emp.getPf());
            System.out.println("HRA: " + emp.getHra());
            double empTotalSalary = emp.calculateTotalSalary();
            System.out.println("Total Salary: " + empTotalSalary);
            totalSalary += empTotalSalary;
        }
        System.out.println("\nTotal Salary for all employees: " + totalSalary);

        scanner.close();
    }
}
