import java.awt.Rectangle;
import java.util.ArrayList;
import processing.core.PApplet;

public class Controller {
	private PApplet processing;
	private int instance;
	private View view;
	private Model model;
	private MainKeyListener keyListener;
	
	
	public Controller(int instance, PApplet processing) {
		this.processing = processing;
		this.instance = instance;
		view = new View(processing);
		model = new Model(processing);
		keyListener = new MainKeyListener(processing);
	}
	
	public void setup() {
		view.run();
		model.run();
	}
	
	public synchronized void loop() {
		model.loop();
		view.displayRectangles(model.getRectangles());
		view.displayRectangles(model.getGround());
	}
	
	public void keyPressed() {
		keyListener.keyPressed();
	}
	
	

}
