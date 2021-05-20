package main;

import board.Board;
import board.MapGenerator;
import objects.Cell;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Main {
    static ArrayList<Cell> cells = new ArrayList<>();
    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) {
            cells.add(new Cell(12));
        }
        Board b = new Board(cells);
    }
}

