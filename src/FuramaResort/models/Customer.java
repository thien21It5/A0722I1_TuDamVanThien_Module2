package FuramaResort.models;

public class Customer extends Person {
    private int CustomerId;                 //Mã khách hàng
    private String customerType;    //Loại khách hàng
    private String address;         //Địa chỉ

    public Customer() {
    }

    public Customer(int id, String customerType, String address) {
        this.CustomerId = id;
        this.customerType = customerType;
        this.address = address;
    }

    public Customer(String name, String dateOfBirth, String gender, String identityCard, int phone, String email, int id, String customerType, String address) {
        super(name, dateOfBirth, gender, identityCard, phone, email);
        this.CustomerId = id;
        this.customerType = customerType;
        this.address = address;
    }

    public int getId() {
        return CustomerId;
    }

    public void setId(int id) {
        this.CustomerId = id;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + CustomerId +
                ", customerType='" + customerType + '\'' +
                ", address='" + address + '\'' +
                ", which is a subclass of: " + super.toString() +
                '}';
    }
}
