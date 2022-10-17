package ss3_Array_Method.baiTap;

import java.util.Scanner;

public class MergeArray {

    public static void main(String[] args) {
        System.out.println("GỘP MẢNG");
        Scanner sc = new Scanner(System.in);

//Nhập mảng thứ nhất
        System.out.print("Nhập số phần tử mảng 1: ");
        int size1 = sc.nextInt();
        int[] arr1 = new int[size1];
        for (int i = 0; i < size1; i++) {
            System.out.print("Nhập phần tử thứ " + i + ": ");
            arr1[i] = sc.nextInt();
        }
//Nhập mảng thứ hai
        System.out.print("Nhập số phần tử mảng 2: ");
        int size2 = sc.nextInt();
        int[] arr2 = new int[size2];
        for (int j = 0; j < size2; j++) {
            System.out.print("Nhập phần tử thứ " + j + ": ");
            arr2[j] = sc.nextInt();
        }
//Hiển thị 2 mảng
        System.out.printf("%-20s%s", "Phần tử trong mảng 1 là: ", "");
        for (int k = 0; k < arr1.length; k++) {
            System.out.print(arr1[k] + "\t");
        }

        System.out.printf("\n");

        System.out.printf("%-20s%s", "Phần tử trong mảng 2 là: ", "");
        for (int h = 0; h < arr2.length; h++) {
            System.out.print(arr2[h] + "\t");
        }
        System.out.printf("\n");
//Merge 2 mảng 1 và 2 thành mảng 3
        int size3 = size1 + size2;
        int[] arr3 = new int[size3];
        for (int x = 0; x < arr1.length; x++) {
            arr3[x] = arr1[x];
        }
        for (int y = 0; y < arr2.length; y++) {
            arr3[(arr2.length+1)+y] = arr2[y];
        }
//Hiển thị mảng 3
        System.out.printf("%-20s%s", "Phần tử trong mảng 3 là: ", "");
        for (int z = 0; z < arr3.length; z++) {
            System.out.print(arr3[z] + "\t");
        }
    }
}
