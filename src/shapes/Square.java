package shapes;

public class Square extends Quadrilateral{
    private double side;
    public Square(double side) {
        super(side, side);
    }

    @Override
    public void setLength(double length) {
        this.length = length;
        if(this.getWidth() != length) this.setWidth(width);
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
        if(this.getLength() != width) this.setLength(width);
    }

    @Override
    public double getPerimeter() {
        return this.getWidth() * 4;
    }

    @Override
    public double getArea() {
        return Math.pow(this.getWidth(),2);
    }
}
