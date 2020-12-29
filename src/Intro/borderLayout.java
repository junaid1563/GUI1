package Intro;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class borderLayout {

	public static void main(String[] args) {
		// creating a frame
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("BorderLayout Basics");
		frame.setLayout(new BorderLayout(10, 10));
		frame.setSize(600, 600);
		frame.setVisible(true);

		// creating panels
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		JPanel panel4 = new JPanel();
		JPanel panel5 = new JPanel();
		// changing bg of panels
		panel1.setBackground(Color.red);
		panel2.setBackground(Color.black);
		panel3.setBackground(Color.yellow);
		panel4.setBackground(Color.green);
		panel5.setBackground(Color.blue);
		// creating a border
//		Border border= BorderFactory.createLineBorder(Color.white, 3);
//		//adding border to all panels
//		panel1.setBorder(border);
//		panel2.setBorder(border);
//		panel3.setBorder(border);
//		panel4.setBorder(border);
//		panel5.setBorder(border);

		// setting a preferred size of panels
		panel1.setPreferredSize(new Dimension(100, 100));
		panel2.setPreferredSize(new Dimension(100, 100));
		panel3.setPreferredSize(new Dimension(100, 100));
		panel4.setPreferredSize(new Dimension(100, 100));
		panel5.setPreferredSize(new Dimension(100, 100));

		// ---------------------------------------------sub-panels------------------------------------------------------------
		JPanel panel6 = new JPanel();
		JPanel panel7 = new JPanel();
		JPanel panel8 = new JPanel();
		JPanel panel9 = new JPanel();
		JPanel panel10 = new JPanel();
		// changing bg of panels
		panel6.setBackground(Color.orange);
		panel7.setBackground(Color.pink);
		panel8.setBackground(Color.DARK_GRAY);
		panel9.setBackground(Color.MAGENTA);
		panel10.setBackground(Color.CYAN);
		// creating a border
//		Border border= BorderFactory.createLineBorder(Color.white, 3);
//		//adding border to all panels
//		panel1.setBorder(border);
//		panel2.setBorder(border);
//		panel3.setBorder(border);
//		panel4.setBorder(border);
//		panel5.setBorder(border);

		// setting a preferred size of panels
		panel6.setPreferredSize(new Dimension(50, 50));
		panel7.setPreferredSize(new Dimension(50, 50));
		panel8.setPreferredSize(new Dimension(50, 50));
		panel9.setPreferredSize(new Dimension(50, 50));
		panel10.setPreferredSize(new Dimension(50, 50));

		// adding a new Border Layout to panel5
		panel5.setLayout(new BorderLayout(5, 5));
		// adding panels to panel5
		panel5.add(panel6, BorderLayout.NORTH);
		panel5.add(panel7, BorderLayout.SOUTH);
		panel5.add(panel8, BorderLayout.EAST);
		panel5.add(panel9, BorderLayout.WEST);
		panel5.add(panel10, BorderLayout.CENTER);

		// --------------------------------------------------sub-panels--------------------------------------------------------------------/

		// adding panels to our frame
		frame.add(panel1, BorderLayout.NORTH);
		frame.add(panel2, BorderLayout.SOUTH);
		frame.add(panel3, BorderLayout.EAST);
		frame.add(panel4, BorderLayout.WEST);
		frame.add(panel5, BorderLayout.CENTER);

	}

}
