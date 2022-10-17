package ss3_Array_Method.baiTap.method;

import java.util.Scanner;

public class MainDiagonal {
    public static void declareArr(int[][] arr) {
        Scanner sc = new Scanner(System.in);
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.print("Nhập phần tử thứ [" + i + "][" + j + "]: ");
                    arr[i][j] = sc.nextInt();

                }
            }
    }

    public static void displayArr(int[][] arr) {
        System.out.printf("\n%-20s%s", "Phần tử trong mảng là: ", "");
        System.out.print("\n");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int Total(int[][] arr) {
        int sum =arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(i == j ){
                    sum += arr[i][j];
                }

            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số cột trong mảng 2 chiều: ");
        int colum = sc.nextInt();
        System.out.print("Nhập số dòng trong mảng 2 chiều: ");
        int row = sc.nextInt();
        int[][] matrix = new int[colum][row];
        declareArr(matrix);
        displayArr(matrix);
        System.out.print("Tổng các phần tử của đường chéo chính là: " + Total(matrix));
    }
}
