import java.util.*;

public class QuesEight {
    public static void main(String[] args) {

        // Another example with an array
        String[] str = {"a", "b", "c"};
        try {
            System.out.println(str[5]); 
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught Array index out of bound: " + e.getMessage());
        }
    }
}
