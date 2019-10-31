public class Cylinder extends Circle {
    public double height = 1.0;

    public Cylinder() {
    }

    public Cylinder(double radius, double height, String color) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume() {
        return getArea()*height;
    }

    public String toString() {
        return "A Cylinder with radius = " + getRadius() + " and Volume = " +getVolume() +  " and color" + getColor();
    }
}



