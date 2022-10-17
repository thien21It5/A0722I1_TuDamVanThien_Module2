package ss2_Loop.baiTap;

public class DisplayThePrimeLessThan100 {
    public static void main(String[] args) {
        System.out.println("HIỂN THỊ CÁC SỐ NGUYÊN TỐ NHỎ HƠN 100 ");
        int count = 0;
        int number = 2;
        int status = 1;
        while (count < 30) {
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
            if(number>100){
                break;
            }
        }
    }
}
