package ss2_Loop.thucHanh;

public class demo {
    public static void main(String[] args) {
        int i = 1;
        while (i < 5) {
            if (i % 3 == 0) {
                i++;
                continue;
            }
            System.out.println("Hello");
            i++;
        }
    }
}
