import java.util.Random;
import java.util.Scanner;

public class firstjavaprogram {

    public static void main(String[] args) {
        // Define the possible moves for the game
        String[] moves = { "Rock", "Paper", "Scissors" };
        
        // Create a scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Display instructions
        System.out.println("Welcome to Rock, Paper, Scissors!");
        System.out.println("Enter your move (Rock, Paper, or Scissors):");
        
        // Get the player's move
        String playerMove = scanner.nextLine().trim();

        // Check if the player entered a valid move
        if (!isValidMove(playerMove)) {
            System.out.println("Invalid move. Please enter Rock, Paper, or Scissors.");
            return; // Exit the game if the input is invalid
        }

        // Randomly select the computer's move
        String computerMove = moves[new Random().nextInt(moves.length)];

        // Display the computer's move
        System.out.println("Computer played: " + computerMove);

        // Determine the result of the game
        String result = determineResult(playerMove, computerMove);
        System.out.println(result);
    }

    // Method to check if the player's move is valid
    private static boolean isValidMove(String move) {
        return move.equalsIgnoreCase("Rock") || move.equalsIgnoreCase("Paper") || move.equalsIgnoreCase("Scissors");
    }

    // Method to determine the result of the game
    private static String determineResult(String playerMove, String computerMove) {
        if (playerMove.equalsIgnoreCase(computerMove)) {
            return "It's a tie!";
        } else if (playerMove.equalsIgnoreCase("Rock")) {
            return (computerMove.equalsIgnoreCase("Paper")) ? "You lose!" : "You win!";
        } else if (playerMove.equalsIgnoreCase("Paper")) {
            return (computerMove.equalsIgnoreCase("Rock")) ? "You win!" : "You lose!";
        } else { // playerMove is "Scissors"
            return (computerMove.equalsIgnoreCase("Rock")) ? "You lose!" : "You win!";
        }
    }
}