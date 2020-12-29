package Intro;

import java.awt.*;

import javax.swing.*;
import javax.swing.border.Border;

public class family {//practice

	public static void main(String[] args) {
		JLabel label1 = new JLabel();
		label1.setText("Anna");
		label1.setForeground(Color.white);
		Font font = new Font("MV Boli", Font.ITALIC, 20);
		label1.setFont(font);
		ImageIcon icon = new ImageIcon("anna.jpg");
		label1.setIcon(icon);
		label1.setBounds(0, 0, 298, 300);
		label1.setHorizontalTextPosition(JLabel.CENTER);
		label1.setVerticalTextPosition(JLabel.BOTTOM);
		label1.setHorizontalAlignment(JLabel.CENTER);
		label1.setVerticalAlignment(JLabel.CENTER);
		Border border = BorderFactory.createLineBorder(Color.WHITE, 2);
		label1.setBorder(border);

		JPanel anna = new JPanel();
		anna.setLayout(null);
		anna.setBounds(0, 0, 300, 300);
		anna.setBackground(Color.red);
		anna.add(label1);

		JLabel label2 = new JLabel();
		label2.setText("Popi");
		label2.setForeground(Color.white);
//		Font font1 = new Font("MV Boli", Font.ITALIC, 20);
		label2.setFont(font);
		ImageIcon icon2 = new ImageIcon("popi.jpg");
		label2.setIcon(icon2);
		label2.setBounds(0, 0, 590, 290);
		label2.setHorizontalTextPosition(JLabel.CENTER);
		label2.setVerticalTextPosition(JLabel.BOTTOM);
		label2.setHorizontalAlignment(JLabel.CENTER);
		label2.setVerticalAlignment(JLabel.CENTER);
		Border border1 = BorderFactory.createLineBorder(Color.black, 2);
		label2.setBorder(border1);

		JPanel popi = new JPanel();
		popi.setLayout(null);
		popi.setBounds(0, 300, 600, 300);
		popi.setBackground(Color.green);
		popi.add(label2);

		JLabel label3 = new JLabel();
		label3.setText("Topi");
		label3.setForeground(Color.white);
//		Font font = new Font("MV Boli", Font.ITALIC, 20);
		label3.setFont(font);
		ImageIcon icon3 = new ImageIcon("tpi.jpg");
		label3.setIcon(icon3);
		label3.setBounds(0, 0, 298, 300);
		label3.setHorizontalTextPosition(JLabel.CENTER);
		label3.setVerticalTextPosition(JLabel.BOTTOM);
		label3.setHorizontalAlignment(JLabel.CENTER);
		label3.setVerticalAlignment(JLabel.CENTER);
		Border border3 = BorderFactory.createLineBorder(Color.blue, 2);
		label3.setBorder(border3);

		JPanel topi = new JPanel();
		topi.setLayout(null);
		topi.setBounds(300, 0, 300, 300);
		topi.setBackground(Color.yellow);
		topi.add(label3);

		JFrame frame = new JFrame();
		frame.setTitle("My Family");
		frame.setResizable(false);
		frame.setLayout(null);
		frame.setSize(600, 600);
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(anna);
		frame.add(popi);
		frame.add(topi);
		ImageIcon img=new ImageIcon("logo.jpg");
		frame.setIconImage(img.getImage());
		frame.setVisible(true);

	}

}
