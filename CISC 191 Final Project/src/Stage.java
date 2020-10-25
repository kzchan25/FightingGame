import java.awt.Rectangle;
import java.util.ArrayList;
public class Stage {
	private ArrayList<Rectangle> ground = new ArrayList<Rectangle>();
	
	public Stage(ArrayList<Rectangle> rect) {
		this.ground = rect;
	}
	
	public boolean inGround(Rectangle rect) {
		for (int i = 0; i < ground.size(); i++) {
			System.out.print(rect.intersects(ground.get(i)));
			if (rect.intersects(ground.get(i))) {
				System.out.print("true");
				return true;
			}
		}
		return false;
	}
	
	public ArrayList<Rectangle> getGround() {
		return ground;
	}
	
	
	
}
