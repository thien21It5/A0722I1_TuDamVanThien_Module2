package ss2_Loop.thucHanh;

import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        System.out.println("KIỂM TRA SỐ NGUYÊN");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào 1 số nguyên bất kỳ: ");
        int num = sc.nextInt();
        boolean flag = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println(num + " là số nguyên tố");
        } else {
            System.out.println(num + " không phải là số nguyên tố");
        }
    }
}
