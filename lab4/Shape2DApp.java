public class Shape2DApp {
    public static void main(String[] args) {
        Shape [] shapes = new Shape[3];
        shapes[0] = new Circle(10);
        shapes[1] = new Triangle(20, 25);
        shapes[2] = new Rectangle(50, 20);

        double totalArea = 0;
        for (Shape s : shapes) {
            totalArea += s.getArea();
        }

        System.out.println("Total area of 2D figure: "+totalArea);
    }
}
