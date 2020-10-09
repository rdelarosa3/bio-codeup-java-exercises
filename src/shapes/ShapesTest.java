package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Rectangle[] testGroup = new Rectangle[2];
        testGroup[0] = new Rectangle(4,5);
        testGroup[1] = new Square(5);
        for(Rectangle subj : testGroup){
            System.out.println(subj.getPerimeter());
            System.out.println(subj.getArea());
        }

    }
}
