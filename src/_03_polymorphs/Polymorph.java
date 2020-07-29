package _03_polymorphs;

import java.awt.Graphics;

public abstract class Polymorph {
    int x;
    int y;
    int width;
    int height;
    
    void setWidth(int width) {
    	this.width = width;
    }
    void setHeight(int height) {
    	this.height = height;
    }
    int getHeight() {
    	return height;
    }
    int getWidth() {
    	return width;
    }
    
    void setX(int x) {
    	this.x = x;
    }
    void setY(int y) {
    	this.y = y;
    }
    int getX() {
    	return x;
    }
    int getY() {
    	return y;
    }
    
    Polymorph(int x, int y){
   	 this.x = x;
   	 this.y = y;
    }
    
    public void update(){
   	 
    }
    
    public abstract void draw(Graphics g);
}
