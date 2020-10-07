package movies;
import util.Input;
import colors.ConsoleColors;
import java.util.Arrays;

public class MoviesApplication {
    
    public static void main(String[] args) {
        boolean continueSearch = true;
        do{
            printMenu();
            Movie[] movies = getMenuInput();
            if (movies.length > 0 ){
                printMovies(movies);
            }else{
                break;
            }
            System.out.println("Search another Category?");
            continueSearch = Input.yesNo();
        }while (continueSearch);
        System.out.println(ConsoleColors.e("Closing Program....."));
    }
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

    public static void printMenu(){
        System.out.println(ConsoleColors.w("What would you like to do?"));
        for (int i = 0; i < menuItems.length; i++) {
            System.out.println(ConsoleColors.d(i + " - " + menuItems[i]));
        }
    }

    public static String getMovieCreateCategory(){
        String chosenCategory = "";
        System.out.println(ConsoleColors.w("Choose a category: "));
        for (int i = 0; i < movieCatergories.length; i++) {
            System.out.println(ConsoleColors.d(i + " - " + movieCatergories[i]));
        }
        int userInput = Input.getInt();
        if (userInput > movieCatergories.length -1 || userInput < 0){
            return getMovieCreateCategory();
        }
        for (int i = 0; i < movieCatergories.length ; i++) {
            if(userInput == i){
                chosenCategory = movieCatergories[i];
            }
        }
        return chosenCategory;
    }

    public static Movie[] getMenuInput(){
        System.out.println(ConsoleColors.w("Enter your choice: "));
        int userInput = Input.getInt();
        if(userInput <0 || userInput > 6){
            return getMenuInput();
        }else if(userInput == 6){
            addToDatabase();
            printMenu();
            return getMenuInput();
        }
        switch (userInput){
            case 1:
                return movieDb;
            case 2:
                return filterMovies(movieDb,"animated");
            case 3:
                return filterMovies(movieDb,"drama");
            case 4:
                return filterMovies(movieDb,"horror");
            case 5:
                return filterMovies(movieDb,"scifi");
            default:
                break;
        }
        return filterMovies(movieDb,"");
    }

    public static Movie[] filterMovies(Movie[] movieList, String theCategory){
        int arrayLength = 0;
        for (Movie movie : movieList){
            if(movie.getCategory().toLowerCase().equals(theCategory)){
                arrayLength++;
            }
        }
        Movie[] filteredMovies = new Movie[arrayLength];
        arrayLength = 0;
        for (Movie movie : movieList){
            if(movie.getCategory().toLowerCase().equals(theCategory)){
                filteredMovies[arrayLength] = movie;
                arrayLength++;
            }
        }
        return filteredMovies;
    }

    public static void printMovies(Movie[] moviesToPrint){
        for (Movie movie : moviesToPrint){
            System.out.printf("%s -- %s\n", movie.getName(),movie.getCategory());
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
        String movieTitle = Input.getString();
        String movieCategory = getMovieCreateCategory();
        addMovie(movieDb, movieTitle, movieCategory);
        System.out.println(ConsoleColors.a(ConsoleColors.RED_BOLD_BRIGHT, movieTitle + " added to database."));
        System.out.println(ConsoleColors.d("Updated database size = " + movieDb.length));
    }
}
