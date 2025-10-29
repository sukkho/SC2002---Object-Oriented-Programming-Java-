public class Sphere extends Shape3D {
    private double radius;

    public Sphere(double rad) {
        radius = rad;
    }

    @Override
    public double getSurfaceArea() {
        return 4 * Math.PI * radius * radius;
    }
}
