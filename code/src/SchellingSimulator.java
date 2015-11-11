import java.awt.Color;

import gui.GUISimulator;
import gui.Rectangle;

public class SchellingSimulator extends ConwaySimulator{
	
	private Color color[];
	
	public SchellingSimulator(GUISimulator g, Schelling sch, Color color[]) {
		super(g, sch);
		this.color = color;
	}

	protected void updateFrame() {
		int cells[][] = ((Schelling)game).getCells();

		for (int x = 0; x < cells.length; x++) {
			for (int y = 0; y < cells[x].length; y++) {
				gui.addGraphicalElement(new Rectangle(10+x * 12,10+ y*12, color[cells[x][y]], color[cells[x][y]], 10));
			}
		}
	}
}