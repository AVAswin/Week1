import java.util.Scanner;

class QuesOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        int length = 0;
        int index = 0;

        // Loop through the string until an exception occurs
        try {
            while (true) { // Infinite loop, will stop when exception occurs
                str.charAt(index); // Try accessing character
                index++;
                length++;
            }
        } catch (IndexOutOfBoundsException e) {
            // Exception occurs when index goes out of bounds, loop terminates
        }

        System.out.println("Length of the string: " + length);
        scanner.close();
    }
}
