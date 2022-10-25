package ss6_Inheritance.thucHanh;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3.5);
        System.out.println(circle);

        circle = new Circle("indigo", 3.5, false);
        System.out.println(circle);
    }
}
