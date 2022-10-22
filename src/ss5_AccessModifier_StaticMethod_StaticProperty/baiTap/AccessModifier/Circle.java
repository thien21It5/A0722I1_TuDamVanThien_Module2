package ss5_AccessModifier_StaticMethod_StaticProperty.baiTap.AccessModifier;

public class Circle {
    private double radius = 1.0;
    private String color = "red";
    Circle() {

    }

    public Circle(double r) {
        this.radius = r;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }


}
