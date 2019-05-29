package com.techlab.button;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class CommonObserver implements ActionListener {
	
	Window win ;

	public CommonObserver(Window window) {
		this.win=window;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == win.getRed()) {

			win.getContentPane().setBackground(Color.RED);
			

		}

		if (e.getSource() == win.getBlue()) {

			win.getContentPane().setBackground(Color.BLUE);

		}

	}
}