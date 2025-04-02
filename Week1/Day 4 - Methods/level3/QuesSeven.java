import java.util.HashSet;

public class QuesSeven {

    // Method to generate a 6-digit OTP
    public static int generateOTP() {
        return 100000 + (int) (Math.random() * 900000);
    }

    // Method to validate uniqueness of generated OTPs
    public static boolean areOTPsUnique(int[] otps) {
        HashSet<Integer> uniqueOTPs = new HashSet<>();
        for (int otp : otps) {
            uniqueOTPs.add(otp);
        }
        return uniqueOTPs.size() == otps.length; // If all are unique, size should be 10
    }

    public static void main(String[] args) {
        int[] otpArray = new int[10];

        // Generate and store 10 OTPs
        for (int i = 0; i < 10; i++) {
            otpArray[i] = generateOTP();
        }

        // Print generated OTPs
        System.out.println("Generated OTPs:");
        for (int otp : otpArray) {
            System.out.println(otp);
        }

        // Check uniqueness
        if (areOTPsUnique(otpArray)) {
            System.out.println("All OTPs are unique.");
        } else {
            System.out.println("Duplicate OTPs found.");
        }
    }
}

