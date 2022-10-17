package ss1_IntroduceJava.thucHanh;

import java.util.Scanner;

public class SolveFirstDegreeEquation {
    public static void main(String[] args) {
//Giải phương trình bậc 1
        System.out.println("Linear Equation Resolver");
//        System.out.println("Given a equation as 'a * x + b = c', please enter constants:");
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("a: ");
//        double a = scanner.nextDouble();
//
//        System.out.print("b: ");
//        double b = scanner.nextDouble();
//
//        System.out.print("c: ");
//        double c = scanner.nextDouble();
//        if (a != 0) {
//            double answer = (c - b) / a;
//            System.out.printf("Equation pass with x = %f!\n", answer);
//        } else {
//            if (b == c) {
//                System.out.print("The solution is all x!");
//            } else {
//                System.out.print("No solution!");
//            }
//        }


        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập giá trị a: ");
        double a = scanner.nextDouble();
        System.out.println("Nhập giá trị b: ");
        double b = scanner.nextDouble();
        double x;
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình vô số nghiệm");
            } else {
                System.out.println("Phương trình vô nghiệm");
            }
        } else {
            if (b == 0) {
                System.out.println("Phương có nghiệm x=0");
            } else {
                x = -b / a;
                System.out.println("Phương trình có nghiệm x=" + x);
            }
        }
    }
}
