package Intro;
//bydefault frames uses BorderLayout
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.LayoutManager;

import javax.swing.*;

public class bLpractice {
	

	public static void main(String[] args) {
		// creating label for each panel
		// left label
		JLabel label = new JLabel();
		ImageIcon img = new ImageIcon("heimdall.jpg");
//		label.setBounds(0, 50, 100, 1000);
		label.setIcon(img);
		label.setText("I AM HEIMDALL");
		label.setHorizontalTextPosition(JLabel.CENTER);
		label.setVerticalTextPosition(JLabel.TOP);
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setVerticalAlignment(JLabel.BOTTOM);
		label.setForeground(Color.white);
		label.setFont(new Font("MV Boli", Font.BOLD, 10));

		// right label
		JLabel label1 = new JLabel();
//		ImageIcon img = new ImageIcon("heimdall.jpg");
//		label1.setBounds(0, 0, 100, 1000);
		label1.setIcon(img);
		label1.setText("I AM HEIMDALL");
		label1.setHorizontalTextPosition(JLabel.CENTER);
		label1.setVerticalTextPosition(JLabel.TOP);
		label1.setHorizontalAlignment(JLabel.CENTER);
		label1.setVerticalAlignment(JLabel.BOTTOM);
		label1.setForeground(Color.white);
		label1.setFont(new Font("MV Boli", Font.BOLD, 10));
		label1.setVerticalAlignment(JLabel.BOTTOM);

		// center label
		JLabel label2 = new JLabel();
		ImageIcon img2 = new ImageIcon("asgard.png");
//		label2.setBounds(0, 0, 100, 1000);
		label2.setIcon(img2);
//		label2.setText("I AM HEIMDALL");
//		label2.setHorizontalTextPosition(JLabel.CENTER);
//		label2.setVerticalTextPosition(JLabel.TOP);
		label2.setHorizontalAlignment(JLabel.CENTER);
		label2.setVerticalAlignment(JLabel.BOTTOM);
//		label2.setForeground(Color.white);
//		label2.setFont(new Font("MV Boli", Font.BOLD, 10));

		// header
		JLabel label3 = new JLabel();
		label3.setText("WELCOME TO ASGARD!!!!");
		label3.setHorizontalTextPosition(JLabel.CENTER);
		label3.setVerticalTextPosition(JLabel.CENTER);
		label3.setForeground(new Color(255, 223, 0));
		label3.setFont(new Font("Times New Roman", Font.BOLD, 30));

		// Footer
		
		JLabel label4 = new JLabel();
		label4.setText("GETOUT!!!!!!!!!!!!!");
		label4.setHorizontalTextPosition(JLabel.CENTER);
		label4.setVerticalTextPosition(JLabel.CENTER);
		label4.setForeground(new Color(255, 223, 0));
		label4.setFont(new Font("Times New Roman", Font.BOLD, 30));

		// frame
		JFrame frame = new JFrame();
		frame.setLayout(new BorderLayout(10, 10));
		frame.setSize(50, 50);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Open the Door HEIMDALL!!!");

		frame.setVisible(true);

		// creating Panels
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		JPanel panel4 = new JPanel();
		JPanel panel5 = new JPanel();

		// adding heimdall to east and west panel
		panel1.add(label);
		panel2.add(label1);
		panel5.add(label2);
		panel3.add(label3);
		panel4.add(label4);

		// changing bg of panels
		panel1.setBackground(Color.black);
		panel2.setBackground(Color.black);
		panel3.setBackground(Color.white);
		panel4.setBackground(Color.white);
		panel5.setBackground(Color.white);

		// setting a preferred size of panels
		panel1.setPreferredSize(new Dimension(100, 100));
		panel2.setPreferredSize(new Dimension(100, 100));
		panel3.setPreferredSize(new Dimension(100, 100));
		panel4.setPreferredSize(new Dimension(100, 100));
		panel5.setPreferredSize(new Dimension(100, 100));

		// adding panels too frame
		frame.add(panel1, BorderLayout.EAST);
		frame.add(panel2, BorderLayout.WEST);
		frame.add(panel3, BorderLayout.NORTH);
		frame.add(panel4, BorderLayout.SOUTH);
		frame.add(panel5, BorderLayout.CENTER);

	}

}
