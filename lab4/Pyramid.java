public class Pyramid extends Shape3D{
    private double baseLength;
    private double slantHeight;

    public Pyramid(double baseLength, double slantHeight) {
        this.baseLength = baseLength;
        this.slantHeight = slantHeight;
    }

    @Override
    public double getSurfaceArea() {
        double baseArea = baseLength * baseLength;
        double sideArea = 2 * baseLength * slantHeight;
        return baseArea + sideArea;
    }
}
