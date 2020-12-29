package drag_n_drop_project;

import java.awt.FlowLayout;

import javax.swing.*;

public class myFrame extends JFrame {

	dragpanel drag = new dragpanel();

	myFrame() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500, 500);
		this.setLayout(new FlowLayout());
		this.setTitle("Drag & Drop");
		this.add(drag);

		this.setVisible(true);

	}
}
