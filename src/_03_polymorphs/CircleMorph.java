package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class CircleMorph extends Polymorph{
	int angle = 0;
	CircleMorph(int x, int y) {
		super(x, y);
		
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.yellow);
		g.fillRect(x, y, 50, 50);
	}

	public void update() {
	int radius = 50;
	x += radius*Math.cos(angle);
	y += radius*Math.sin(angle);
	angle += 1;
	}
}
