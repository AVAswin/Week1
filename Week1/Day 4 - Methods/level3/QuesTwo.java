import java.util.*;

// NumberChecker
class QuesTwo {
    public static int countOfDigits(int number) {
        int cnt = 0;
        while(number != 0) {
            cnt++;
            number /= 10;
        }
        return cnt;
    }

    public static int[] digitsOfANumber(int number) {
        int[] digits = new int [10];
        int index = 0;
        while(number != 0) {
            digits[index] = number % 10;
            number /= 10;
            index++;
        }

        return digits;
    }

    public static boolean checkDuckNumber(int number) {
        while(number != 0) {
            int digit = number % 10;
            if(digit == 0) return true;
            number /= 10;
        }
        return false;
    }

    public static boolean checkArmstrong(int number) {
        int noOfDigits = countOfDigits(number);
        int sum = 0;
        int temp = number;
        while(temp != 0) {
            int digit = temp % 10;
            temp = temp / 10;
            sum += Math.pow(digit, noOfDigits);
        }
        if(sum == number) return true;
        return false;
    }

    public static int[] findLargestAndSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for(int i=0;i<digits.length;i++) {
            if(digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            }
            else if(digits[i] > secondLargest) {
                secondLargest = digits[i];
            }
        }
        return new int[] {largest, secondLargest};
    }

    public static int[] findSmallestAndSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for(int i=0;i<digits.length;i++) {
            if(digits[i] < smallest) {
                secondSmallest = smallest;
                smallest = digits[i];
            }
            else if(digits[i] > secondSmallest) {
                secondSmallest = digits[i];
            }
        }
        return new int[] {smallest, secondSmallest};
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        
        System.out.println("Count of digits");
        System.out.println(countOfDigits(number));

        System.out.println("Digits of a Number");
        int[] digits = new int [10];
        digits = digitsOfANumber(number);

        for(int i=0;i<digits.length;i++) {
            System.out.print(digits[i] + " ");
        }
        System.out.println( );

        System.out.println(checkDuckNumber(number));

        System.out.println(checkArmstrong(number));

        int largest = findLargestAndSecondLargest(digits)[0];
        int secondLargest = findLargestAndSecondLargest(digits)[1];
        System.out.println(largest);
        System.out.println(secondLargest);
        
        int smallest = findSmallestAndSecondSmallest(digits)[0];
        int secondSmallest = findSmallestAndSecondSmallest(digits)[1];
        System.out.println(smallest);
        System.out.println(secondSmallest);
        
        scanner.close();
    }
}
