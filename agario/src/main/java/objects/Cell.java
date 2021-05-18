package objects;

import board.Gameobject;
import board.MapGenerator;

import java.awt.*;

public class Cell  {
    private int radius;
    private int x;
    private int y;
    private double mass;
    private int deltaX;
    private int deltaY;
    protected Color color;
    protected int speed;


    public Cell(int radius, Color color, int x, int y, int deltaX, int deltaY, double mass){
        this.radius = radius;
        this.color = color;
        this.x = x;
        this.y = y;
        this.deltaX = deltaX;
        this.deltaY = deltaY;
        this.mass = mass;
    }

    public int getX() {
        return x;
    }


    public int getY() {
        return y;
    }

    public int getDeltaX() {
        return deltaX;
    }

    public int getDeltaY() {
        return deltaY;
    }

    public int getRadius() {
        return radius;
    }
    public double getMass(){
        return mass;
    }
}