// Write a java program for Library details using Interface for the data members like book_name,
// book_title, acctype, date and bal. Next to calculate the return date and fine amount if any,
// finally to display all the details. 

import java.util.Scanner;

public class LibraryDetails {
    public static void main(String[] args) {
      LibraryDetails librrDetails = new LibraryDetails();
      librrDetails.inputDetails();
      librrDetails.calculateArea();
        
    }


    interface Library {
        void inputDetails();
        void calculateReturnDate();
        void calculateFine();
        void displayDetails();
    }



    class LibraryDetails implements Library {
      protected  String book_name;
      protected  String book_title;
      protected  String acctype;
      protected   int date;
      protected  double bal;


  public void inputDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Library Details:");
        System.out.print("Book Name: ");
        bookName = scanner.nextLine();
        System.out.print("Book Title: ");
        bookTitle = scanner.nextLine();
        System.out.print("Account Type: ");
        accType = scanner.nextLine();
        System.out.print("Date (DD/MM/YYYY): ");
        date = scanner.nextLine();
        System.out.print("Balance: ");
        balance = scanner.nextDouble();
        scanner.close();
    }


    public void calculateReturnDate(){
        int returnDate = "15 days from now"+Date;
    }


    public static void fine(){
        fineAmount = 0.1*balance;
    }

public  void displayDetails() {

    System.out.println("\nLibrary Details:");
    System.out.println("Book Name: " + bookName);
    System.out.println("Book Title: " + bookTitle);
    System.out.println("Account Type: " + accType);
    System.out.println("Date: " + date);
    System.out.println("Return Date: " + returnDate);
    System.out.println("Balance: " + balance);
    if (fineAmount > 0) {
        System.out.println("Fine Amount: " + fineAmount);
    } else {
        System.out.println("No fine.");
    }
}
}




    }

