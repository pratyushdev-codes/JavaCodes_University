import java.util.Scanner;

// Employee class with encapsulated properties
class Employee {
    private int empId;
    private String name;
    private int age;
    private double salary;
    private String department;

    // Constructor to initialize employee details
    public Employee(int empId, String name, int age, double salary, String department) {
        this.empId = empId;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }

    // Getter methods for encapsulated properties
    public int getEmpId() {
        return empId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    // Setter methods for encapsulated properties
    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input employee details
        System.out.println("Enter Employee Details:");
        System.out.print("Employee ID: ");
        int empId = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Age: ");
        int age = scanner.nextInt();
        System.out.print("Salary: ");
        double salary = scanner.nextDouble();
        scanner.nextLine(); // Consume newline
        System.out.print("Department: ");
        String department = scanner.nextLine();

        // Create employee object
        Employee employee = new Employee(empId, name, age, salary, department);

        // Display employee details
        System.out.println("\nEmployee Details:");
        System.out.println("Employee ID: " + employee.getEmpId());
        System.out.println("Name: " + employee.getName());
        System.out.println("Age: " + employee.getAge());
        System.out.println("Salary: " + employee.getSalary());
        System.out.println("Department: " + employee.getDepartment());

        scanner.close();
    }
}
