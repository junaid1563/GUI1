package newWindow;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class LaunchPage implements ActionListener {

	// members
	JFrame frame = new JFrame();
	JButton button = new JButton();

	LaunchPage() {
		this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.frame.setLayout(null);
		this.frame.setSize(new Dimension(400, 400));

		// Label
		JLabel label = new JLabel();
		ImageIcon img = new ImageIcon("thor.jpg");
		label.setIcon(img);
		label.setText("Open The Door HEIMDALL");
		label.setHorizontalTextPosition(JLabel.CENTER);
		label.setVerticalTextPosition(JLabel.TOP);
		label.setForeground(Color.red);
		label.setFont(new Font("MV Boli", Font.BOLD, 14));

		this.button.setBounds(100, 150, 250, 150);
		this.button.addActionListener(this);
		this.button.setFocusable(false);
		this.button.add(label);
		this.button.setBackground(Color.black);

		this.frame.add(this.button);
		this.frame.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button) {

			frame.dispose();//it dispose this window and then only one new window will open	 
			new NewWindow();
		}

	}
}
