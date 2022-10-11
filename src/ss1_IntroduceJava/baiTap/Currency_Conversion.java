package ss1_IntroduceJava.baiTap;

import java.util.Scanner;

public class Currency_Conversion {
    public static void main(String[] args) {
        System.out.println("ỨNG DỤNG CHUYỂN ĐỔI TIỀN TỆ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập giá trị USD muốn chuyển đổi:");
        double usd = sc.nextDouble();
        double rate = 23000; //Chuyển đổi: 1 USD = 23000 VND
        double vnd = usd * rate;
        System.out.println("Số tiền sau khi chuyển đổi từ USD sang VND là: " + vnd);


    }
}
