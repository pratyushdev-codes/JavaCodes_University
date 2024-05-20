import java.util.*;

class Process {
    int processId;
    int arrivalTime;
    int burstTime;

    public Process(int processId, int arrivalTime, int burstTime) {
        this.processId = processId;
        this.arrivalTime = arrivalTime;
        this.burstTime = burstTime;
    }
}

public class FCFS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of processes: ");
        int n = scanner.nextInt();

        List<Process> processes = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter arrival time for process P" + (i + 1) + ": ");
            int arrivalTime = scanner.nextInt();
            System.out.print("Enter burst time for process P" + (i + 1) + ": ");
            int burstTime = scanner.nextInt();
            processes.add(new Process(i + 1, arrivalTime, burstTime));
        }

        // Sort processes based on arrival time
        processes.sort(Comparator.comparingInt(p -> p.arrivalTime));

        int currentTime = 0;
        System.out.println("\nFCFS Scheduling Order:");
        for (Process process : processes) {
            System.out.println("P" + process.processId + " starts at time " + currentTime);
            currentTime += process.burstTime;
            System.out.println("P" + process.processId + " finishes at time " + currentTime);
        }

        scanner.close();
    }
}
