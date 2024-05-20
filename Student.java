public class Student {
    // Instance variables
    private String name;
    private int age;
    private String department;

    // Constructor
    public Student(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    // Method to display student information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Department: " + department);
    }

    // Main method
    public static void main(String[] args) {
        // Creating an object of Student with constructor
        Student student1 = new Student("John", 20, "Computer Science");

        // Calling the method to display student information
        student1.displayInfo();
    }
}
