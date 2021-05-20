package board;


import objects.Cell;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class MapGenerator extends JPanel {
	public Color color = new Color(102,102,199);
	ArrayList<Cell> cells;
	static final int bdSize = 15;
	static final int posX = 40;
	static final int posY = 40;
	static int width = posX * bdSize;
	static int height = posY * bdSize;
	public MapGenerator(ArrayList<Cell> cells){
		this.cells = cells;
		this.setBackground(color);}
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			draw(g);
		}


		public void draw(Graphics g){
			g.setColor(Color.black);
			for (int i = 0; i < width / bdSize; i++) {
				g.drawLine(i * bdSize, 0, i * bdSize, height);
			}
			for (int i = 0; i < height / bdSize; i++) {
				g.drawLine(0, i * bdSize, width, i * bdSize);
			}
			g.setColor(Color.BLACK);
			for (int i = 0; i < cells.size(); i++) {
				g.fillOval(cells.get(i).point.x*bdSize+1, cells.get(i).point.y*bdSize+1, cells.get(i).getRadius(), cells.get(i).getRadius());
			}


			}

		}



