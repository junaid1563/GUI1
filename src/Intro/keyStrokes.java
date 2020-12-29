package Intro;

import java.awt.Color;

import java.awt.event.*;

//import javax.swing.AbstractAction;
import javax.swing.*;

public class keyStrokes {

	JFrame frame;
	JLabel label;

	Action upAction;
	Action downAction;
	Action leftAction;
	Action rightAction;

	keyStrokes() {
		frame = new JFrame("Key Strokes!!");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setSize(500, 500);
		frame.getContentPane().setBackground(Color.white);

		label = new JLabel();
		label.setBounds(100, 100, 100, 100);
		label.setBackground(Color.red);
		label.setOpaque(true);
		// instantiating Actions

		upAction = new UpAction();
		downAction = new DownAction();
		leftAction = new LeftAction();
		rightAction = new RightAction();

		// adding actions to keys
		label.getInputMap().put(KeyStroke.getKeyStroke("UP"), "upAction");// getting input key
		label.getActionMap().put("upAction", upAction);// applying action on label

		label.getInputMap().put(KeyStroke.getKeyStroke("DOWN"), "downAction");
		label.getActionMap().put("downAction", downAction);

		label.getInputMap().put(KeyStroke.getKeyStroke("LEFT"), "leftAction");
		label.getActionMap().put("leftAction", leftAction);

		label.getInputMap().put(KeyStroke.getKeyStroke("RIGHT"), "rightAction");
		label.getActionMap().put("rightAction", rightAction);

		frame.add(label);
		frame.setVisible(true);

	}

	public class UpAction extends AbstractAction {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			label.setLocation(label.getX(), label.getY() - 10);

		}
	}

	public class DownAction extends AbstractAction {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			label.setLocation(label.getX(), label.getY() + 10);

		}
	}

	public class LeftAction extends AbstractAction {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			label.setLocation(label.getX() - 10, label.getY());

		}
	}

	public class RightAction extends AbstractAction {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			label.setLocation(label.getX() + 10, label.getY());

		}
	}

}
