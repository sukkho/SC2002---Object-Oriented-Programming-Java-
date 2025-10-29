public class Circle extends Shape{
    private double radius;

    public Circle(double rad) {
        radius = rad;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
