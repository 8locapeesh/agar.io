package main;

import board.Board;
import board.MapGenerator;
import objects.Cell;
import objects.Food;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Main {
    static ArrayList<Cell> cells = new ArrayList<>();
    static ArrayList<Food> foods = new ArrayList<>();
    public static void main(String[] args) {
        for (int i = 0; i < 40; i++) {
            foods.add(new Food(11));
        }
        for (int i = 1; i<2; i++){
            cells.add(new Cell(12));
        }
        Board b = new Board(cells, foods);
    }
}

