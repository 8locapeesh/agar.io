package objects;

import board.Gameobject;
import board.MapGenerator;

import java.awt.*;

public class Cell {
    private double radius;
    private double x;
    private double y;
    private double mass;
    private double deltaX;
    private double deltaY;
    protected Color color;
    protected double speed;


    public Cell(int radius, Color color, int x, int y, int deltaX, int deltaY, double mass, Color color, double speed) {
        this.radius = radius;
        this.color = color;
        this.x = x;
        this.y = y;
        this.deltaX = deltaX;
        this.deltaY = deltaY;
        this.mass = mass;
        this.speed = speed;

    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getDeltaX() {
        return deltaX;
    }

    public double getDeltaY() {
        return deltaY;
    }

    public double getRadius() {
        return radius;
    }

    public double getMass() { return mass; }

    public Color getColor() { return color; }

    public double getSpeed() { return speed; }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setDeltaX(double deltaX) {
        this.deltaX = deltaX;
    }

    public void setDeltaY(double deltaY) {
        this.deltaY = deltaY;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }
}
