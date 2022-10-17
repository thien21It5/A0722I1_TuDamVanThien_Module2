package ss3_Array_Method.baiTap;

import java.util.Scanner;

public class AddElement {
    public static void addElement(int[] array, int index, int element) {
         int count = -1;
            for (int j = array.length - 1; j > index - 1; j--) {
                array[j] = array[j - 1];
                if (j == index) {
                    array[j] = element;
                    count = 0;
                }
            }
            if (count != -1){
            System.out.printf("\n%-20s%s", "Mảng sau khi thực hiện xóa là: ", "");
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[j] + "\t");
            }
        }else{
            System.out.println("Giá trị nhập vào ko hợp lệ");
        }

        return;
    }

    public static void main(String[] args) {
        System.out.println("THÊM PHẦN TỬ VÀO MẢNG");
        int[] arr = {10, 4, 6, 7, 8, 0, 0, 0, 0};
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số cần chèn: ");
        int element = sc.nextInt();
        System.out.println("Nhập vị trí cần chèn: ");
        int index = sc.nextInt();
        addElement(arr, index, element);
    }
}
