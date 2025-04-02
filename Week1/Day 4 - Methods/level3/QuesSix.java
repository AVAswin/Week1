import java.util.*;

class QuesSix {

    public static int[] findFactors(int number) {
        List<Integer> factorList = new ArrayList<>();
        
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factorList.add(i);
            }
        }
        
        return factorList.stream().mapToInt(i -> i).toArray();
    }

    public static int findGreatestFactor(int number) {
        int[] factors = findFactors(number);
        return factors[factors.length - 2]; 
    }

    public static int sumOfFactors(int number) {
        int sum = 0;
        for (int factor : findFactors(number)) {
            sum += factor;
        }
        return sum;
    }

    public static long productOfFactors(int number) {
        long product = 1;
        for (int factor : findFactors(number)) {
            product *= factor;
        }
        return product;
    }

    public static long productOfCubesOfFactors(int number) {
        long product = 1;
        for (int factor : findFactors(number)) {
            product *= Math.pow(factor, 3);
        }
        return product;
    }

    public static boolean isPerfectNumber(int number) {
        int sum = 0;
        for (int factor : findFactors(number)) {
            if (factor != number) { 
                sum += factor;
            }
        }
        return sum == number;
    }

    public static boolean isAbundantNumber(int number) {
        int sum = 0;
        for (int factor : findFactors(number)) {
            if (factor != number) {
                sum += factor;
            }
        }
        return sum > number;
    }

    public static boolean isDeficientNumber(int number) {
        int sum = 0;
        for (int factor : findFactors(number)) {
            if (factor != number) {
                sum += factor;
            }
        }
        return sum < number;
    }

    public static boolean isStrongNumber(int number) {
        int sum = 0;
        int temp = number;

        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }

        return sum == number;
    }

    public static int factorial(int num) {
        int fact = 1;
        for (int i = 2; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        System.out.println("Factors: " + Arrays.toString(findFactors(number)));
        System.out.println("Greatest Factor: " + findGreatestFactor(number));
        System.out.println("Sum of Factors: " + sumOfFactors(number));
        System.out.println("Product of Factors: " + productOfFactors(number));
        System.out.println("Product of Cubes of Factors: " + productOfCubesOfFactors(number));
        System.out.println("Is Perfect Number: " + isPerfectNumber(number));
        System.out.println("Is Abundant Number: " + isAbundantNumber(number));
        System.out.println("Is Deficient Number: " + isDeficientNumber(number));
        System.out.println("Is Strong Number: " + isStrongNumber(number));

        scanner.close();
    }
}

