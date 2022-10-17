package ss3_Array_Method.baiTap;

import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        int[] arr = {10, 4, 6, 7, 8, 6, 12, 9, 14, 26};
        int count = -1;
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập phần cần xóa: ");
        int element = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (element == arr[i]) {
                count = i;
                break;
            }
        }
        if (count != -1) {
            for (int j = count; j < arr.length - 1; j++) {
                arr[j] = arr[j + 1];
                if (j == arr.length - 2) {
                    arr[arr.length - 1] = 0;
                }
            }
        } else {
            System.out.println("Giá trị nhập vào ko có trong mảng");
        }
        System.out.printf("\n%-20s%s", "Mảng sau khi thực hiện xóa là: ", "");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + "\t");
        }
    }
}
