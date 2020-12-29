package Intro;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class jcolorchooser implements ActionListener {

	JFrame frame;
	JButton button;
	JLabel label;

	jcolorchooser() {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setSize(420, 420);

		button = new JButton("Select Color");
		button.setBounds(100, 0, 100, 50);
		button.addActionListener(this);

		// creating label
		label = new JLabel();
		label.setBounds(0, 100, 420, 100);
		label.setText("Oh Bhai Maan Ja!");
		label.setFont(new Font("MV Boli", Font.BOLD, 20));
		label.setBackground(Color.white);
		label.setOpaque(true);

		label.setHorizontalTextPosition(JLabel.CENTER);
		label.setVerticalTextPosition(JLabel.CENTER);

		frame.add(button);
		frame.add(label);
//		frame.pack();
		frame.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == button) {
//			JColorChooser cc=new JColorChooser(); 
			Color color=JColorChooser.showDialog(null, "Pick A Color", Color.black);
			label.setForeground(color);

		}

	}

}
