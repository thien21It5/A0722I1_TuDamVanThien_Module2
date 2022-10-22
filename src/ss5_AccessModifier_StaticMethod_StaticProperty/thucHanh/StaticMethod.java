package ss5_AccessModifier_StaticMethod_StaticProperty.thucHanh;

public class StaticMethod {
    //Tạo ra 1 đối tượng Student

    private int rollno;
    private String name;
    private static String college = "BBDIT";

    //Hàm khởi tạo để khởi tạo biến
    StaticMethod(int r, String n) {
        rollno = r;
        name = n;
    }

    //Dùng static method để thay đổi giá trị của biến static
    static void change() {
        college = "CODEGYM";
    }

    //Hàm hiển thị giá trị
    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }

    // Test static method
    public static void main(String[] args) {
        StaticMethod.change();  //Gọi hàm thay đổi method
        StaticMethod student1 = new StaticMethod(111, "Hoang");
        StaticMethod student2 = new StaticMethod(222, "Khanh");
        StaticMethod student3 = new StaticMethod(333, "Nam");

        //Gọi hàm display
        student1.display();
        student2.display();
        student3.display();
    }
}
