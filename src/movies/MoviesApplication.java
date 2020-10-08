package movies;
import util.Input;
import colors.ConsoleColors;
import java.util.Arrays;

public class MoviesApplication {
    
    public static void main(String[] args) {
        do{
            printMenu();
            if(!getMenuInput()) break;
            System.out.println("Search another Category?");
        }while (true);
        System.out.println(ConsoleColors.e("Closing Program....."));
    }

    // VARIABLES
    private static Movie[] movieDb = MoviesArray.findAll();
    private static final String[] menuItems = {
            "exit",
            "view all movies",
            "view movies in the animated category",
            "view movies in the drama category",
            "view movies in the horror category",
            "view movies in the scifi category",
            "add movie to database"
    };
    private static final String[] movieCatergories = {
            "animated",
            "drama",
            "horror",
            "scifi"
    };

    // METHODS
    public static void printMenu(){
        System.out.println(ConsoleColors.w("What would you like to do?"));
        for (int i = 0; i < menuItems.length; i++) {
            System.out.println(ConsoleColors.d(i + " - " + menuItems[i]));
        }
    }

    public static String getMovieCreateCategory(){
        String chosenCategory = "";
        System.out.println(ConsoleColors.w("Choose a category: "));
        // print list of categories
        for (int i = 0; i < movieCatergories.length; i++) {
            System.out.println(ConsoleColors.d(i + " - " + movieCatergories[i]));
        }
        // get input from user return the string of the chosen category
        int userInput = Input.getInt(0,movieCatergories.length -1);
        for (int i = 0; i < movieCatergories.length ; i++) {
            if(userInput == i){
                chosenCategory = movieCatergories[i];
            }
        }
        return chosenCategory;
    }

    public static boolean getMenuInput(){
        System.out.println(ConsoleColors.w("Enter your choice: "));
        // validate user input
        switch (Input.getInt(0,6)){
            case 0:
                return false;
            case 1:
                filterMovies(movieDb,"all");
                break;
            case 2:
                filterMovies(movieDb,"animated");
                break;
            case 3:
                filterMovies(movieDb,"drama");
                break;
            case 4:
                filterMovies(movieDb,"horror");
                break;
            case 5:
                filterMovies(movieDb,"scifi");
                break;
            case 6:
                addToDatabase();
                break;
            default:
                break;
        }
        return true;
    }

    public static void filterMovies(Movie[] movieList, String theCategory){
        for (Movie movie : movieList){
            if(theCategory == "all"){
                System.out.printf("%s -- %s\n", movie.getName(),movie.getCategory());
            }
            else if(movie.getCategory().equalsIgnoreCase(theCategory)){
                System.out.printf("%s -- %s\n", movie.getName(),movie.getCategory());
            }
        }
    }

    public static void addMovie(Movie[] moviesArray, String theName, String theCategory){
        Movie[] newMovieArray = Arrays.copyOf(moviesArray, moviesArray.length + 1);
        newMovieArray[moviesArray.length] = new Movie(theName,theCategory);
        movieDb = newMovieArray;
    }

    public static void addToDatabase(){
        System.out.println(ConsoleColors.d("Current database size = " + movieDb.length));
        System.out.println(ConsoleColors.w("Enter Movie Name: "));
        // get name of movie
        String movieTitle = Input.getString();
        // get string of category
        String movieCategory = getMovieCreateCategory();
        // adds movie to db
        addMovie(movieDb, movieTitle, movieCategory);
        System.out.println(ConsoleColors.a(ConsoleColors.RED_BOLD_BRIGHT, movieTitle + " added to database."));
        System.out.println(ConsoleColors.d("Updated database size = " + movieDb.length));
    }
}