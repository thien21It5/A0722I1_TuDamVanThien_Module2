package ss6_Inheritance.baiTap.PointAndMoveablePoint;

public class PointTest {
    public static void main(String[] args) {
        Point a = new Point(3, 2);
        System.out.println(a.getX());
        System.out.println(a.getY());
        System.out.println(a.toString());
        float[] arrData = a.getXY();
        System.out.println("Array values:");
        for (int i = 0; i < arrData.length; i++) {
            System.out.print(arrData[i] + " ");
        }
    }
}

