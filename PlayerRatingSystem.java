import java.util.Scanner;

public class PlayerRatingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the number of players
        System.out.print("Enter the number of players: ");
        int numPlayers = scanner.nextInt();

        // Ask the user for the number of voters
        System.out.print("Enter the number of voters: ");
        int numVoters = scanner.nextInt();

        // Create arrays to store ratings for each player
        double[] playerRatings = new double[numPlayers];
        int[] playerVotes = new int[numPlayers];

        // Input ratings for each player from all voters
        System.out.println("Player Rating System");
        System.out.println("=====================");
        System.out.println("Enter ratings for each player from all voters:");

        for (int voter = 1; voter <= numVoters; voter++) {
            System.out.println("Voter " + voter + ":");
            for (int player = 0; player < numPlayers; player++) {
                double rating;
                do {
                    System.out.print("Enter rating for Player " + (player + 1) + ": ");
                    while (!scanner.hasNextDouble() ) {
                        System.out.println("Invalid input. Please enter a valid number.");
                        System.out.print("Enter rating for Player " + (player + 1) + ": ");
                        scanner.next();
                    }
                    rating = scanner.nextDouble();
                } while (rating < -1 | rating >10); // Continue to ask for a valid rating


                if(rating!= -1){
                    playerRatings[player] += rating;
                    playerVotes[player] +=1;

                }
            }
        }

        // Calculate and display the average rating for each player
        System.out.println("\nPlayer Ratings Summary");
        System.out.println("=======================");
        for (int player = 0; player < numPlayers; player++) {
            double averageRating = playerRatings[player] / playerVotes[player];
            System.out.println("=====================");
            System.out.println("Player " + (player + 1) + ":");
            System.out.println("Average Rating: " + averageRating );
            System.out.println("num of voters  " + playerVotes[player]);
        }
    }
}
