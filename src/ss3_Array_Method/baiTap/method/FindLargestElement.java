package ss3_Array_Method.baiTap.method;

import java.util.Scanner;

public class FindLargestElement {
    public static void declareArray(int[][] arr) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Nhập phần tử thứ ["+i+"]["+j+"]: ");
                arr[i][j] = sc.nextInt();
            }
        }
    }

    public static void display(int[][] arr) {
        System.out.printf("\n%-20s%s", "Phần tử trong mảng là: ", "");
        System.out.print("\n");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int theLargestElement(int[][] arr) {
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                   if (max <arr[i][j]){
                       max = arr[i][j];
                   }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println("TÌM PHẦN TỬ LỚN NHẤT TRONG MẢNG 2 CHIỀU");
        Scanner sc = new Scanner(System.in);
// Nhập vào mảng 2 chiều
        System.out.print("Nhập số cột trong mảng 2 chiều: ");
        int colum = sc.nextInt();
        System.out.print("Nhập số dòng trong mảng 2 chiều: ");
        int row = sc.nextInt();
        int[][] matrix = new int[colum][row];
       declareArray(matrix);
//Hiển thị mảng 2 chiều
       display(matrix);
//Tìm max trong mảng 2 chiều
        int largest = theLargestElement(matrix);
        System.out.println("Phần tử lớn nhất trong mảng là: " + largest);
    }
}
