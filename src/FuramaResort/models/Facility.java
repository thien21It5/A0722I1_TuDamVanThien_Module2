package FuramaResort.models;

public abstract class Facility {
    private String serviceName; //Tên dịch vụ
    private String usableArea;  //Diện tích sử dụng
    private int rentaCost;      //Chi phí thuê
    private int maxPeople;      //Số lượng người tối đa
    private String rentalType;  //Kiểu thuê

    public Facility() {
    }

    public Facility(String serviceName, String usableArea, int rentaCost, int maxPeople, String rentalType) {
        this.serviceName = serviceName;
        this.usableArea = usableArea;
        this.rentaCost = rentaCost;
        this.maxPeople = maxPeople;
        this.rentalType = rentalType;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getUsableArea() {
        return usableArea;
    }

    public void setUsableArea(String usableArea) {
        this.usableArea = usableArea;
    }

    public int getRentaCost() {
        return rentaCost;
    }

    public void setRentaCost(int rentaCost) {
        this.rentaCost = rentaCost;
    }

    public int getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(int maxPeople) {
        this.maxPeople = maxPeople;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "serviceName='" + serviceName + '\'' +
                ", usableArea='" + usableArea + '\'' +
                ", rentaCost=" + rentaCost +
                ", maxPeople=" + maxPeople +
                ", rentalType='" + rentalType + '\'' +
                '}';
    }
}
