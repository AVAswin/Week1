public class QuesFour {
    public static void main(String[] args) {
        String str = null; // Null reference

        try {
            // Attempting to call a method on a null reference
            int length = str.length();          
            System.out.println("Length of string: " + length);
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }

        // Another example with an array
        String[] arr = new String[5];
        try {
            System.out.println(arr[2].toUpperCase()); // arr[2] is null
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException in array access: " + e.getMessage());
        }
    }
}
