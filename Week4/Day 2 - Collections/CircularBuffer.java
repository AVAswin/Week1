class CircularBuffer {
    private int[] buffer;
    private int head;
    private int count;
    private int capacity;

    public CircularBuffer(int size) {
        buffer = new int[capacity];
        head = 0;
        count = 0;
        this.capacity = size;
    }

    // Add element (overwrite if full)
    public void add(int value) {
        int index = (head + count) % capacity;
        buffer[index] = value;
    
        if (count == capacity) {
            // Buffer full → move head to the next oldest
            head = (head + 1) % capacity;
        } else {
            count++;
        }
    }

    // Print current state of buffer
    public void printBuffer() {
        if(count == 0) {
            System.out.println("Empty");
            return;
        }
        System.out.print("Buffer: [");
        for (int i = 0; i < count; i++) {
            int index = (head + i) % capacity;
            System.out.print(buffer[index]);
            if (i != count - 1) System.out.print(", ");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        CircularBuffer cb = new CircularBuffer(3);
        cb.add(1);
        cb.add(2);
        cb.add(3);
        cb.printBuffer(); // Output: [1, 2, 3]

        cb.add(4);
        cb.printBuffer(); // Output: [2, 3, 4]

        cb.add(5);
        cb.printBuffer(); // Output: [3, 4, 5]
    }
}

