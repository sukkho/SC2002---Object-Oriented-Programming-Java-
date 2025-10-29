package tut5;

public class TestPolygon {
    //Test class is used to create objects, call on methods and print results
    public static void printArea(Rectangle rect) {
        float area = rect.calArea();
        System.out.println("The area of the " + rect.getPolytype() + "is " + area);
    }

    public static void printArea(Triangle tri) {
        float area = tri.calArea();
        System.out.println("The area of the " + tri.getPolytype() + "is " + area);
    }

    public static void main(String[] args) {
        Rectangle rect = new Rectangle("rectangle", 3.0f, 4.0f);
        printArea(rect); //static binding
        rect.printWidthHeight();

        Triangle tri = new Triangle("triangle", 3.0f, 4.0f);
        printArea(tri); //static binding
        tri.printWidthHeight();
    }
}
