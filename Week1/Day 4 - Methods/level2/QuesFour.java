import java.util.*;

class QuesFour {
    public static double convertKiloToMiles(double km) {
        return km * 0.621371;
    } 
    public static double convertMilesToKilo(double miles) {
        return miles * 1.60934;
    } 
    public static double convertMeterToFeets(double meter) {
        return meter * 3.28084;
    }
    public static double convertFeetsToMeter(double feets) {
        return feets * 0.3048;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a field: ");
		double field = scanner.nextDouble();

        System.out.println(convertKiloToMiles(field));
        System.out.println(convertMilesToKilo(field));
        System.out.println(convertMeterToFeets(field));
        System.out.println(convertFeetsToMeter(field));

		
		
    }
}