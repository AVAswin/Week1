import java.util.Scanner;

class QuesEight {
   
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       // Create a variable name to indicate the person traveling
       System.out.print("Enter Name: ");
       String name = scanner.nextLine();
       
       // Create a variable fromCity, viaCity and toCity to indicate the city
       // from city, via city and to city the person is travelling
       System.out.print("Enter From city: ");
       String fromCity = scanner.nextLine();
       System.out.print("Enter Via city: ");
       String viaCity = scanner.nextLine();
       System.out.print("Enter To city: ");
       String toCity = scanner.nextLine();
 
       // Create a variable distanceFromToVia to indicate the distance 
       // between the fromCity to viaCity
       System.out.print("Enter distance From to Via: ");
       double distanceFromToVia = scanner.nextDouble();
 
       // Create a variable timeFromToVia to indicate the time taken to 
       // travel from fromCity to viaCity in minutes
       System.out.print("Enter time From to Via: ");
       int timeFromToVia = scanner.nextInt();
 
       // Create a variable distanceViaToFinalCity to indicate the distance 
       // between the viaCity to toCity
       System.out.print("Enter distance Via to Final: ");
       double distanceViaToFinalCity = scanner.nextDouble();
 
       // Create a variable timeViaToFinalCity to indicate the time taken to
       // travel from viaCity to toCity in minutes
       System.out.print("Enter time Via to Final: ");
       int timeViaToFinalCity = scanner.nextInt();
 
       // Create a variable totalDistance to indicate the total distance
       // between the fromCity to toCity
       double totalDistance = distanceFromToVia + distanceViaToFinalCity;
 
       // Create a variable totalTime to indicate the total time taken to
       // travel from fromCity to toCity in minutes
       int totalTime = timeFromToVia + timeViaToFinalCity;
 
 
       // Print the travel details
       System.out.println("The Total Distance travelled by " + name + " from " + 
                          fromCity + " to " + toCity + " via " + viaCity +
                          " is " + totalDistance + " km and " +
                          "the Total Time taken is " + totalTime + " minutes");
    }
 }
 
