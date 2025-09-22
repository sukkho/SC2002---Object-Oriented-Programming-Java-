package tut3;

public class Cylinder extends Circle {
    private double height;
    public Cylinder() {height = 1;}
    public Cylinder(double h) {height = h;}
    public Cylinder(double h, double r) {
        super(r);
        height = h;
    }
    public double getHeight() {return height;}
    public void setHeight(double height) {this.height = height;}
    public double area() {
        return 2*(super.area() + Math.PI*super.getRadius()*height);
    }
    public double volume() {
        return super.area() * height;
    }

    public String toString() {
        return "Cylinder of height " +height+", radius"+getRadius()+" at point ["+x+","+y+"]";
    }
}
