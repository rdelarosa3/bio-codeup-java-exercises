package movies;

public class Movie {
    private String name;
    private String category;

    public Movie(String theName, String theCategory){
        this.name = theName;
        this.category = theCategory;
    }
    // Getters
    public String getName(){
        return this.name;
    }
    public String getCategory(){
        return this.category;
    }

    // Setters
    public void setName(String theName){
         this.name = theName;
    }
    public void setCategory(String theCategory){
         this.category = theCategory;
    }
}
