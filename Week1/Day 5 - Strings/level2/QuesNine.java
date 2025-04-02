import java.util.Random;
import java.util.Scanner;

public class QuesNine {
    private static int userWins = 0, computerWins = 0, ties = 0;
    private static final String[] CHOICES = {"Rock", "Paper", "Scissors"};
    
    public static String getComputerChoice() {
        Random rand = new Random();
        return CHOICES[rand.nextInt(3)];
    }

    public static String findWinner(String userChoice, String computerChoice) {
        if (userChoice.equals(computerChoice)) {
            ties++;
            return "Tie";
        }
        
        if ((userChoice.equals("Rock") && computerChoice.equals("Scissors")) ||
            (userChoice.equals("Paper") && computerChoice.equals("Rock")) ||
            (userChoice.equals("Scissors") && computerChoice.equals("Paper"))) {
            userWins++;
            return "User";
        } else {
            computerWins++;
            return "Computer";
        }
    }

    public static String[][] calculateStats(int totalGames) {
        String[][] stats = new String[2][2];
        
        stats[0][0] = "User";
        stats[0][1] = String.format("%.2f%%", (userWins / (double) totalGames) * 100);
        
        stats[1][0] = "Computer";
        stats[1][1] = String.format("%.2f%%", (computerWins / (double) totalGames) * 100);
        
        return stats;
    }

    public static void displayResults(int totalGames) {
        System.out.println("\nGame Results:");
        System.out.println("-------------------------------");
        System.out.printf("%-10s | %-10s | %-10s\n", "User Wins", "Computer Wins", "Ties");
        System.out.println("-------------------------------");
        System.out.printf("%-10d | %-12d | %-10d\n", userWins, computerWins, ties);
        System.out.println("-------------------------------\n");
        
        System.out.println("Winning Percentage:");
        System.out.println("-------------------------------");
        String[][] stats = calculateStats(totalGames);
        System.out.printf("%-10s | %-10s\n", "Player", "Win %");
        System.out.println("-------------------------------");
        for (String[] row : stats) {
            System.out.printf("%-10s | %-10s\n", row[0], row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of games to play: ");
        int numGames = scanner.nextInt();
        scanner.nextLine();
        
        for (int i = 1; i <= numGames; i++) {
            System.out.print("Game " + i + " - Enter Rock, Paper, or Scissors: ");
            String userChoice = scanner.nextLine().trim();
            
            if (!userChoice.equalsIgnoreCase("Rock") && !userChoice.equalsIgnoreCase("Paper") && !userChoice.equalsIgnoreCase("Scissors")) {
                System.out.println("Invalid choice. Please enter Rock, Paper, or Scissors.");
                i--;
                continue;
            }
            
            String computerChoice = getComputerChoice();
            String winner = findWinner(userChoice, computerChoice);
            
            System.out.println("Computer chose: " + computerChoice);
            System.out.println("Winner: " + (winner.equals("Tie") ? "It's a tie!" : winner + " wins!"));
            System.out.println();
        }
        
        displayResults(numGames);
        scanner.close();
    }
}
