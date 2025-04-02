import java.util.*;

class QuesFive {
    public static double yardsToFeet(double km) {
        return km * 3;
    } 
    public static double FeetToYards(double miles) {
        return miles * 0.333333;
    } 
    public static double metersToInches(double meter) {
        return meter * 39.3701;
    }
    public static double inchesToMeters(double feets) {
        return feets * 0.0254;
    }
    public static double inchesToCentimeters(double inches) {
        return inches * 2.54;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a field: ");
		double field = scanner.nextDouble();

        System.out.println(yardsToFeet(field));
        System.out.println(FeetToYards(field));
        System.out.println(metersToInches(field));
        System.out.println(inchesToMeters(field));
        System.out.println(inchesToCentimeters(field));

		
		
    }
}
