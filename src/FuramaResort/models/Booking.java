package FuramaResort.models;

public class Booking {
    private int bookingId;            //Mã booking
    private double deposit;           //Tiền cọc
    private String rentalStartDate;   //Ngày bắt đầu thuê
    private String rentalEndDate;     //Ngày kết thúc thuê
    private int customerId;           //Mã khách hàng

    public Booking() {
    }

    public Booking(int bookingId, double deposit, String rentalStartDate, String rentalEndDate, int customerId) {
        this.bookingId = bookingId;
        this.deposit = deposit;
        this.rentalStartDate = rentalStartDate;
        this.rentalEndDate = rentalEndDate;
        this.customerId = customerId;
    }

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public String getRentalStartDate() {
        return rentalStartDate;
    }

    public void setRentalStartDate(String rentalStartDate) {
        this.rentalStartDate = rentalStartDate;
    }

    public String getRentalEndDate() {
        return rentalEndDate;
    }

    public void setRentalEndDate(String rentalEndDate) {
        this.rentalEndDate = rentalEndDate;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookingId=" + bookingId +
                ", deposit=" + deposit +
                ", rentalStartDate='" + rentalStartDate + '\'' +
                ", rentalEndDate='" + rentalEndDate + '\'' +
                ", customerId=" + customerId +
                '}';
    }
}
