package Intro;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.*;

public class fileChooser implements ActionListener {

	JFrame frame;
	JButton button;

	fileChooser() {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setSize(420, 420);

		button = new JButton("Select File");
		button.setBounds(100, 100, 100, 50);
		button.addActionListener(this);

		frame.add(button);
//		frame.pack();
		frame.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == button) {
			JFileChooser filechooser = new JFileChooser();// creating a filechooser

			int response = filechooser.showOpenDialog(null);// it will open a dialog to open a file and returns an
															// integer as response

			filechooser.setCurrentDirectory(new File("."));// changing th current directory

			if (response == JFileChooser.APPROVE_OPTION) {
				File file = new File(filechooser.getSelectedFile().getAbsolutePath());// getting the path of file
				System.out.println(file);// print the path of selected file
				System.exit(0);

			}

		}

	}
}
