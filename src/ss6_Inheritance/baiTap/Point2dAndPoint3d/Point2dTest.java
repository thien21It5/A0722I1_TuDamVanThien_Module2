package ss6_Inheritance.baiTap.Point2dAndPoint3d;

public class Point2dTest {
    public static void main(String[] args) {
        Point2D a = new Point2D(3, 2);
        System.out.println(a.getX());
        System.out.println(a.getY());
        System.out.println(a);
        float[] arrData = a.getXY();
        System.out.println("Array values:");
        for (int i = 0; i < arrData.length; i++) {
            System.out.print(arrData[i] + " ");
        }
    }
}

