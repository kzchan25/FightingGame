import java.awt.Rectangle;
import processing.core.PApplet;

public class Ground extends Rectangle {
	
	public Ground(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	public Ground() {
		this(0, 0, 100, 100);
	}
	
	public void update() {}
}
