import java.awt.Rectangle;
import java.util.ArrayList;
import processing.core.PApplet;

public class View implements Runnable {
	private PApplet processing;

	
	public View(PApplet processing){
		this.processing = processing;

	}
	
	public void setup() {
		processing.rectMode(processing.CENTER);
		processing.noStroke();
	}
	
	public void loop() {
		
	}
	
	public void displayRectangles(ArrayList<Rectangle> rectangles) {
		for (Rectangle rectangle : rectangles) {
			if (rectangle instanceof Ground) {
				processing.fill(91, 41, 3);
			}
			if (rectangle instanceof MovingRectangle) {
				processing.fill(179, 27, 0);
			}
			processing.rect((float)rectangle.getX(), (float)rectangle.getY(), (float)rectangle.getWidth(), (float)rectangle.getHeight());
		}
	}
	
	

	@Override
	public void run() {
		setup();
	}
}
