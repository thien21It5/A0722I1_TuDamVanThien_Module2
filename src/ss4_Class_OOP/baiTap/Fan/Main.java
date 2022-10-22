package ss4_Class_OOP.baiTap.Fan;

import com.sun.org.apache.bcel.internal.generic.FASTORE;

public class Main {
    public static void main(String[] args) {
        Fan fan1 = new Fan(Fan.FAST, true, 10, "Yellow");
        Fan fan2 = new Fan(Fan.MEDIUM, false, 5, "Blue");
        System.out.println("Tình trạng của quạt thứ nhất: "+fan1.toString());
        System.out.println("Tình trạng của quạt thứ hai: "+fan2.toString());
    }
}
