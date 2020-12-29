package Intro;

import java.awt.*;

import javax.swing.*;

public class graphics2D extends JFrame {

	myPanel panel;

	graphics2D() {
		panel = new myPanel();
		panel.setBackground(Color.white);
//		panel.setOpaque(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		this.setSize(400, 400);
		this.getContentPane().setBackground(Color.white);

		this.setLocationRelativeTo(null);
		this.add(panel);
		this.setResizable(false);
		this.pack();
		this.setVisible(true);

	}

}
