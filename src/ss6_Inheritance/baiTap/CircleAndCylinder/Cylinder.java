package ss6_Inheritance.baiTap.CircleAndCylinder;

public class Cylinder extends Circle {
    private double height = 1.0;

    public Cylinder() {

    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getCylindricalVolume() {
        return ( getArea() * this.height);
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "Cylindrical Bottom= " + getColor() +
                ", Bottom Radius= " + getRadius() +
                ", Height= " + getHeight() +
                ", Circle area= " + getArea() +
                ", Cylindrical Volume= " + getCylindricalVolume() + '\'' +
                '}';
    }
}
