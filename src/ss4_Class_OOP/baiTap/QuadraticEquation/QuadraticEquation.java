package ss4_Class_OOP.baiTap.QuadraticEquation;

public class QuadraticEquation {
    double a, b, c;

    public QuadraticEquation() {
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public String display() {
        return "Quadratic Equation: {a=" + a + ", b=" + b + ", c=" + c + "}";
    }

    public double getDiscriminant() {
        return this.b * this.b - 4 * this.c * this.a;
    }

    public double getRoot1() {
        double result;
        if (getDiscriminant() >= 0) {
            result = (-this.b + Math.sqrt(getDiscriminant())) / 2 * this.a;
        } else {
            result = 0;
        }
        return result;
    }

    public double getRoot2() {
        double result;
        if (getDiscriminant() >= 0) {
            result = (-this.b - Math.sqrt(getDiscriminant())) / 2 * this.a;
        } else {
            result = 0;
        }
        return result;
    }

    //Nghiệm duy nhất khi a = 0 và b != 0
    public double getEsRoot() {
        return (-this.c) / this.b;
    }

}
