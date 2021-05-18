package board;


import javax.swing.*;
import java.awt.*;

public class MapGenerator extends JPanel {
	public MapGenerator(){}
	public void draw(Graphics g) {
		//borders
		g.setColor(Color.yellow);
		g.fillOval(0, 0, 50, 50);

	}
}