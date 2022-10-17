package ss3_Array_Method.baiTap.method;

import java.util.Scanner;

public class CountCharacterInString {
    public static int CountCharacter(String str, char character) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (character == str.charAt(i)) {
                count +=1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào một chuỗi ký tự: ");
        String str = sc.nextLine();
        System.out.print("Nhập ký tự cần kiểm tra số lần xuất hiện: ");
        char character = sc.nextLine().charAt(0);
        System.out.println("Số lần xuất hiện của ký tự "+character+" là: "+ CountCharacter(str, character));


    }
}
