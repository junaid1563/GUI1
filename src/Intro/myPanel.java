package Intro;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class myPanel extends JPanel {

	myPanel() {
		this.setBackground(Color.white);
		this.setOpaque(false);
		this.setPreferredSize(new Dimension(400, 400));

	}

	Image img;

	public void paint(Graphics g) {// this function is used to paint a component
		img = new ImageIcon("drawing.jpg").getImage();

		Graphics2D g2d = (Graphics2D) g;
		g2d.drawImage(img, 0, 0, null);
		g2d.setStroke(new BasicStroke(2));/// changing width of line
		g2d.setPaint(Color.white);// changing color of line
//		g2d.drawLine(0, 0, 400, 400);//drawing a line 
		g2d.setPaint(Color.white);
		g2d.fillArc(20, 20, 100, 100, 45, 270);

		g2d.fillArc(280, 20, 100, 100, 215, 270);

		g2d.setPaint(Color.black);
		g2d.setFont(new Font("MV Boli", Font.BOLD, 15));
		g2d.drawString("How Are You Brother!", 130, 50);
//		int[] xPoints= {150,120,170};
//		int []yPoints= {150,120,170};
//		g2d.fillPolygon(xPoints, yPoints, 3);

//		g2d.drawLine(400, 0, 0, 400);
	}
}
