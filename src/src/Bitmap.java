package src;

import java.awt.image.BufferedImage;

public class Bitmap {
int width, height;
int[] data;
	public Bitmap(int width, int height) {
		this.width = width;
		this.height = height;
		data = new int[width*height];
	}
	public void set(int x,int y, int color){
		data[x+y*width]=color;
	}
	public void copyToBufferedImage(BufferedImage image){
		image.setRGB(0, 0, width, height, data, 0, width);
	}
	

}
