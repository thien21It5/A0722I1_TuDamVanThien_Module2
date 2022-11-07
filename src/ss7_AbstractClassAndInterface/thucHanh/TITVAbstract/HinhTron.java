package ss7_AbstractClassAndInterface.thucHanh.TITVAbstract;

public class HinhTron extends Hinh {
    private double radius;

    public HinhTron(ToaDo toaDo, double radius) {
        super(toaDo);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double tinhDienTich() {
        return Math.PI * this.radius * this.radius;
    }
}
