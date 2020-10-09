package shapes;

public class Rectangle {
    protected int length;
    protected int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getPerimeter(){
        int perimeter = (this.getLength() * 2) + (this.getWidth() * 2);
        return perimeter;
    }

    public int getArea(){
        int area = this.getLength() * this.getWidth();
        return area;
    }
}
