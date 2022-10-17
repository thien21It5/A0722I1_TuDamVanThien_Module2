package ss3_Array_Method.baiTap.method;

import java.util.Scanner;

public class FindMinElement {
    public static void declareArray(int[] arr) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Nhập phần tử thứ " + i + ": ");
            arr[i] = sc.nextInt();
        }
    }

    public static void displayArray(int[] arr) {
        System.out.printf("%-20s%s", "Phần tử trong mảng là: ", "");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + "\t");
        }
    }

    public static int findMinElement(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số phần tử trong mảng: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        declareArray(arr);
        displayArray(arr);
        int smallest = findMinElement(arr);
        System.out.println("\n");
        System.out.print("Phần tử nhỏ nhất trong mảng là: "+smallest);
    }
}
