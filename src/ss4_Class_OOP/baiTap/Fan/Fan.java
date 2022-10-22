package ss4_Class_OOP.baiTap.Fan;

public class Fan {
    //Hằng số biểu thị tốc độ quạt.
    public static final int SLOW = 474;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;
    //Các thuộc tính của Fan.
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "Blue";

    //Constructor.
    public Fan() {

    }

    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    //Getter
    public int getSpeed() {
        return speed;
    }

    public boolean isOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }
    //Setter


    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }
    //ToString.

    @Override
    public String toString() {
        if (on == true) {
            return "Fan{" +
                    "speed=" + speed +
                    ", radius=" + radius +
                    ", color='" + color + "\n" +
                    "Fan is on" + '\'' +
                    '}';
        } else {
            return "Fan{" +
                    ", radius=" + radius +
                    ", color='" + color + "\n" +
                    "Fan is off" + '\'' +
                    '}';
        }
    }

}
