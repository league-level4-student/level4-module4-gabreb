package _03_polymorphs;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class PolymorphWindow extends JPanel implements ActionListener, MouseMotionListener  {
	public static final int WIDTH = 900;
	public static final int HEIGHT = 600;

	private JFrame window;
	private Timer timer;
	ArrayList<Polymorph> p;

	public static void main(String[] args) {
		new PolymorphWindow().buildWindow();

	}

	public void buildWindow() {
		window = new JFrame("IT'S MORPHIN' TIME!");
		window.add(this);
		window.getContentPane().setPreferredSize(new Dimension(500, 500));
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.pack();
		window.setVisible(true);
		window.addMouseMotionListener(this);
		p = new ArrayList<Polymorph>();
		p.add(new RedMorph(100, 100));
		p.add(new BluePolymorph(200, 200));
		p.add(new MovingMorph(300, 300));
		p.add(new CircleMorph(250,300));
		p.add(new MouseMorph(80 ,375));
		timer = new Timer(1000 / 30, this);
		timer.start();
	}

	public void paintComponent(Graphics g) {
		// draw background
		g.setColor(Color.LIGHT_GRAY);
		g.fillRect(0, 0, 500, 500);
		for (Polymorph a : p) {
			a.draw(g);
		}
		// draw polymorph

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		repaint();
		for (Polymorph a : p) {
			a.update();
		}
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		while (p.get(4).x < e.getX()) {
			p.get(4).x += 3;
		}
		while (p.get(4).x > e.getX()) {
			p.get(4).x-=3;
		}
		while (p.get(4).y < e.getY()) {
			p.get(4).y += 3;
		}
		while (p.get(4).y > e.getY()) {
			p.get(4).y -= 3;
		}
	}
}

