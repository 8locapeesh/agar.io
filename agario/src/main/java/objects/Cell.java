package objects;


import board.MapGenerator;

import java.awt.*;
import java.util.Random;

public class Cell  {
    private int radius;
    public Point point;
    private Random rnd = new Random();



    public Cell(int radius){
        this.radius = radius;
        point = randomLocation();
    }

   public Point randomLocation(){
       Point point = new Point();
       point.x = rnd.nextInt(40);
       point.y = rnd.nextInt(40);
       return point;
   }
    public int getRadius() {
        this.radius = radius;
        return radius; }

}