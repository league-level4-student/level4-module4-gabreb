package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class MovingMorph extends Polymorph {
	boolean t = true;
	MovingMorph(int x, int y) {
		super(x, y);

	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.green);
		g.fillRect(x, y, 50, 50);
	}

	public void update() {
		if (t) {
			if (y < 450) {
				y += 4;
			} else {
				t = false;
			}
		}
		else if (!t) {
			if (y > 0) {
			y -= 4;
			}
			else {
				t = true;
			}
		}
	}
}
