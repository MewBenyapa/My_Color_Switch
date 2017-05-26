import processing.core.PImage;
import processing.core.PVector;

public class Sprite {
	
	private Main sprite;
	private PVector pos;
	private PVector vel;
	private PImage img;
	
	public Sprite (Main sprite, PImage img) {
		this.sprite = sprite;
		this.img = img;
		this.pos = new PVector(sprite.width / 2, sprite.height / 2);
		this.vel = new PVector();
	}
	
	public void jump() {
		vel.add(new PVector(0, -15f));
		vel.setMag(5);
		pos.add(vel);
	}
	
	public void update() {
		if (pos.y < sprite.height) {
			vel.add(new PVector(0, 0.1f));
			pos.add(vel);
		}
	}
	
	public void show() {
		sprite.image(img, pos.x, pos.y);
	}

}
