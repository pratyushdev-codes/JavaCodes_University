// Implement the calculator operation using Interface. Create an Interface named arithmetic has
// declared methods add, sub, mul, div and mod with their method signature as access modifier
// is public by default, void return type and two int / float arguments as their parameters. A
// concrete class named as operation has implemented arithmetic interface by providing an
// implementation of its methods. 


public class Calculator {
    public static void main(String[] args) {
        Operation operation = new Operation();

        operation.add(10, 4);
        operation.sub(89, 80);

        
    }

    interface  Arithmetic{
        void add(int a , int b);
        void  sub();
        void mul();
        void div();
        void mod();
    }


  class Operation implements Arithmetic{
    public void add(int a , int b){
        System.out.println(a+b);
    }

    public void sub(int a, int b) {
        System.out.println("Subtraction Result: " + (a - b));
    }
    public void mul(int a, int b) {
        System.out.println("Multiplication Result: " + (a * b));
    }

    public void mod(int a, int b) {
        if (b == 0) {
            System.out.println("Cannot compute modulus by zero!");
        } else {
            System.out.println("Modulus Result: " + (a % b));
        }

  }





}


}