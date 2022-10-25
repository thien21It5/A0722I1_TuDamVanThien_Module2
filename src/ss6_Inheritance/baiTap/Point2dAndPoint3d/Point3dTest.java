package ss6_Inheritance.baiTap.Point2dAndPoint3d;

public class Point3dTest {
    public static void main(String[] args) {
        Point3D a = new Point3D(1, 2, 3);
        a.setXYZ(4, 5, 6);
        System.out.println(a.toString());
        float[] arrData = a.getXYZ();
        System.out.println("Array values:");
        for (int i = 0; i < arrData.length; i++) {
            System.out.print(arrData[i] + " ");
        }
    }
}
