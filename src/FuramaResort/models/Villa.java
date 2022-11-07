package FuramaResort.models;

public class Villa extends Facility {
    private String roomStandard;  //Tiêu chuẩn phòng
    private String poolArea;      //Diện tích hồ bơi
    private int numberOfFloor;    //Số tầng

    public Villa() {
    }

    public Villa(String roomStandard, String poolArea, int numberOfFloor) {
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
        this.numberOfFloor = numberOfFloor;
    }

    public Villa(String serviceName, String usableArea, int rentaCost, int maxPeople, String rentalType, String roomStandard, String poolArea, int numberOfFloor) {
        super(serviceName, usableArea, rentaCost, maxPeople, rentalType);
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
        this.numberOfFloor = numberOfFloor;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public String getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(String poolArea) {
        this.poolArea = poolArea;
    }

    public int getNumberOfFloor() {
        return numberOfFloor;
    }

    public void setNumberOfFloor(int numberOfFloor) {
        this.numberOfFloor = numberOfFloor;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "roomStandard='" + roomStandard + '\'' +
                ", poolArea='" + poolArea + '\'' +
                ", numberOfFloor=" + numberOfFloor + '\'' +
                ", which is a subclass of: " + super.toString() +
                '}';
    }
}
