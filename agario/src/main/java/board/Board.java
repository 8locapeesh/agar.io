package board;


import objects.Cell;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Board extends JFrame {


   public Board(ArrayList<Cell> cells){
        this.setTitle("agar.io");
        this.add(new MapGenerator(cells));
        this.setSize(615, 638);
        setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }}


