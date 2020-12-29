package Intro;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class gridLayout {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.setSize(400, 400);
		frame.setTitle("GridLayout!!!!!!!!!!!!!!!");
		frame.setLayout(new GridLayout(3, 3, 2, 2));// new GridLayout(nrow,ncol,horizotal_margin,vertical_margin) --
													// nrow=number of rows ,nclo=number of columns

		// buttons
		JButton b1 = new JButton("1");
		JButton b2 = new JButton("2");
		JButton b3 = new JButton("3");
		JButton b4 = new JButton("4");
		JButton b5 = new JButton("5");
		JButton b6 = new JButton("6");
		JButton b7 = new JButton("7");
		JButton b8 = new JButton("8");
		JButton b9 = new JButton("9");
//		JButton b10 = new JButton("10");
		// adding them

		frame.add(b1);
		frame.add(b2);
		frame.add(b3);
		frame.add(b4);
		frame.add(b5);
		frame.add(b6);
		frame.add(b7);
		frame.add(b8);
		frame.add(b9);
//		frame.add(b10);

		frame.setVisible(true);

		// if we add uneven components then number of columns will be varied
	}

}
