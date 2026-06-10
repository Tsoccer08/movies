import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        final Scanner scanner = new Scanner(System.in);

        final MovieManager movieManager =
            new MovieManager();

        final FileManager fileManager =
            new FileManager();

        boolean running = true;

        System.out.println(
            "Welcome to the Movie Recommendation Program!"
        );

        while (running)
        {
            System.out.println("\nMenu");
            System.out.println("1. View Movies");
            System.out.println("2. Search by Genre");
            System.out.println("3. Add Favorite");
            System.out.println("4. View Saved Favorites");
            System.out.println("5. Exit");

            System.out.print(
                "\nChoose an option: "
            );

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice)
            {
                case 1 ->
                {
                    movieManager.displayMovies();
                }

                case 2 ->
                {
                    movieManager.displayGenres();

                    System.out.print(
                        "\nEnter genre: "
                    );

                    String genre =
                        scanner.nextLine();

                    movieManager.searchByGenre(
                        genre
                    );
                }

                case 3 ->
                {
                    System.out.print(
                        "Enter movie title: "
                    );

                    String favoriteMovie =
                        scanner.nextLine();

                    movieManager.addFavorite(
                        favoriteMovie
                    );

                    fileManager.saveFavorites(
                        movieManager.getFavorites()
                    );
                }

                case 4 ->
                {
                    fileManager.loadFavorites();
                }

                case 5 ->
                {
                    running = false;
                    System.out.println(
                        "Goodbye!"
                    );
                }

                default ->
                {
                    System.out.println(
                        "Invalid option."
                    );
                }
            }
        }

        scanner.close();
    }
}