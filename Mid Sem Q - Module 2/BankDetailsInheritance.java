import java.util.Scanner;

public class BankDetailsInheritance {
  Scanner sc= new Scanner(System.in);
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
    }

    class Account {
        protected int accNo;
        protected String name;
        protected int age;
        protected char gender;
        protected String accType;
        protected double balance;
    
        // Method to get account details
        public void getAccountDetails() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter Account Details:");
            System.out.print("Account Number: ");
            accNo = scanner.nextInt();
            System.out.print("Name: ");
            name = scanner.next();
            System.out.print("Age: ");
            age = scanner.nextInt();
            System.out.print("Gender (M/F): ");
            gender = scanner.next().charAt(0);
            System.out.print("Account Type: ");
            accType = scanner.next();
            System.out.print("Initial Balance: ");
            balance = scanner.nextDouble();
        }
 public void displayBalance(){
    System.out.println(balance);
 }


 public void withdraw(double amount){
    if(amount>balance){
        System.out.println("Invalid balance");
    }else{
        balance = balance-amount;
        System.out.println("Amount withdrawn");
    }
 }



 public void deposit(int amount){
    balance = balance+amount;
    System.out.println("Amont added");
 }

 class SavingsAccount extends Account{
    public void calculateIntrest(){
        Scanner sc = new Scanner(System.in);
        int intrestRate = sc.nextInt();
        double interest = balance * (intrestRate / 100);
        System.out.println(intrestRate);
    }
 }


}

}