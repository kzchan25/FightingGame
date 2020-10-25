import java.awt.Rectangle;
public class MovingRectangle extends Rectangle {
	private float xVelocity, yVelocity, direction, totalVelocity;
	private final float MAX_VELOCITY = 5;
	private final float GRAVITY = 1;
	Stage stage;
	public MovingRectangle(int x, int y, int width, int height, Stage stage) {
		super(x, y, width, height);
		xVelocity = 0;
		yVelocity = 0;
		direction = 0;
		totalVelocity = 0;
		this.stage = stage;
	}
	
	public void applyGravity() {
		yVelocity += GRAVITY;
	}
	
	public void maxSpeed() {
		float drag = (float) .9;
		direction = (float) Math.atan(yVelocity / xVelocity);
		while ((float) Math.sqrt(Math.pow(xVelocity, 2) + Math.pow(yVelocity, 2)) >= MAX_VELOCITY) {
			xVelocity *= drag;
			yVelocity *= drag;
		}
	}
	
	public void update() {
		if (!onGround()) {
			applyGravity();
		}
		this.x += xVelocity;
		this.y += yVelocity;
		totalVelocity = (float) Math.sqrt(Math.pow(xVelocity, 2) + Math.pow(yVelocity, 2));
		maxSpeed();
		direction = (float) Math.atan(yVelocity / xVelocity);
	}
	
	public boolean onGround() {
		return stage.inGround(this);
	}
}
