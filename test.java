
// //take input from the user , 3 varable a , b , c float type 
// calculation s1, s2, s3

// s1=a*b/c 

// s2=a*c\b;

// s3=b*c/a

// check which statement is greater

import java.util.*;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();

        float s1 = (a * b) / c;
        float s2 = (a * c) / b;
        float s3 = (b * c) / a;

        if (s1 > s2 && s1 > s3) {
            System.out.println("S1 operation is greater");

        } else if (s2 > s1 && s2 > s3) {
            System.out.println("S2 operation is greater");
        } else {
            System.out.println("S3 is the greatest oprator");
        }

    }
}