package ss7_AbstractClassAndInterface.baiTap;

public class ColorableTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[5];
        shapes[0] = new Circle(1.7);
        shapes[1] = new Square(5.4);
        shapes[2] = new Rectangle(6.3, 7.6);
        shapes[3] = new Circle();
        shapes[4] = new Square();

        for (int i = 0; i < shapes.length; i++) {
            System.out.println("Diện tích hình thứ " + i + " là: " + shapes[i].getArea());
            if (shapes[i] instanceof Square) ((Square) shapes[i]).howToColor();
        }
    }
}
