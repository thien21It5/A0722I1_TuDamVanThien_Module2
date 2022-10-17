package ss3_Array_Method.thucHanh;

import java.util.Scanner;

public class FindElementInArray {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Siema", "Tanya", "Connor", "Lacharial", "Mallory", "Zoe", "Emily"};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a name's student ");
        String inputName = sc.nextLine();
        boolean iaExist = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(inputName)) {
                System.out.println("Position of the students in the list " + inputName + " is: " + i);
                iaExist = true;
                break;
            }
        }
        if (!iaExist) {
            System.out.println("Not found " + inputName + " in the list!!!");
        }
    }
}
