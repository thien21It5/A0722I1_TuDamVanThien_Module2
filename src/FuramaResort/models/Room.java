package FuramaResort.models;

public class Room extends Facility {
    private String freeService;   //Dịch vụ miễn phí đi kèm

    public Room() {

    }

    public Room(String freeService) {
        this.freeService = freeService;
    }

    public Room(String serviceName, String usableArea, int rentaCost, int maxPeople, String rentalType, String freeService) {
        super(serviceName, usableArea, rentaCost, maxPeople, rentalType);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return "Room{" +
                "freeService='" + freeService + '\'' +
                ", which is a subclass of: " + super.toString() + '\'' +
                '}';
    }
}
