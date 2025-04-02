import java.util.*;

class NumberChecker {

    // Method to find the count of digits in the number
    public static int countOfDigits(int number) {
        return String.valueOf(number).length();
    }

    // Method to store the digits of the number in an array
    public static int[] digitsOfNumber(int number) {
        int numDigits = countOfDigits(number);
        int[] digits = new int[numDigits];
        int index = numDigits - 1;

        while (number != 0) {
            digits[index--] = number % 10;
            number /= 10;
        }
        return digits;
    }

    // Method to find the sum of digits of a number
    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }

    // Method to find the sum of squares of digits of a number
    public static int sumOfSquaresOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, 2);
        }
        return sum;
    }

    // Method to check if a number is a Harshad number
    public static boolean isHarshadNumber(int number, int[] digits) {
        int sum = sumOfDigits(digits);
        return number % sum == 0;
    }

    // Method to find the frequency of each digit in the number
    public static int[][] digitFrequency(int[] digits) {
        int[][] frequency = new int[10][2]; // [digit, count]
        for (int i = 0; i < 10; i++) {
            frequency[i][0] = i; // Store digit in first column
        }
        for (int digit : digits) {
            frequency[digit][1]++; // Increase count
        }
        return frequency;
    }

    // Main method to call all functions and display results
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int[] digits = digitsOfNumber(number);
        
        System.out.println("Count of digits: " + countOfDigits(number));
        System.out.println("Digits of number: " + Arrays.toString(digits));
        System.out.println("Sum of digits: " + sumOfDigits(digits));
        System.out.println("Sum of squares of digits: " + sumOfSquaresOfDigits(digits));
        System.out.println("Is Harshad Number: " + isHarshadNumber(number, digits));

        System.out.println("Digit Frequency:");
        int[][] frequency = digitFrequency(digits);
        for (int[] row : frequency) {
            if (row[1] > 0) { // Only print digits that appear
                System.out.println("Digit " + row[0] + " appears " + row[1] + " times");
            }
        }

        scanner.close();
    }
}

