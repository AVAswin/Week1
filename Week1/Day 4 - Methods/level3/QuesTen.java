public class QuesTen {

    // Method to check collinearity using slope formula
    public static boolean isCollinearUsingSlope(int x1, int y1, int x2, int y2, int x3, int y3) {
        // Checking (y2 - y1) * (x3 - x2) == (y3 - y2) * (x2 - x1) to avoid division
        return (y2 - y1) * (x3 - x2) == (y3 - y2) * (x2 - x1);
    }

    // Method to check collinearity using the area formula
    public static boolean isCollinearUsingArea(int x1, int y1, int x2, int y2, int x3, int y3) {
        int area = x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2);
        return area == 0; // If area is 0, points are collinear
    }

    public static void main(String[] args) {
        // Given points
        int x1 = 2, y1 = 4;
        int x2 = 4, y2 = 6;
        int x3 = 6, y3 = 8;

        // Check collinearity using both methods
        boolean collinearSlope = isCollinearUsingSlope(x1, y1, x2, y2, x3, y3);
        boolean collinearArea = isCollinearUsingArea(x1, y1, x2, y2, x3, y3);

        // Output results
        System.out.println("Checking if points A(2,4), B(4,6), C(6,8) are collinear:");
        System.out.println("Using Slope Formula: " + (collinearSlope ? "Collinear" : "Not Collinear"));
        System.out.println("Using Area Formula: " + (collinearArea ? "Collinear" : "Not Collinear"));
    }
}

