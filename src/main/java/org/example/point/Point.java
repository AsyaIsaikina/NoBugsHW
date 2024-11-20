package org.example.point;

public class Point implements Movable {
    private double x;
    private double y;

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public void moveUp() {
        setY(this.y+1);
    }

    @Override
    public void moveDown() {
       setY(this.y--);
    }


    @Override
    public void moveLeft() {
        setX(this.x--);
    }

    @Override
    public void moveRight() {
      setX(this.x++);
    }

    @Override
    public void print() {
      System.out.println("Coordinates:  X:" + this.x + " Y:" + this.y);
    }


}
