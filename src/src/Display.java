package src;

import java.awt.Dimension;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;
import javax.swing.JPanel;

import com.sun.prism.Graphics;

public class Display extends JPanel {
	private int width, height;
	private final JFrame frame = new JFrame();
	private BufferedImage image;

	public Display(int width, int height) {
		this.width = width;
		this.height = height;
		image = new BufferedImage(width,height,BufferedImage.TYPE_INT_ARGB);
		setSize(width,height);
		frame.setSize(width,height);
		frame.setLocationRelativeTo(null);
		frame.add(this);
		frame.setVisible(true);
	}
	public void paint(Graphics g){
		g.drawRect(10, 10, 10, 10);
	}

	private double sigmoid(double a) {
		return 1 - (1 / (1 + Math.exp(a)));
	}

}
