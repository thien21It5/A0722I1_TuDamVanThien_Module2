package FuramaResort.models;

public class House extends Facility {
    private String roomStandard;  //Tiêu chuẩn phòng
    private int numberOfFloor;    //Số tầng

    public House() {
    }

    public House(String roomStandard, int numberOfFloor) {
        this.roomStandard = roomStandard;
        this.numberOfFloor = numberOfFloor;
    }

    public House(String serviceName, String usableArea, int rentaCost, int maxPeople, String rentalType, String roomStandard, int numberOfFloor) {
        super(serviceName, usableArea, rentaCost, maxPeople, rentalType);
        this.roomStandard = roomStandard;
        this.numberOfFloor = numberOfFloor;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public int getNumberOfFloor() {
        return numberOfFloor;
    }

    public void setNumberOfFloor(int numberOfFloor) {
        this.numberOfFloor = numberOfFloor;
    }

    @Override
    public String toString() {
        return "House{" +
                "roomStandard='" + roomStandard + '\'' +
                ", numberOfFloor=" + numberOfFloor + '\'' +
                ", which is a subclass of: " + super.toString() +
                '}';
    }
}
