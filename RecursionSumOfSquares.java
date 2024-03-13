public class RecursionSumOfSquares {
    public static void main(String[] args) {
        int i = 1;
        int k = 4;
        
        int result = sumofsq(i, k);
        System.out.println("The sum of squares from 1 to 100 is: " + result);
    }

    public static int sumofsq(int i, int k) {
        if (i <= k) {
            return i * i + sumofsq(i + 1, k);
        } else {
            return 0;
        }
    }
}
