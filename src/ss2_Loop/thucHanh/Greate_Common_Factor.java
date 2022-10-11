package ss2_Loop.thucHanh;

import java.util.Scanner;

public class Greate_Common_Factor {
    public static void main(String[] args) {
        System.out.println("TÌM ƯỚC CHUNG LỚN NHẤT");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số A: ");
        int a = sc.nextInt();
        System.out.println("Nhập số B: ");
        int b = sc.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 || b == 0) {
            System.out.println("Không có ước chung lớn nhất");
        }
        while (a != b) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }
        System.out.println("Ước chung lớn nhất là: " + a);
    }
}
