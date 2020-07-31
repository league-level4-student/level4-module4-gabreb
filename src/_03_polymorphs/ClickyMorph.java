package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class ClickyMorph extends Polymorph {

	ClickyMorph(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(x, y, 50, 50);
		
	}

}
