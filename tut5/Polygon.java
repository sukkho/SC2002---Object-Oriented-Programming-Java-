package tut5;

public abstract class Polygon {
    public enum KindofPolygon { POLY_PLAIN, POLY_RECT,POLY_TRIANG};
    protected String name;
    protected float width;
    protected float height;
    protected KindofPolygon polytype;

    //constructor
    public Polygon(String theName, float theWidth, float theHeight) {
        name = theName;
        width = theWidth;
        height = theHeight;
        polytype = KindofPolygon.POLY_PLAIN;
    }

    //accessor
    public KindofPolygon getPolytype() {
        return polytype;
    }

    //mutator
    public void setPolytype(KindofPolygon value) {
        polytype = value;
    }

    public String getName() { return name; }
    public abstract float calArea(); //any of its subclasses MUST provide implementation
    public void printWidthHeight( ) {
        System.out.println("Width = " + width + " Height = " + height);
    }
}
