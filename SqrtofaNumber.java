import java.util.Scanner;

public class SqrtofaNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
    }public static int Sqrt(int n){
        
        for(int i =0;i<n;i++){
            if((i*i)==n){
                return i;
            }else{
                return -1;
            }
        }
    }
}
