package ss3_Array_Method.thucHanh;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter a size: ");
            size = sc.nextInt();
            if (size > 20) {
                System.out.println("Size does not exceed 20");
            }
        } while (size > 20);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter element " + i + ": ");
            array[i] = sc.nextInt();
            i++;
        }
        System.out.printf("%-20s%s","Element in array: ","");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        for (int k = 0; k < array.length / 2; k++) {
            int temp = array[k];
            array[k] = array[size - 1 - k];
            array[size - 1 - k] = temp;
        }
        System.out.printf("\n%-20s%s", "Reverse array: ", "");
        for (int h = 0; h < array.length; h++) {
            System.out.print(array[h] + "\t");
        }
    }
}
