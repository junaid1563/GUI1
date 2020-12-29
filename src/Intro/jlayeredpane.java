package Intro;

import java.awt.Color;

import javax.swing.*;

public class jlayeredpane {

	public static void main(String[] args) {
		// frame
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.setSize(400, 400);
		frame.setTitle("Layered_Pane!!!!!!!!!!!!!!!");
		frame.setLayout(null);

		// Label
		JLabel label1 = new JLabel();
		label1.setBounds(50, 50, 100, 100);
		label1.setBackground(Color.red);
		label1.setOpaque(true);

		JLabel label2 = new JLabel();
		label2.setBounds(80, 80, 100, 100);
		label2.setBackground(Color.green);
		label2.setOpaque(true);

		JLabel label3 = new JLabel();
		label3.setBounds(110, 110, 100, 100);
		label3.setBackground(Color.black);
		label3.setOpaque(true);

		// JLayeredPane
		JLayeredPane lp = new JLayeredPane();
		lp.setBounds(0, 0, 400, 400);

		lp.add(label1, Integer.valueOf(0));
		lp.add(label2, Integer.valueOf(1));
		lp.add(label3, Integer.valueOf(2));
		frame.add(lp);
		frame.setVisible(true);
	}

}
