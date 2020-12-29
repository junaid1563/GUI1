package Intro;

import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;

public class jSlider implements ChangeListener {
	JFrame frame;
	JPanel panel;
	JLabel label;
	JSlider slider;

	jSlider() {
		frame = new JFrame("Slider Demo!!!");
		panel = new JPanel();
		label = new JLabel();
		slider = new JSlider(0, 100, 50);// JSlider(min,max,sp) sp=starting Point
		slider.setPreferredSize(new Dimension(400, 300));
		// adding small ticks after every 5 units
		slider.setPaintTicks(true);
		slider.setMinorTickSpacing(5);
		// adding major tracks after every 10 units
		slider.setPaintTrack(true);
		;
		slider.setMajorTickSpacing(10);
		// viewing major tracks values
		slider.setPaintLabels(true);
		// changing font
		slider.setFont(new Font("MV Boli", Font.PLAIN, 15));
		label.setFont(new Font("MV Boli", Font.PLAIN, 25));

		// changing orientation
		slider.setOrientation(1);// 0--Horizontal 1--Vertical
		slider.addChangeListener(this);
		// adding text to label
		label.setText("Temperature is " + slider.getValue()+" degrees.");	

		panel.add(slider);
		panel.add(label);
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420, 420);
		frame.setVisible(true);
	}

	@Override
	public void stateChanged(ChangeEvent e) {
		// adding text to label
		label.setText("Temperature is " + slider.getValue()+" degrees.");
		if(slider.getValue()==100) {
			JOptionPane.showMessageDialog(null, "Boiling Temperature Reached!!");
		}
		else if(slider.getValue()==0) {
			JOptionPane.showMessageDialog(null, "Freezing Temperature Reached!!");
		}
	}

}
