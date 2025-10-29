public class Cuboid extends Shape3D{
    private double length, breadth, height;

    public Cuboid(double length, double breadth, double height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    @Override
    public double getSurfaceArea() {
        return 2 * (length * breadth + length * height + breadth * height);
    }
}
