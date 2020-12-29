package drag_n_drop_project;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.*;

public class dragpanel extends JPanel {

	ImageIcon image = new ImageIcon("car.jpg");
	final int WIDTH = image.getIconWidth();
	final int HEIGHT = image.getIconHeight();
	Point imageCorner;
	Point prevPt;

	dragpanel() {
		// setting the corner to the (0,0)
		this.setSize(WIDTH, HEIGHT);
		imageCorner = new Point(0, 0);
		ClickListener clicklistener = new ClickListener();
		DragListener draglistener = new DragListener();
		this.addMouseListener(clicklistener);
		this.addMouseMotionListener(draglistener);
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		image.paintIcon(this, g, (int) imageCorner.getX(), (int) imageCorner.getY());
	}

	// creating aprivate class for clicklistener
	private class ClickListener extends MouseAdapter {
		public void mousePressed(MouseEvent e) {
			prevPt = e.getPoint();
		}

	}

	// creating a class to implement drag event
	private class DragListener extends MouseMotionAdapter {
		public void mouseDragged(MouseEvent e) {
			Point currentPt = e.getPoint();
			imageCorner.translate((int) (currentPt.getX() - prevPt.getX()), (int) (currentPt.getY() - prevPt.getY()));
			prevPt=currentPt;
			repaint();
		
		}
	}

}
