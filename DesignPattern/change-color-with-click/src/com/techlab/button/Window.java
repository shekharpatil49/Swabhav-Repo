package com.techlab.button;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Window extends JFrame{

	private JButton red, blue;
	private CommonObserver co ;
	
	public Window() {
		co = new CommonObserver(this);
        
		red = new JButton("red");
		red.addActionListener(co);
		add(red);

		blue = new JButton("blue");
		blue.addActionListener(co);
		add(blue);

		setLayout(new FlowLayout());
		setSize(700, 700);
		setTitle("Change Color with Click");

		setVisible(true);

	}

	
	public JButton getRed() {
		return red;
	}

	public JButton getBlue() {
		return blue;
	}

}
