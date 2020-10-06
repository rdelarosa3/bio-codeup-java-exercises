public class DishTest {
    public static void main(String[] args) {
        Dish dish = new Dish();
        dish.nameOfDish = "Dish Name";
        dish.costInCents = 1000;
        dish.wouldRecommend = false;
        dish.printSummary();
        System.out.println("Would Recommend: "+Dish.flipRecommendation(dish.wouldRecommend));
        Dish.shoutDishName(dish.nameOfDish);
        Dish.analyzeCost(dish.costInCents);
    }
}
