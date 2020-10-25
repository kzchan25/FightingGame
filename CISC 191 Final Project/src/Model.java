import java.awt.Rectangle;
import java.util.ArrayList;
import processing.core.PApplet;

public class Model implements Runnable {
	PApplet processing;
	private ArrayList<Rectangle> rectangles = new ArrayList<Rectangle>();
	Stage stage;
	public Model(PApplet processing) {
		this.processing = processing;
		
	}
	
	public void setup() {
		//stage
		ArrayList<Rectangle> groundElements = new ArrayList<Rectangle>();
		stage = new Stage(groundElements);
		groundElements.add(new Ground((int)processing.width / 2, (int)processing.height / 2 + 200, 1000, 300));
		
		//entities
		rectangles.add(new MovingRectangle(500, 300, 200, 200, stage));
	}
	
	public void loop() {
		for (int i = 0; i < rectangles.size(); i++) {
			if (rectangles.get(i) instanceof MovingRectangle) {
				((MovingRectangle)rectangles.get(i)).update();
			}
		}
	}
	
	public ArrayList<Rectangle> getRectangles() {
		return rectangles;
	}
	
	public ArrayList<Rectangle> getGround() {
		return stage.getGround();
	}
	
	public void checkCollisions() {
		
	}

	@Override
	public void run() {
		setup();
	}
}
