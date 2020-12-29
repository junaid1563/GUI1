package Intro;

import java.awt.Color;
import java.awt.Font;

import javax.swing.*;
import javax.swing.border.Border;

public class Practice {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		//frame.setSize(420, 420);
		frame.setTitle("ohh Hello");
		ImageIcon img = new ImageIcon("J_logo.jpg");
		frame.setIconImage(img.getImage());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setVisible(true);

		JLabel label = new JLabel();
		label.setText("What a Game!!!!");
		ImageIcon icon = new ImageIcon("logo.jpg");
		label.setIcon(icon);
		frame.add(label);
		//label.setBounds(0,0,400,400);
		Font font=new Font("MV Boli",Font.PLAIN,30);
		label.setFont(font);
		label.setForeground(new Color(0x0020f0));
		label.setHorizontalTextPosition(JLabel.CENTER);
		label.setVerticalTextPosition(JLabel.TOP);
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setVerticalAlignment(JLabel.CENTER);
		Border border=BorderFactory.createLineBorder(Color.black, 3);
		label.setBorder(border);
		label.setBackground(Color.magenta);
		label.setOpaque(true);
	
		frame.pack();}
}
