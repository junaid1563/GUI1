package Intro;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class keyEvents implements KeyListener {

	JFrame frame;
	JButton button;
	JLabel label;

	keyEvents() {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setSize(420, 420);
		frame.getContentPane().setBackground(Color.yellow);

		label = new JLabel();
		label.setBounds(0, 0, 200, 100);
		ImageIcon icon =new ImageIcon("rocket.png");
		label.setIcon(icon);
//		label.setBackground(Color.white);
//		label.setOpaque(true);

		frame.addKeyListener(this);
		frame.add(label);
		frame.setVisible(true);

	}

	@Override
	public void keyTyped(KeyEvent e) {// whenever a key is typed ,here we have keyChar()

		// TODO Auto-generated method stub
		switch (e.getKeyChar()) {
		case 'a': {
			label.setLocation(label.getX() - 500, label.getY());
			break;
		} // left
		case 's': {
			label.setLocation(label.getX(), label.getY() + 500);
			break;
		} // down
		case 'w': {
			label.setLocation(label.getX(), label.getY() - 500);
			break;
		} // up
		case 'd': {
			label.setLocation(label.getX() + 500, label.getY());
			break;
		} // right

		}

	}

	@Override
	public void keyPressed(KeyEvent e) {// whenever a key is pressed , here we have keyCode()
		// TODO Auto-generated method stub
		switch (e.getKeyCode()) {
		case 37: {
			label.setLocation(label.getX() - 10, label.getY());
			break;
		} // left
		case 38: {
			label.setLocation(label.getX(), label.getY() - 10);
			break;
		} // up
		case 39: {
			label.setLocation(label.getX() + 10, label.getY());
			break;
		} // right
		case 40: {
			label.setLocation(label.getX(), label.getY() + 10);
			break;
		} // down

		}
	}

	@Override
	public void keyReleased(KeyEvent e) {// here we have both keychar() and keyCode()
		// TODO Auto-generated method stub
//		System.out.println(e.getKeyChar()+" "+e.getKeyCode());

	}
}
