package ss1_IntroduceJava.thucHanh;

import java.util.Scanner;

public class day_Of_Month {
    public static void main(String[] args) {
        System.out.println("TÍNH SỐ NGÀY TRONG THÁNG");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tháng cần tính số ngày: ");
        int month = sc.nextInt();
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Tháng " + month + " có 31 ngày");
                break;
            case 2:
                System.out.println("Tháng 2 có 28 hoặc 29 ngày");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Tháng " + month + " có 30 ngày");
                break;
            default:
                System.out.println("Giá trị không hợp lệ!!!");
                break;
        }
    }
}
