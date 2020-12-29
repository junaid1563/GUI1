package Intro;
import java.awt.Color;
import java.awt.Dimension;
//panels use FlowLayout by default while frame uses BorderLayout
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class flowLayout {

	public static void main(String[] args) {
		// frame
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setSize(400, 400);
		frame.setTitle("FlowLayout!!!!!!!!!!!!!!!");
		frame.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 20));// FlowLayout(FlowLayout.positions,horizontal_spacing,vertical_spacing)

//		creating a panel
		JPanel panel=new JPanel();
		panel.setPreferredSize(new Dimension(200,300));
		panel.setLayout(new FlowLayout());
		panel.setBackground(Color.red);
		
		
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
		// adding buttons
		panel.add(b1);
		panel.add(b2);
		panel.add(b3);
		panel.add(b4);
		panel.add(b5);
		panel.add(b6);
		panel.add(b7);
		panel.add(b8);
		panel.add(b9);
		
		//adding panel to frame
		frame.add(panel);

		// setting frame visible
		frame.setVisible(true);

	}

}
