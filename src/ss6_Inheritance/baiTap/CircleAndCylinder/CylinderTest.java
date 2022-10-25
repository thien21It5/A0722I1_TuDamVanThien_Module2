package ss6_Inheritance.baiTap.CircleAndCylinder;

public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);
        cylinder = new Cylinder(4.7);
        System.out.println(cylinder);
        cylinder = new Cylinder(3.5, "red", 4.2);
        System.out.println(cylinder);
    }
}
