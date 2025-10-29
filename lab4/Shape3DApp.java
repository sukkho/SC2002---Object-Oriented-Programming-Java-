public class Shape3DApp {
    public static void main(String[] args) {
        Shape3D[] shapes = new Shape3D[3];
        shapes[0] = new Sphere(10);
        shapes[1] = new Pyramid(20, 25);
        shapes[2] = new Cuboid(50, 20, 30);

        double totalSurfaceArea = 0;
        for (Shape3D s : shapes) {
            totalSurfaceArea += s.getSurfaceArea();
        }

        System.out.println("Total surface area of 3D figure: " + totalSurfaceArea);
    }
}
