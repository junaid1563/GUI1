package Intro;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class JRadioButtons extends JFrame implements ActionListener {

	JRadioButton pizza_button;
	JRadioButton burger_button;
	JRadioButton sandwitch_button;

	JRadioButtons() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());

		// creating RadioButtons
		pizza_button = new JRadioButton("pizza");
		this.burger_button = new JRadioButton("burger");
		this.sandwitch_button = new JRadioButton("Sandwitch");

		// adding these into a buttonGroup
		ButtonGroup group = new ButtonGroup();
		group.add(pizza_button);
		group.add(burger_button);
		group.add(sandwitch_button);// now we can select only one button at a time

		// adding ActionListener
		pizza_button.addActionListener(this);
		this.burger_button.addActionListener(this);
		this.sandwitch_button.addActionListener(this);

		// adding buttons to frame
		this.add(this.burger_button);
		this.add(this.pizza_button);
		this.add(this.sandwitch_button);

		this.pack();
		this.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == this.pizza_button) {
			JOptionPane.showMessageDialog(null, "You Ordered A Pizza!");
		} else if (e.getSource() == this.burger_button) {
			JOptionPane.showMessageDialog(null, "You Ordered A Burger!");
		} else if (e.getSource() == this.sandwitch_button) {
			JOptionPane.showMessageDialog(null, "You Ordered A Sandwitch!");
		}

	}

}
