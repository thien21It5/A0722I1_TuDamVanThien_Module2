package ss4_Class_OOP.baiTap.QuadraticEquation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập hệ số a: ");
        double a = sc.nextDouble();
        System.out.print("Nhập hệ số b: ");
        double b = sc.nextDouble();
        System.out.print("Nhập hệ số c: ");
        double c = sc.nextDouble();

        QuadraticEquation qE = new QuadraticEquation(a, b, c);
        System.out.println("Hiển thị cả 3 hệ số: \n" + qE.display());
// Xét điều kiện a, b, c.
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình vô số nghiệm");
            }else{
                System.out.println("Phương trình có nghiệm: "+qE.getEsRoot());
            }

        }else {
            if(b == 0){
                if (c > 0){
                    System.out.println("Phương trình vô nghiệm");
                }
            }else {
                if (qE.getDiscriminant() > 0) {
                    System.out.printf("\n%-20s%s", "Phương trình có 2 nghiệm phân biệt là: ", "");
                    System.out.println("Nghiệm thứ 1: " + qE.getRoot1());
                    System.out.println("Nghiệm thứ 2: " + qE.getRoot2());
                } else if (qE.getDiscriminant() == 0) {
                    System.out.println("Phương trình có nghiệm kép: " + qE.getRoot1());
                }else{
                    System.out.println("Phương trình vô nghiệm!!!");
                }
            }
        }

    }
}
