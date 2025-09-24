package tut3;

public class Circle extends Point {
    private double radius;
    public Circle() {
        super();
        radius = 1;
    }

    public Circle(double radius) {
        super();
        this.radius = radius;
    }
    public Circle(double radius, int a, int b) {
        super(a,b);
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI*Math.pow(radius,2);
    }
    public String toString() {
        return "Circle of radius " + radius + "at point ["+x+","+y+"]";
    }
}


/*  private double radius;
    public Circle() {radius = 1;}

    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle(double radius, int a, int b) {
        super(a,b);
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI*Math.pow(radius,2);
    }
    public String toString() {
        return "Circle of radius " + radius + "at point ["+x+","+y+"]";
    } */