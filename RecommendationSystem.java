import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SimpleRecommendationSystem {

    public static void main(String[] args) {
        Map<String, String> moviePreferences = new HashMap<>();
        moviePreferences.put("User1", "Action");
        moviePreferences.put("User2", "Comedy");
        moviePreferences.put("User3", "Drama");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Movie Recommendation System!");
        System.out.println("Please enter your name:");
        String userName = scanner.nextLine();

        if (moviePreferences.containsKey(userName)) {
            String preference = moviePreferences.get(userName);
            System.out.println("Based on your preference for " + preference + " movies, we recommend:");
            if (preference.equals("Action")) {
                System.out.println("Die Hard");
            } else if (preference.equals("Comedy")) {
                System.out.println("Superbad");
            } else if (preference.equals("Drama")) {
                System.out.println("The Shawshank Redemption");
            }
        } else {
            System.out.println("Sorry, we don't have any recommendations for you at the moment.");
        }
    }
}
