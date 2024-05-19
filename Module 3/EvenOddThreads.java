
// Write a Java program in which thread A will display the even numbers between 1 to 50 and thread B will display the odd numbers between 1 to 50. After 3 iterations thread A should go to sleep for 500ms A
class EvenNumberThread implements Runnable {
    @Override
    public void run() {
        try {
            int count = 0;
            for (int i = 2; i <= 50; i += 2) {
                System.out.println("Thread A (Even): " + i);
                count++;
                if (count % 3 == 0) {
                    System.out.println("Thread A (Even) going to sleep for 500ms.");
                    Thread.sleep(500);
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class OddNumberThread implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i < 50; i += 2) {
            System.out.println("Thread B (Odd): " + i);
        }
    }
}

public class EvenOddThreads {
    public static void main(String[] args) {
        Thread threadA = new Thread(new EvenNumberThread());
        Thread threadB = new Thread(new OddNumberThread());

        threadA.start();
        threadB.start();
    }
}

