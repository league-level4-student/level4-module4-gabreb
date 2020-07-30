package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class MouseMorph extends Polymorph {

	MouseMorph(int x, int y) {
		super(x, y);

	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.CYAN);
		g.fillRect(x, y, 50, 50);
	}

	public void update() {
		
	}
}
