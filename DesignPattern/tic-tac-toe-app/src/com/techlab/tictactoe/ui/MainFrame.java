package com.techlab.tictactoe.ui;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.TextField;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MainFrame extends JFrame {

	JButton btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8;
	JLabel label1, label2, label3;
	ButtonListener blisten;

	public MainFrame() {
		blisten = new ButtonListener(this);
		btn0 = new JButton();
		btn1 = new JButton();
		btn2 = new JButton();
		btn3 = new JButton();
		btn4 = new JButton();
		btn5 = new JButton();
		btn6 = new JButton();
		btn7 = new JButton();
		btn8 = new JButton();
		btn0.addActionListener(blisten);
		btn1.addActionListener(blisten);
		btn2.addActionListener(blisten);

		btn3.addActionListener(blisten);
		btn4.addActionListener(blisten);
		btn5.addActionListener(blisten);
		btn6.addActionListener(blisten);
		btn7.addActionListener(blisten);
		btn8.addActionListener(blisten);

		label1 = new JLabel("Player");
		label2 = new JLabel("Mark");
		label3 = new JLabel("Status");
		setSize(500, 600);
		setLayout(new GridLayout(4, 1));
		add(btn0);
		add(btn1);
		add(btn2);
		add(btn3);
		add(btn4);
		add(btn5);
		add(btn6);
		add(btn7);
		add(btn8);
		add(label1);
		add(label2);
		add(label3);
		setVisible(true);

	}

	public JButton getBtn0() {
		return btn0;
	}

	public JButton getBtn1() {
		return btn1;
	}

	public JButton getBtn2() {
		return btn2;
	}

	public JButton getBtn3() {
		return btn3;
	}

	public JButton getBtn4() {
		return btn4;
	}

	public JButton getBtn5() {
		return btn5;
	}

	public JButton getBtn6() {
		return btn6;
	}

	public JButton getBtn7() {
		return btn7;
	}

	public JButton getBtn8() {
		return btn8;
	}

	public JLabel getLabel1() {
		return label1;
	}

	public JLabel getLabel2() {
		return label2;
	}

	public JLabel getLabel3() {
		return label3;
	}

	public ButtonListener getBlisten() {
		return blisten;
	}

}
