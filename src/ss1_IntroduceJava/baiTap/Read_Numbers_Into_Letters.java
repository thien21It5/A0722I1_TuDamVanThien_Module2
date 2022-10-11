package ss1_IntroduceJava.baiTap;

import java.util.Scanner;

public class Read_Numbers_Into_Letters {
    public static void main(String[] args) {
        System.out.println("ỨNG DỤNG ĐỌC SỐ THÀNH CHỮ");
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số cần đọc: ");
        int number = sc.nextInt();
        int ones;
        int tens;
        int hundred;
        int bett;
        if (0 <= number && number < 10) {
            switch (number) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                default:
                    System.out.println("Out of ability!!!");
            }
        } else if (number >= 10 && number < 20) {
            //Kiểm tra hàng đơn vị
            ones = number % 10;
            switch (ones) {
                case 0:
                    System.out.println("Ten");
                    break;
                case 1:
                    System.out.println("Eleven");
                    break;
                case 2:
                    System.out.println("Twelve");
                    break;
                case 3:
                    System.out.println("Thirteen");
                    break;
                case 4:
                    System.out.println("Fourteen");
                    break;
                case 5:
                    System.out.println("Fifteen");
                    break;
                case 6:
                    System.out.println("Sixteen");
                    break;
                case 7:
                    System.out.println("Seventeen");
                    break;
                case 8:
                    System.out.println("Eighteen");
                    break;
                case 9:
                    System.out.println("Nineteen");
                    break;
            }
        } else if (number >= 20 && number < 100) {
            //Kiểm tra hàng chục và hàng đơn vị
            tens = number / 10;
            ones = number % 10;
            switch (tens) {
                case 2:
                    System.out.print("Twenty");
                    break;
                case 3:
                    System.out.print("Thirty");
                    break;
                case 4:
                    System.out.print("Forty");
                    break;
                case 5:
                    System.out.print("Fifty");
                    break;
                case 6:
                    System.out.print("Sixty");
                    break;
                case 7:
                    System.out.print("Seventy");
                    break;
                case 8:
                    System.out.print("Eighty");
                    break;
                case 9:
                    System.out.print("Ninety");
                    break;
            }
            switch (ones) {
                case 1:
                    System.out.println(" One");
                    break;
                case 2:
                    System.out.println(" Two");
                    break;
                case 3:
                    System.out.println(" Three");
                    break;
                case 4:
                    System.out.println(" Four");
                    break;
                case 5:
                    System.out.println(" Five");
                    break;
                case 6:
                    System.out.println(" Six");
                    break;
                case 7:
                    System.out.println(" Seven");
                    break;
                case 8:
                    System.out.println(" Eight");
                    break;
                case 9:
                    System.out.println(" Nine");
                    break;
            }
        } else if (number >= 100 && number < 1000) {
            hundred = number / 100;
            bett = number % 100;
            tens = bett / 10;
            ones = bett % 10;
            switch (hundred) {
                case 1:
                    System.out.print(" One hundred ");
                    break;
                case 2:
                    System.out.print(" Two hundred ");
                    break;
                case 3:
                    System.out.print(" Three hundred ");
                    break;
                case 4:
                    System.out.print(" Four hundred ");
                    break;
                case 5:
                    System.out.print(" Five hundred ");
                    break;
                case 6:
                    System.out.print(" Six hundred ");
                    break;
                case 7:
                    System.out.print(" Seven hundred ");
                    break;
                case 8:
                    System.out.print(" Eight hundred ");
                    break;
                case 9:
                    System.out.print(" Nine hundred ");
                    break;
            }
            if (tens == 1) {
                switch (ones) {
                    case 0:
                        System.out.println("and ten");
                        break;
                    case 1:
                        System.out.println("and eleven");
                        break;
                    case 2:
                        System.out.println("and twelve");
                        break;
                    case 3:
                        System.out.println("and thirteen");
                        break;
                    case 4:
                        System.out.println("and fourteen");
                        break;
                    case 5:
                        System.out.println("and fifteen");
                        break;
                    case 6:
                        System.out.println("and sixteen");
                        break;
                    case 7:
                        System.out.println("and seventeen");
                        break;
                    case 8:
                        System.out.println("and eighteen");
                        break;
                    case 9:
                        System.out.println("and nineteen");
                        break;
                }
            }
            switch (tens) {
                case 2:
                    System.out.print("and twenty");
                    break;
                case 3:
                    System.out.print("and thirty");
                    break;
                case 4:
                    System.out.print("and forty");
                    break;
                case 5:
                    System.out.print("and fifty");
                    break;
                case 6:
                    System.out.print("and sixty");
                    break;
                case 7:
                    System.out.print("and seventy");
                    break;
                case 8:
                    System.out.print("and eighty");
                    break;
                case 9:
                    System.out.print("and ninety");
                    break;
            }
            if (tens >= 2 && tens <= 9) {
                switch (ones) {
                    case 1:
                        System.out.println(" one");
                        break;
                    case 2:
                        System.out.println(" two");
                        break;
                    case 3:
                        System.out.println(" three");
                        break;
                    case 4:
                        System.out.println(" four");
                        break;
                    case 5:
                        System.out.println(" five");
                        break;
                    case 6:
                        System.out.println(" six");
                        break;
                    case 7:
                        System.out.println(" seven");
                        break;
                    case 8:
                        System.out.println(" eight");
                        break;
                    case 9:
                        System.out.println(" nine");
                        break;
                }
            }
        }
    }
}
