package Intro;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class mouseListener extends JFrame implements MouseListener {
	JLabel label;

	mouseListener() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		this.setSize(420, 420);
		this.getContentPane().setBackground(Color.BLACK);

		label = new JLabel();
//		label.setBounds(100, 100, 200, 100);
		label.setVerticalAlignment(JLabel.CENTER);
		ImageIcon icon = new ImageIcon("front.png");
		label.setIcon(icon);
		label.addMouseListener(this);
		label.setText("I am an emoji!");
		label.setHorizontalTextPosition(JLabel.CENTER);
		label.setVerticalTextPosition(JLabel.BOTTOM);
		label.setForeground(Color.white);
		label.setFont(new Font("MV Boli",Font.ITALIC,30));

		this.add(label);
		this.setVisible(true);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
//		System.out.println("Why did you click on it?");
		ImageIcon icon = new ImageIcon("happy.png");
		label.setIcon(icon);
		label.setText("I am happy!");
		label.setForeground(Color.BLUE);

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
//		System.out.println("Why did you press on it?");
		ImageIcon icon = new ImageIcon("toohappy.png");
		label.setIcon(icon);
		label.setText("I am too happy!");
		label.setForeground(Color.green);
		}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
//		System.out.println("Why did you release mouse?");
		ImageIcon icon = new ImageIcon("bignose.png");
		label.setIcon(icon);
		label.setText("What the hell!");
		label.setForeground(Color.yellow);
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
//		System.out.println("Why did you enter mouse?");
		ImageIcon icon = new ImageIcon("sad.png");
		label.setIcon(icon);
		label.setText("I am Sad!");
		label.setForeground(Color.MAGENTA);

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
//		System.out.println("Why did you leave?");
		ImageIcon icon = new ImageIcon("front.png");
		label.setIcon(icon);
		label.setText("Thank God I am Back!");
		label.setForeground(Color.white);
	}

}
