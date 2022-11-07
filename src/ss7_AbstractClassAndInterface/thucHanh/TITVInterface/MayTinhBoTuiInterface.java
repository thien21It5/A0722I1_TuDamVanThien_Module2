package ss7_AbstractClassAndInterface.thucHanh.TITVInterface;

public interface MayTinhBoTuiInterface {
    // Dù cho chúng t có dùng từ khóa public hay không thì
    // chương trình tự động cho chúng ta kiểu không gian là public

    public abstract double cong(double a, double b);

    public double tru(double a, double b);

    public double nhan(double a, double b);

    public double chia(double a, double b);
}
