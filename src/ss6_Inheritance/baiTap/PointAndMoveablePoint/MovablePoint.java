package ss6_Inheritance.baiTap.PointAndMoveablePoint;

import ss6_Inheritance.baiTap.Point2dAndPoint3d.Point2D;

public class MovablePoint extends Point2D {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MovablePoint() {

    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getXSpeed() {

        return xSpeed;
    }

    public float getYSpeed() {

        return ySpeed;
    }

    public void setXSpeed(float xSpeed) {

        this.xSpeed = xSpeed;
    }

    public void setYSpeed(float ySpeed) {

        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        float[] arr = {this.xSpeed, this.ySpeed};
        return arr;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        setXSpeed(xSpeed);
        setYSpeed(ySpeed);
    }

    public float[] move() {
        float moveX = getX() + getXSpeed();
        setX(moveX);
        float moveY = getY() + getYSpeed();
        setY(moveY);
        float[] newMove = {moveX, moveY};
        return newMove;
    }


    @Override
    public String toString() {
        return "\"(" + getX() +
                "," + getY() +
                "), speed = (" + getXSpeed() +
                "," + getYSpeed() +
                ')';
    }
}
