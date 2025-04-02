import java.util.*;

class QuesTen {
    public static void main(String[] args) {
        
        double physics = Math.round((Math.random() * 100.0) * 100.0) / 100.0;
        System.out.println(physics);
        double maths = Math.round((Math.random() * 100.0) * 100.0) / 100.0;
        System.out.println(maths);
        double chem = Math.round((Math.random() * 100.0) * 100.0) / 100.0;
        System.out.println(chem);

        double avg = (physics + maths + chem) / 3.0;

        double percentage = avg;

        System.out.printf("%.2f Percentage: ", percentage);

        


    }
}