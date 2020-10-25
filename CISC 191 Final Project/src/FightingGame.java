import processing.core.PApplet;

public class FightingGame extends PApplet{
	private Controller controller;
	public static void main(String[] args) {
		PApplet.main(new String[] { "--present", FightingGame.class.getName() }); 
	}
	
	public void setup() {
		size(1920, 1080);
		controller = new Controller(0, this);
		controller.setup();
	}
	
	public void draw() {
		background(255);
		controller.loop();
	}
	
	public void keyPressed() {
		controller.keyPressed();
	}
}
//finished(hopefully)