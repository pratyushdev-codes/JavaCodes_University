// Check Palindrome code

import java.util.Scanner;

public class isPalindrome {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int originalNumber = n;
        int reverse =0;

        while(n!=0){
            int digit  =n%10;
            reverse = reverse/10;
             n = n/10;
        }
        if(originalNumber == reverse){
            System.out.println("It is a Plaindrome Number");
        }else{
            System.out.println("It is a Plaindrome Number");
        }
    }
    
}
