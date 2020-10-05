package shapes;
import util.Input;
public class CircleApp {
    public static void main(String[] args) {
        do{
            Input userInput = new Input();
            System.out.println("Enter a radius for the circle");
            double userRadius = userInput.getDouble();
            Circle userCircle = new Circle(userRadius);
            updateCircles();
            System.out.println("Radius: " + userRadius);
            System.out.println("Area: " + userCircle.getArea());
            System.out.println("Circumference: " + userCircle.getCircumference());
            System.out.println("Get Info For another circles?");
            boolean tryAgain = userInput.yesNo();
            if(!tryAgain) break;
        }while(true);
        System.out.printf("%d Circles were created.\n",amountCircles);
        System.out.println("GoodBye");

    }
    private static int amountCircles;
    public static void updateCircles(){
       amountCircles++;
    }
}
