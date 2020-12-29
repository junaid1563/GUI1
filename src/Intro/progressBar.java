package Intro;

import javax.swing.*;
import java.awt.*;

public class progressBar {

	JFrame frame = new JFrame();
	JProgressBar bar = new JProgressBar(0,500);

	progressBar() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setSize(new Dimension(420, 420));
		// bar
		bar.setValue(0);
		bar.setBounds(50, 100, 300, 50);
		bar.setStringPainted(true);
		bar.setFont(new Font("MV Boli", Font.PLAIN, 20));
		bar.setForeground(Color.red);
		bar.setBackground(Color.black);
	
		frame.add(bar);

		frame.setVisible(true);
		fill();

	}

	public void fill() {
		int count = 500;
		while (count >=0) {
			bar.setValue(count);
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			count--;
		}
		bar.setString("Completed!!!");
	}
}
