package FuramaResort.models;

public class Employee extends Person{
    private int EmployeeId;          //Mã nhân viên
    private String level;    //Trình độ
    private String position; //Vị trí(địa vị)
    private String salary;   //Lương

    public Employee() {
    }

    public Employee(int id, String level, String position, String salary) {
        this.EmployeeId = id;
        this.level = level;
        this.position = position;
        this.salary = salary;
    }

    public Employee(String name, String dateOfBirth, String gender, String identityCard, int phone, String email, int id, String level, String position, String salary) {
        super(name, dateOfBirth, gender, identityCard, phone, email);
        this.EmployeeId = id;
        this.level = level;
        this.position = position;
        this.salary = salary;
    }

    public int getId() {
        return EmployeeId;
    }

    public String getLevel() {
        return level;
    }

    public String getPosition() {
        return position;
    }

    public String getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + EmployeeId +
                ", level='" + level + '\'' +
                ", position='" + position + '\'' +
                ", salary='" + salary + '\'' +
                ", which is a subclass of: " + super.toString() +
                '}';
    }
}
