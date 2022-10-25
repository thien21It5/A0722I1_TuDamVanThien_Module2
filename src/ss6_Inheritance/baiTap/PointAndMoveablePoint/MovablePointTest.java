package ss6_Inheritance.baiTap.PointAndMoveablePoint;

public class MovablePointTest {
    public static void main(String[] args) {
        MovablePoint a = new MovablePoint();
        System.out.println(a);
        a.setXY(6.12f, 8.3f);
        System.out.println(a);
        a.setSpeed(2.0f, 3.0f);
        System.out.println(a);
        float[] arrMove = a.move();
        System.out.println("Array of move have values: ");
        for (int i = 0; i < arrMove.length; i++) {
            System.out.print(arrMove[i]+" ");
        }

    }
}
