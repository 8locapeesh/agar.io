package board;


import javax.swing.*;
import java.awt.*;

public class Board  {
    public static void main(String[] args) {

        JFrame b = new JFrame("agar.io");
        MapGenerator map = new MapGenerator();
        b.setVisible(true);
        b.getContentPane().setBackground(new Color(102, 102, 102));
        b.setSize(700, 600);
        b.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        ;





       /* BlobGame theGame = new BlobGame();
        theGame.setSize(800, 800);
        theGame.setLocation(0, 0);
        b.getContentPane().add(theGame);



        b.addKeyListener(theGame);
        theGame.run();*/
    }
    }

