package Intro;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class jComboBox extends JFrame implements ActionListener {

	JComboBox combo;

	jComboBox() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());

		// creating ComboBox
		String[] references = { "One", "two", "Three" };
		combo = new JComboBox(references);
		combo.addActionListener(this);
		// some important functions in combo box
		combo.setEditable(true);//we can write names manually
		combo.addItem("Four");//adding new items
//		combo.insertItemAt("Yellow", 0);//add yellow at zro index
	
		combo.removeItem("One");//remove One from combo
		combo.removeAll();
		
		
		this.add(combo);
		this.pack();
		this.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == combo) {
			System.out.println(combo.getSelectedIndex() + " -- " + combo.getSelectedItem());
		}

	}

}
