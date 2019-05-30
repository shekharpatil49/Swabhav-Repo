package com.techlab.login;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.RootPaneContainer;

public class Login extends JFrame implements ActionListener {

	JLabel label1, label2, lable3;
	 JTextField textField;
	 JButton btn1;
	 JPasswordField p1;
	 public Login() {
	  JFrame frame = new JFrame("Login Form");
	  label1 = new JLabel("Login Form");
	  label1.setForeground(Color.blue);
	 
	 
	  label2 = new JLabel("Username");
	  lable3 = new JLabel("Password");
	  textField = new JTextField();
	  p1 = new JPasswordField();
	  btn1 = new JButton("Login");
	 
	  label1.setBounds(100, 30, 400, 30);
	  label2.setBounds(80, 70, 200, 30);
	  lable3.setBounds(80, 110, 200, 30);
	  textField.setBounds(300, 70, 200, 30);
	  p1.setBounds(300, 110, 200, 30);
	  btn1.setBounds(150, 160, 100, 30);
	  frame.add(label1);
	  frame.add(label2);
	  frame.add(textField);
	  frame.add(lable3);
	  frame.add(p1);
	  frame.add(btn1);
	  frame.setSize(400, 400);
	
	  frame.setVisible(true);
	  btn1.addActionListener(this);
	 }
	 public void actionPerformed(ActionEvent ae)
	 {
	   String uname = textField.getText();
	      Welcome wel = new Welcome();
	      wel.setVisible(true);
	      JLabel label = new JLabel("Welcome:"+uname);
	      wel.getContentPane().add(label);
	  }
	 }


