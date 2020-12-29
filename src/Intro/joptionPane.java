package Intro;

import javax.swing.*;

public class joptionPane {

	public static void main(String[] args) {
		JOptionPane pane = new JOptionPane();
//		pane.showMessageDialog(null, "Helllo User!!!", "First", JOptionPane.PLAIN_MESSAGE);//first type PLAIN MESSAGE

//		pane.showMessageDialog(null, "GOOD INFORMATION FOR YOU!!!", "Second", JOptionPane.INFORMATION_MESSAGE);//second type INFORMATION MESSAGE

//		pane.showMessageDialog(null, "Are You Sure?", "Third", JOptionPane.QUESTION_MESSAGE);//third type QUESTION MESSAGE

//		pane.showMessageDialog(null, "Stop Doing This", "Fourth", JOptionPane.WARNING_MESSAGE);//fourth type WARNING MESSAGE
//		while (true) {
//			pane.showMessageDialog(null, "Your Computer has been Hacked!", "Alert", JOptionPane.ERROR_MESSAGE);//fifth type ERROR MESSAGE

//		}

//		int i=JOptionPane.showConfirmDialog(null, "Hey WhtsUp", "Just", JOptionPane.YES_NO_CANCEL_OPTION,
//				JOptionPane.INFORMATION_MESSAGE, null);// it give an integer as output for each response

//		System.out.println(i);//0 for yes
		// 1 for NO
		// 2 for Cancel
		// -1 for X(Close)
//		String name = (String) JOptionPane.showInputDialog(null, "What is Your Name?", "Enter Name",
//				JOptionPane.QUESTION_MESSAGE, null, null, "Name Here");
////		System.out.println("Hello " + name);
//		JOptionPane.showMessageDialog(null, "Hello "+name+"!!");

		String[] responses = { "OR KYA!!", "BACHPAN SE!!", "PATA NAHI!!" };
		String name = JOptionPane.showInputDialog(null, "Enter Your Name");
		int i=JOptionPane.showOptionDialog(null, name + " PAGAL H?", "IMPORTANT QUESTION!", JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.QUESTION_MESSAGE, null, responses, 0);
	
		if(i==0) {JOptionPane.showMessageDialog(null, "Kya Karu? Laddu Batu?");}
		else if(i==1) {JOptionPane.showMessageDialog(null, "Jindagi Barbaad Huui Gawa!");}
		else if(i==2) {JOptionPane.showMessageDialog(null, "To Malum Karo!");}
		else if(i==-1) {JOptionPane.showMessageDialog(null, "Lagta h Tu Bhi Pagal h!!");}
	
	}

}
