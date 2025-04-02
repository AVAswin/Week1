import java.util.Random;

public class QuesTwelve {
    
    public static int[] generate4DigitRandomArray(int size) {
        Random random = new Random();
        int[] numbers = new int[size];
        
        for (int i = 0; i < size; i++) {
            numbers[i] = 1000 + random.nextInt(9000); // Generates a 4-digit number
        }
        return numbers;
    }
    
    public static double[] findAverageMinMax(int[] numbers) {
        int min = numbers[0], max = numbers[0], sum = 0;
        
        for (int num : numbers) {
            sum += num;
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        
        double average = (double) sum / numbers.length;
        return new double[]{average, min, max};
    }
    
    public static void main(String[] args) {
        int[] numbers = generate4DigitRandomArray(5);
        double[] results = findAverageMinMax(numbers);
        
        System.out.println("Generated 4-digit numbers:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        
        System.out.println("\nAverage: " + results[0]);
        System.out.println("Minimum: " + results[1]);
        System.out.println("Maximum: " + results[2]);
    }
}