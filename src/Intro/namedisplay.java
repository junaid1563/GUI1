package Intro;

import java.awt.Color;
import java.awt.Font;

import javax.swing.*;
import javax.swing.border.Border;

public class namedisplay {
	public static void main(String[] args) {
//		// creating a frame
//		JFrame frame = new JFrame();
//		// setting the size
//		frame.setSize(420, 420);
//		//setting the title
//		frame.setTitle("Whatsup!!");
//		//exit by clicking on X button
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		//preventing frame being resizable
//		frame.setResizable(false);
//		// make frame visible
//		frame.setVisible(true);
//		//creating a image icon
//		ImageIcon icon = new ImageIcon("C:\\Users\\Junaid1563\\eclipse-workspace\\GUI\\J_logo.jpg");
//		//setting the icon image to our icon
//		frame.setIconImage(icon.getImage());
//		//changing background color
//		frame.getContentPane().setBackground(new Color(123,50,250));//changing to a custom RGB color
//		frame.getContentPane().setBackground(new Color(0x101010));//changing to a custom hexadecimal color
//		

		myFrame myframe = new myFrame();
		// setting layout as null now nothing will be displayed until i change the
		// bounds of label
		myframe.setLayout(null);
		// creating a label
		JLabel label = new JLabel();
		//changing bounds of label
		label.setBounds(0, 0, 400, 380);//set x and y position and size of label
		// setting a string or Text
		label.setText("Ahh Here we go Again!");
		// adding label to the myframe
		myframe.add(label);
		// creating an ImageIcon
		ImageIcon img = new ImageIcon("scenery.jpg");
		// creating a border
		Border border = BorderFactory.createLineBorder(Color.CYAN, 2);
		// setting the icon as JLabel.Icon
		label.setIcon(img);
		// changing the horizontal position of text w.r.t. to icon LEFT,CENTER,RIGHT
		label.setHorizontalTextPosition(JLabel.CENTER);
		// changing the vertical position of text w.r.t. to icon TOP,CENTER,BOTTOM
		label.setVerticalTextPosition(JLabel.TOP);
		// changing color of font
		label.setForeground(new Color(0, 255, 200));
		// customizing style of font
		label.setFont(new Font("MV  Boli", Font.BOLD, 20));
		// changing the gap between icon-text
		label.setIconTextGap(10);
		// changing background color
		label.setBackground(new Color(0, 0, 0));
		// setting Opaque true
		label.setOpaque(true);
		// adding border to our label
		label.setBorder(border);
		// changing horizontal alignment of text+icon in label
		label.setHorizontalAlignment(JLabel.CENTER);
		// changing verticle Alignment of text+icon in label
		label.setVerticalAlignment(JLabel.CENTER);
		

	}
}
