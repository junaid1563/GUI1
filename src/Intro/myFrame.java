package Intro;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class myFrame extends JFrame implements ActionListener {
	JButton button;
//	JLabel label;
	JTextField tf;
	JCheckBox cb;
	ImageIcon x;
	ImageIcon selected;

	public myFrame() {

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		this.setLayout(new FlowLayout());
		x = new ImageIcon("man.jpg");
		selected = new ImageIcon("check.jpg");

		// creating atextfield
//		tf = new JTextField();
//		tf.setPreferredSize(new Dimension( 300, 50));
		// adding this to frame
//		this.add(tf);
		// customizing textField
//		tf.setFont(new Font("Consolas", Font.PLAIN, 35));
//		tf.setForeground(Color.GREEN);
//		tf.setBackground(Color.black);
//		// blinking Line Color
//		tf.setCaretColor(Color.green);
//		// setting a pre defined text
//		tf.setText("Username");

		// creating a checkBox
		cb = new JCheckBox();
		cb.setText("I am a Student!");
		cb.setFont(new Font("MV Boli", Font.ITALIC, 35));
		cb.setForeground(Color.red);
		cb.setFocusable(false);
		cb.setIcon(x);
		cb.setSelectedIcon(selected);

		// button
		button = new JButton("Submit");
		button.addActionListener(this);

		this.add(button);
		this.add(cb);
//		ImageIcon i2 = new ImageIcon("man.jpg");
//		label=new JLabel();
//		label.setBounds(10, 20, 100, 100);
//		label.setIcon(i2);
//		label.setVisible(false);
//
//		// creating a button
//		button = new JButton();
//		button.setBounds(150, 150, 200, 150);
//		// adding actionListener to our button
//		button.addActionListener(this);// implementing ActionListener
//		// using lambda expression
////		button.addActionListener(e -> System.out.println("Bhrooom Bhroom!!"));
//		// adding text to button
//		button.setText("I am a Car!!");
//		// adding an icon
//		ImageIcon i = new ImageIcon("car.jpg");
//		button.setIcon(i);
//		// removing the textborder
//		button.setFocusable(false);
//		// changing text positions
//		button.setHorizontalTextPosition(JButton.CENTER);
//		button.setVerticalTextPosition(JButton.BOTTOM);
//		// changing font
//		button.setFont(new Font("Comic Sans", Font.BOLD, 15));
//		// changing text color
//		button.setForeground(Color.GREEN);
//		// changing border
//		button.setBorder(BorderFactory.createEtchedBorder());
//		// changing backgroundcolor
//		button.setBackground(Color.yellow);
//
//		// setting title
//		this.setTitle("Application");
////		null layout manager
//		this.setLayout(null);
//		// setting size
//		this.setSize(420, 420);
//		// creating Icon
//		ImageIcon icon = new ImageIcon("C:\\Users\\Junaid1563\\eclipse-workspace\\GUI\\J_logo.jpg");
//		// making our icon
//		this.setIconImage(icon.getImage());
//		// EXIT_ON_CLOSE
//		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		// changing background color
//		this.getContentPane().setBackground(new Color(255, 255, 255));
//		// unresizable
//		this.setResizable(false);
//		// adding button to frame
//		this.add(button);
//		// adding label
//		this.add(label);
//		// making frame visible
//		this.setVisible(true);
//
		// these should be in the last
		this.pack();
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
//		if (e.getSource() == button) {// performing an action when we click the button
//			System.out.println("don't do that!!!!!!");
//			label.setVisible(true);
//			button.setEnabled(false);
//		this.dispose();
//		JOptionPane.showMessageDialog(null, "Welcome " + tf.getText());
//		tf.setEditable(false);
		System.out.println(cb.isSelected());
//		button.setEnabled(false);
//		System.out.println("Welcome " + tf.getText());
	}

}
