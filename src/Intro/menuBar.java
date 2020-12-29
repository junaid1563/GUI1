package Intro;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.*;

public class menuBar extends JFrame implements ActionListener {

	JMenu filemenu;
	JMenu editmenu;
	JMenu helpmenu;
	JMenuItem saveitem;
	JMenuItem loaditem;
	JMenuItem openitem;
	JMenuItem exititem;

	menuBar() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		this.setSize(420, 420);

		// creating a menubar
		JMenuBar menubar = new JMenuBar();

//		creating menus
		filemenu = new JMenu("File");
		editmenu = new JMenu("Edit");
		helpmenu = new JMenu("Help");

		// adding menus to MenuBar
		menubar.add(filemenu);
		menubar.add(editmenu);
		menubar.add(helpmenu);

		// menuItems
		saveitem = new JMenuItem("Save");
		loaditem = new JMenuItem("Load");
		openitem = new JMenuItem("Open");
		exititem = new JMenuItem("Exit");

		// adding ActionListeners to Items
		saveitem.addActionListener(this);
		loaditem.addActionListener(this);
		openitem.addActionListener(this);
		exititem.addActionListener(this);

		// adding icons to menuitems
		ImageIcon a = new ImageIcon("save.jpg");
		saveitem.setIcon(a);
		ImageIcon b = new ImageIcon("exit.png.jpg");
		exititem.setIcon(b);
		ImageIcon c = new ImageIcon("open.jpg");
		openitem.setIcon(c);
		ImageIcon d = new ImageIcon("load.png");
		loaditem.setIcon(d);

		// adding mnemonics
		saveitem.setMnemonic(KeyEvent.VK_S);// S for save
		loaditem.setMnemonic(KeyEvent.VK_L);// L for Load
		openitem.setMnemonic(KeyEvent.VK_O);// O for o
		exititem.setMnemonic(KeyEvent.VK_E);// E for Exit

		// adding mnemonics to menus
		filemenu.setMnemonic(KeyEvent.VK_F);// Alt + F for file
		editmenu.setMnemonic(KeyEvent.VK_E);// Alt + E for Edit
		helpmenu.setMnemonic(KeyEvent.VK_H);// Alt + H for Help

		/// adding menuItems
		filemenu.add(saveitem);
		filemenu.add(loaditem);
		filemenu.add(openitem);
		filemenu.add(exititem);

		// set menubar as default menubar for our frame
		this.setJMenuBar(menubar);
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == saveitem) {
			JOptionPane.showMessageDialog(null, "Saved!");
		} else if (e.getSource() == loaditem) {
			JOptionPane.showMessageDialog(null, "Loaded!");
		} else if (e.getSource() == openitem) {
			JOptionPane.showMessageDialog(null, "Opened!");
		} else if (e.getSource() == exititem) {
			System.exit(0);
		}

	}

}
