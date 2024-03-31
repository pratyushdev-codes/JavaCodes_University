public class FactorialofaNumber {
    public static void main(String[] args) {
        
    }public static int FactorialofaNumber(int [] num){ 
        
        int factorial = 0;
        if(num<0){
            return -1;
        }else{


            for(int i =0;i<num;i++){
                factorial = factorial*i;
            }
            return factorial;
        }




    }
}
