package ss4_Class_OOP.thucHanh;

public class ClassRectangle {
    double width;
    double height;

    public ClassRectangle() {
    }

    public ClassRectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }


    public double getArea() {
        return this.width * this.height;
    }

    public double getPerimeter() {
        return (this.width + this.height) * 2;
    }

    public String display() {
        return "Rectangle:{" + "width= " + width + ", height= " + height + "}";
    }

}
