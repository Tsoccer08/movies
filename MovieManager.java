import java.util.ArrayList;

public class MovieManager
{
    private ArrayList<Movie> movies;
    private ArrayList<String> favorites;

    public MovieManager()
    {
        movies = new ArrayList<>();
        favorites = new ArrayList<>();

        movies.add(new Movie("Inception", "Sci-Fi", 8.8, 2010));
        movies.add(new Movie("Interstellar", "Sci-Fi", 8.7, 2014));
        movies.add(new Movie("The Matrix", "Sci-Fi", 8.7, 1999));
        movies.add(new Movie("Avatar", "Sci-Fi", 7.9, 2009));

        movies.add(new Movie("The Dark Knight", "Action", 9.0, 2008));
        movies.add(new Movie("John Wick", "Action", 7.4, 2014));
        movies.add(new Movie("Mad Max: Fury Road", "Action", 8.1, 2015));
        movies.add(new Movie("Top Gun: Maverick", "Action", 8.2, 2022));

        movies.add(new Movie("Toy Story", "Animation", 8.3, 1995));
        movies.add(new Movie("Finding Nemo", "Animation", 8.2, 2003));
        movies.add(new Movie("Shrek", "Animation", 7.9, 2001));
        movies.add(new Movie("Spider-Man: Into the Spider-Verse", "Animation", 8.4, 2018));

        movies.add(new Movie("The Hangover", "Comedy", 7.7, 2009));
        movies.add(new Movie("Superbad", "Comedy", 7.6, 2007));
        movies.add(new Movie("Step Brothers", "Comedy", 6.9, 2008));
        movies.add(new Movie("Anchorman", "Comedy", 7.1, 2004));

        movies.add(new Movie("The Conjuring", "Horror", 7.5, 2013));
        movies.add(new Movie("A Quiet Place", "Horror", 7.5, 2018));
        movies.add(new Movie("Get Out", "Horror", 7.8, 2017));
        movies.add(new Movie("It", "Horror", 7.3, 2017));

        movies.add(new Movie("Titanic", "Drama", 7.9, 1997));
        movies.add(new Movie("Forrest Gump", "Drama", 8.8, 1994));
        movies.add(new Movie("The Shawshank Redemption", "Drama", 9.3, 1994));
        movies.add(new Movie("The Green Mile", "Drama", 8.6, 1999));
    }

    public void displayMovies()
    {
        System.out.println("\nMovies:");

        for (Movie movie : movies)
        {
            System.out.println(
                movie.getTitle() +
                " | " +
                movie.getGenre() +
                " | " +
                movie.getYear()
            );
        }
    }

    public void displayGenres()
    {
        System.out.println("\nAvailable Genres:");
        System.out.println("Action");
        System.out.println("Animation");
        System.out.println("Comedy");
        System.out.println("Drama");
        System.out.println("Horror");
        System.out.println("Sci-Fi");
    }

    public void searchByGenre(String genre)
    {
        boolean found = false;

        System.out.println("\nResults:");

        for (Movie movie : movies)
        {
            if (movie.getGenre().equalsIgnoreCase(genre))
            {
                System.out.println(
                    movie.getTitle() +
                    " (" +
                    movie.getYear() +
                    ")"
                );

                found = true;
            }
        }

        if (!found)
        {
            System.out.println("No movies found in that genre.");
        }
    }

    public void addFavorite(String movieTitle)
    {
        favorites.add(movieTitle);

        System.out.println(movieTitle + " added to favorites.");
    }

    public ArrayList<String> getFavorites()
    {
        return favorites;
    }
}