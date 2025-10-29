public class Rectangle extends Shape{
    private double length, breadth;

    public Rectangle(double l, double b) {
        length = l;
        breadth = b;
    }
    
    @Override
    public double getArea() {
        return length * breadth;
    }
}
