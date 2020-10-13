package shapes;

public class Rectangle extends Quadrilateral{

    public Rectangle(double length, double width) {
        super(length, width);
    }

    @Override
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getPerimeter() {
        return (this.getLength()*2)+(this.getWidth()*2);
    }

    @Override
    public double getArea() {
        return this.getLength() * this.getWidth();
    }
}
