package ss2_Loop.baiTap;

public class Display_20_TheFirstPrime {
    public static void main(String[] args) {
        System.out.println("HIỂN THỊ 20 SỐ NGUYÊN TỐ ĐẦU TIÊN: ");
        int count = 0;
        int number = 2;
        int status = 1;
        while (count < 20) {
            for (int i = 2; i < number ; i++) {
                if (number % i == 0){
                    status = 0;
                    break;
                }
            }
            if (status !=0){
                System.out.print(number+" ");
                count++;
            }
            number++;
            status = 1;
        }
    }
}
