package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Measurable myShape = new Rectangle(4, 5) {
        };

        Measurable[] shapes = new Measurable[2];
        shapes[0] = new Rectangle(4,5);
        shapes[1] = new Square(5);
        for(Measurable subj : shapes){
            System.out.println(subj.getPerimeter());
            System.out.println(subj.getArea());
        }

    }
}
