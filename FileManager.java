import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class FileManager
{
    public void saveFavorites(ArrayList<String> favorites)
    {
        try
        {
            PrintWriter writer = new PrintWriter("favorites.txt");

            for (String movie : favorites)
            {
                writer.println(movie);
            }

            writer.close();

            System.out.println("Favorites saved.");
        }
        catch (IOException e)
        {
            System.out.println("Error saving file.");
        }
    }

    public void loadFavorites()
    {
        try
        {
            File file = new File("favorites.txt");

            if (!file.exists())
            {
                System.out.println("No favorites file found.");
                return;
            }

            BufferedReader reader =
                new BufferedReader(new FileReader(file));

            String line;

            System.out.println("\nSaved Favorites:");

            while ((line = reader.readLine()) != null)
            {
                System.out.println(line);
            }

            reader.close();
        }
        catch (IOException e)
        {
            System.out.println("Error loading file.");
        }
    }
}