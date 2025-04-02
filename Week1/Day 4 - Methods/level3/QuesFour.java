import java.util.Arrays;
import java.util.Scanner;

class NumberChecker {

    public static int countOfDigits(int number) {
        return String.valueOf(number).length();
    }

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

    public static int[] reverseArray(int[] digits) {
        int[] reversed = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }
        return reversed;
    }

    public static boolean areArraysEqual(int[] arr1, int[] arr2) {
        return Arrays.equals(arr1, arr2);
    }

    public static boolean isPalindrome(int[] digits) {
        int[] reversed = reverseArray(digits);
        return areArraysEqual(digits, reversed);
    }

    public static boolean isDuckNumber(int[] digits) {
        for (int i = 1; i < digits.length; i++) { 
            if (digits[i] == 0) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int[] digits = digitsOfNumber(number);
        
        System.out.println("Count of digits: " + countOfDigits(number));
        System.out.println("Digits of number: " + Arrays.toString(digits));
        System.out.println("Reversed digits: " + Arrays.toString(reverseArray(digits)));
        System.out.println("Is Palindrome: " + isPalindrome(digits));
        System.out.println("Is Duck Number: " + isDuckNumber(digits));

        scanner.close();
    }
}
