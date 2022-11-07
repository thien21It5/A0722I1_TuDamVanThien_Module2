package ss9_ArrayList_LinkList.thucHanh;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
       List<Integer> numberList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số phần tử");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            numberList.add(sc.nextInt());
        }
//        for (int i = 0; i < numberList.size(); i++) {
//            System.out.print(numberList.get(i)+ " ");
//        }

        List<Integer> newList = new ArrayList<>();
        for (int i = 0; i < numberList.size(); i++) {
            if(!newList.contains(numberList.get(i))){
               newList.add(numberList.get(i));
            }
        }
        for (int element : newList) {
            System.out.print(element + " ");
        }

//        for (int i = 0; i < numberList.size(); i++) {
//            System.out.print(numberList.get(i) + " ");
//        }

    }
}
