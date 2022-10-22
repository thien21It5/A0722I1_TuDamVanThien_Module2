package ss5_AccessModifier_StaticMethod_StaticProperty.baiTap.Student;

public class main {
    public static void main(String[] args) {
        Student student1 = new Student();
        //Nếu ko có constructor thì chúng ta ko thể để các thuộc tính trong () khi khai báo 1 đối tượng student1
        student1.setName("Thien");
        student1.setClasses("A07");
        System.out.println(student1.getName() + " " + student1.getClasses());
    }
}
