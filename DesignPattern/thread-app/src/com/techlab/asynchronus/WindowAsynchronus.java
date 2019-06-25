package com.techlab.asynchronus;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class WindowAsynchronus extends JFrame implements ActionListener{
	private JButton alertButton, printButton;
	private DateFormat dateFormat;;
	private Date date;
	
	
	

	public WindowAsynchronus() {

		alertButton = new JButton("Alert");
		alertButton.addActionListener(this);
		dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		date = new Date();
		
		add(alertButton);

		printButton = new JButton("print");
		printButton.addActionListener(this);
		add(printButton);
		
		setLayout(new FlowLayout());
		setSize(700, 700);
		setTitle("Asynchronus App");

		setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
        
		if (e.getSource() == this.printButton) {
			
			Runnable runnable = new Runnable() {
	            @Override
	            public void run() {
	            	while(true) {
	            		System.out.println(dateFormat.format(date));
	            		}
	            }
	        };
	        
			Thread thread = new Thread(runnable);
			thread.start();
			
		}
		
		if (e.getSource() == this.alertButton) {
			JOptionPane.showMessageDialog(this,"You Clicked Me!");  
		}

	}

}


