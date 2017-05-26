import processing.core.PApplet;
import processing.core.PImage;

public class Main extends PApplet {

	private Sprite sprite;

	PImage img;

	public static void main(String[] args) {
		PApplet.main("Main");
	}

	public void settings() {
		size(500, 700);
	}

	public void setup() {
		imageMode(CENTER);
		img = loadImage("images/sprite.png");
		sprite = new Sprite(this, img);
	}

	public void draw() {
		background(0);
		sprite.update();
		sprite.show();
	}

	@Override
	public void keyPressed() {
		sprite.jump();
	}
}
