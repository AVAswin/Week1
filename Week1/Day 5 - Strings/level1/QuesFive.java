public class QuesFive {
    public static void main(String[] args) {

        // Another example with an array
        String str = "abc";
        try {
            System.out.println(str.charAt(5)); // arr[2] is null
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught String index out of bound: " + e.getMessage());
        }
    }
}
