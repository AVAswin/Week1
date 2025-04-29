import java.util.*;
import java.util.LinkedList;
import java.util.Queue;

class MyStack {
    Queue<Integer> q1;
    Queue<Integer> q2;

    MyStack() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }

    // Push element onto stack
    public void push(int x) {
        q2.add(x); // Push to q2

        // Move all elements from q1 to q2
        while (!q1.isEmpty()) {
            q2.add(q1.remove());
        }

        // Swap q1 and q2
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }

    // Removes the element on top of the stack and returns it
    public int pop() {
        return q1.remove();
    }

    // Get the top element
    public int top() {
        return q1.peek();
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return q1.isEmpty();
    }
}

class QueueInterface {
    public static void reverseQueue(Queue<Integer> queue) {
        if (queue.isEmpty()) {
            return;
        }

        // Step 1: Remove front element
        int front = queue.remove();

        // Step 2: Recursively reverse the rest of the queue
        reverseQueue(queue);

        // Step 3: Add the removed element at the rear
        queue.add(front);
    }

    public static List<String> generateBinaryNumbers(int N) {
        List<String> result = new ArrayList<>();
        Queue<String> queue = new LinkedList<>();

        // Start with the first binary number
        queue.add("1");

        for (int i = 0; i < N; i++) {
            // Get the front of the queue
            String current = queue.remove();
            result.add(current);

            // Append '0' and '1' to generate the next binary numbers
            queue.add(current + "0");
            queue.add(current + "1");
        }

        return result;
    }

    public static void main(String[] args) {
        // Q1) Reverse Queue
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        System.out.println("Original Queue: " + queue);
        reverseQueue(queue);
        System.out.println("Reversed Queue: " + queue);

        // Q2) Generate Binary Numbers using Queue
        int N = 5;
        List<String> binaryNumbers = generateBinaryNumbers(N);
        System.out.println("First " + N + " Binary Numbers: " + binaryNumbers);
        
        // Q4) Implement Stack using Queues
        MyStack stack = new MyStack();
    
        stack.push(1);
        stack.push(2);
        stack.push(3);
    
        System.out.println("Top: " + stack.top()); // Should print 3
        System.out.println("Pop: " + stack.pop()); // Should print 3
        System.out.println("Top after pop: " + stack.top()); // Should print 2
    }
}
