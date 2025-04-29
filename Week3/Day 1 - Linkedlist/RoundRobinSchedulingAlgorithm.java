class Process {
    int pid;
    int burstTime;
    int remainingTime;
    int priority;
    int waitingTime = 0;
    int turnaroundTime = 0;
    Process next;

    public Process(int pid, int burstTime, int priority) {
        this.pid = pid;
        this.burstTime = burstTime;
        this.remainingTime = burstTime;
        this.priority = priority;
    }
}

class RoundRobinScheduler {
    private Process tail = null;
    private final int timeQuantum;
    private int currentTime = 0;
    private int totalProcesses = 0;
    private float totalWaitingTime = 0;
    private float totalTurnaroundTime = 0;

    public RoundRobinScheduler(int timeQuantum) {
        this.timeQuantum = timeQuantum;
    }

    // Add new process at the end
    public void addProcess(int pid, int burstTime, int priority) {
        Process newProcess = new Process(pid, burstTime, priority);
        totalProcesses++;

        if (tail == null) {
            tail = newProcess;
            tail.next = tail;
        } else {
            newProcess.next = tail.next;
            tail.next = newProcess;
            tail = newProcess;
        }
    }

    // Remove a process after completion
    private void removeProcess(Process prev, Process toDelete) {
        if (toDelete == tail && toDelete.next == tail) {
            tail = null;
        } else {
            prev.next = toDelete.next;
            if (toDelete == tail) {
                tail = prev;
            }
        }

        totalWaitingTime += toDelete.waitingTime;
        totalTurnaroundTime += toDelete.turnaroundTime;
        totalProcesses--;
    }

    // Display current queue
    public void displayQueue() {
        if (tail == null) {
            System.out.println("Queue is empty.");
            return;
        }

        Process temp = tail.next;
        System.out.print("Current Queue: [ ");
        do {
            System.out.print("(P" + temp.pid + ":RT=" + temp.remainingTime + ") ");
            temp = temp.next;
        } while (temp != tail.next);
        System.out.println("]");
    }

    // Simulate Round-Robin Scheduling
    public void simulate() {
        if (tail == null) {
            System.out.println("No processes to schedule.");
            return;
        }

        System.out.println("\n--- Starting Round-Robin Scheduling ---");

        Process current = tail.next;
        Process prev = tail;

        while (tail != null) {
            displayQueue();

            if (current.remainingTime > timeQuantum) {
                current.remainingTime -= timeQuantum;
                currentTime += timeQuantum;

                prev = current;
                current = current.next;
            } 
            else {
                currentTime += current.remainingTime;
                current.remainingTime = 0;

                current.turnaroundTime = currentTime;
                current.waitingTime = current.turnaroundTime - current.burstTime;

                System.out.println(">> Process P" + current.pid + " completed at time " + currentTime);

                Process toDelete = current;
                current = current.next;
                removeProcess(prev, toDelete);
            }
        }

        displayAverageTimes();
    }

    // Display average waiting and turnaround times
    public void displayAverageTimes() {
        System.out.println("\n--- Scheduling Complete ---");

        int count = (totalProcesses == 0) ? 1 : totalProcesses;
        System.out.printf("Average Waiting Time    = %.2f\n", totalWaitingTime / count);
        System.out.printf("Average Turnaround Time = %.2f\n", totalTurnaroundTime / count);
    }
}

class RoundRobinSchedulingAlgorithm {
    // Main function to test
    public static void main(String[] args) {
        RoundRobinScheduler scheduler = new RoundRobinScheduler(4); 
        // Time Quantum

        // Add processes (pid, burstTime, priority)
        scheduler.addProcess(1, 10, 1);
        scheduler.addProcess(2, 4, 2);
        scheduler.addProcess(3, 6, 3);
        scheduler.addProcess(4, 8, 2);

        scheduler.simulate();
    }
}

