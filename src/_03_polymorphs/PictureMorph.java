package _03_polymorphs;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

public class PictureMorph extends Polymorph{
	
	public static BufferedImage image;
	public static boolean needImage = true;
	public static boolean gotImage = false;
	
		PictureMorph(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}
		public void draw (Graphics g) {
			if (needImage) {
				loadImage("CAT.jpg");
			}
			if (gotImage) {
				g.drawImage(image, x, y, 80, 80, null);
			}
			}
		void loadImage(String imageFile) {
			if (needImage) {
				try {
					image = ImageIO.read(this.getClass().getResourceAsStream(imageFile));
					gotImage = true;
				} catch (Exception e) {

				}
				needImage = false;
			}
		}
}
