public class Dish {
    public static double AVERAGE_COST_DISH_IN_CENTS = 13000 ;
    public double costInCents;
    public String nameOfDish;
    public boolean wouldRecommend;
    public void printSummary(){
        System.out.printf(" Cost: %.2f \n Name: %s \n Recommended: %b \n",costInCents,nameOfDish,wouldRecommend);
    }
    public static boolean flipRecommendation(boolean recommendation){
        return !recommendation;
    }
    public static void shoutDishName(String dishName){
        System.out.printf("%s!!!%n",dishName.toUpperCase());
    }
    public static void analyzeCost(double dishCost){
        System.out.println( dishCost > AVERAGE_COST_DISH_IN_CENTS ? "More Expensive" : "Less Expensive") ;
    }


}
