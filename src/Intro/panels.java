package Intro;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.*;
import javax.swing.border.Border;

public class panels {
	public static void main(String[] args) {
		// JPanel is a GUI component thet acts as the a container and it works like a
		// JFrame we can add components like JLable in it

		// creating an icon
		ImageIcon img = new ImageIcon("car.jpg");
		// creating a label
		JLabel label = new JLabel();
		label.setText("Whoa");
		label.setIcon(img);
		label.setForeground(Color.white);
		label.setHorizontalAlignment(JLabel.CENTER);
//		label.setVerticalAlignment(JLabel.TOP);
		label.setBounds(10, 20, 200, 200);// these bounds are with respect to redpanel
		label.setHorizontalTextPosition(JLabel.CENTER);
		label.setVerticalTextPosition(JLabel.BOTTOM);
		// creating a border
		Border border = BorderFactory.createLineBorder(Color.white, 1);
		label.setBorder(border);

		// creating a red panel
		JPanel redpanel = new JPanel();
		redpanel.setBounds(0, 0, 250, 250);
		redpanel.setBackground(Color.red);
//		redpanel.add(label);
		// using null layout manager
		redpanel.setLayout(null);
		// adding the lable to redpanel
		redpanel.add(label);

		// creating a blue panel
		JPanel bluepanel = new JPanel();
		bluepanel.setBounds(250, 0, 250, 250);
		bluepanel.setBackground(Color.blue);

		// craeting a green panel
		JPanel greenpanel = new JPanel();
		greenpanel.setBounds(0, 250, 500, 250);
		greenpanel.setBackground(Color.green);
		// changing Layout of greenpanel
		greenpanel.setLayout(new BorderLayout());// here we are using BorderLayout manager
		// adding label into green panel
//		greenpanel.add(label);

		JFrame frame = new JFrame();
		frame.setLayout(null);
		frame.setSize(700, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setVisible(true);
		// adding redpanel to frame
		frame.add(redpanel);
		// adding bluepanel to frame
		frame.add(bluepanel);
		// adding greenpanel to frame
		frame.add(greenpanel);
	}
}
