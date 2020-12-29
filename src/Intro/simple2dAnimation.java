package Intro;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class simple2dAnimation {

	JFrame frame;
	panel p = new panel();

	simple2dAnimation() {
		frame = new JFrame();

		// label

		// constructing frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		frame.add(p);
		frame.setResizable(false);
		frame.setVisible(true);
	}

	public class panel extends JPanel implements ActionListener {
		final int PANEL_WIDTH = 500;
		final int PANEL_HEIGHT = 500;

		Timer timer;
		int xVelocity = 1;
		int yVelocity = 100;
		Image enemy;
		Image back;
		int x = 0;// initial positions
		int y = 0;

		panel() {
			enemy = new ImageIcon("rocket.png").getImage();
			back = new ImageIcon("back.jpg").getImage();
			y=PANEL_HEIGHT-enemy.getHeight(null);
			this.setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
			this.setBackground(Color.white);
			this.setOpaque(false);
			timer = new Timer(10, this);
			timer.start();
		}

		public void paint(Graphics g) {
			Graphics2D g2D = (Graphics2D) g;
			g2D.drawImage(back, 0, 0, null);
			g2D.drawImage(enemy, x, y, null);
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if (x > PANEL_WIDTH - enemy.getWidth(null) || x < 0) {
				xVelocity = xVelocity * -1;

			}

			x = x + xVelocity;

			
			if (y > PANEL_WIDTH - enemy.getHeight(null) || y < 0) {
				yVelocity = yVelocity * -1;

			}

			y = y + yVelocity;

			repaint();

		}
	}

}
