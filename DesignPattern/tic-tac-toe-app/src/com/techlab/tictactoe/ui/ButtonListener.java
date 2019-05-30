package com.techlab.tictactoe.ui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import com.techlab.tictactoe.Board;
import com.techlab.tictactoe.Cell;
import com.techlab.tictactoe.Game;
import com.techlab.tictactoe.MarkType;
import com.techlab.tictactoe.Player;
import com.techlab.tictactoe.ResultAnalyzer;
import com.techlab.tictactoe.ResultType;



public class ButtonListener implements ActionListener{
	int counter=0;
	MainFrame frame ;
	Cell cell ;
	ResultType res;
	Board board ;
	ResultAnalyzer result ;
	Player player[] = new Player[2]; 
	MarkType mark=null;
	Game game ;
	int index;

	public ButtonListener(MainFrame frame ) {
		this.frame=frame;
		cell = new Cell();
		res=null;
		board = new Board() ;
		result = new ResultAnalyzer(board);
		player[0]=new Player("Shekhar",mark.X);
		player[1]= new Player("ABC",mark.O);
		game = new Game(player,board,result);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == frame.btn0) {
			
             game.play(0); 
             frame.btn0.setText(getMark().toString());
             frame.btn0.setEnabled (false);
             frame.label1.setText(getPlayerName());
             frame.label2.setText(getMark().toString());
             frame.label3.setText(progress().toString());
             buttonDisabler();
             
		}

		if (e.getSource() == frame.btn1) {
			game.play(1); 
			 frame.btn1.setText(getMark().toString());
			 frame.btn1.setEnabled (false);
			 frame.label1.setText(getPlayerName());
			 frame.label2.setText(getMark().toString());
			 frame.label3.setText(progress().toString());
			 buttonDisabler();

		}
		if (e.getSource() == frame.btn2) {
			game.play(2); 
			 frame.btn2.setText(getMark().toString());
			 frame.btn2.setEnabled (false);
			 frame.label1.setText(getPlayerName());
			 frame.label2.setText(getMark().toString());
			 frame.label3.setText(progress().toString());
			 buttonDisabler();

		}

		if (e.getSource() == frame.btn3) {
			game.play(3); 
			 frame.btn3.setText(getMark().toString());
			 frame.btn3.setEnabled (false);
			 frame.label1.setText(getPlayerName());
			 frame.label2.setText(getMark().toString());
			 frame.label3.setText(progress().toString());
			 buttonDisabler();

		}
		if (e.getSource() == frame.btn4) {
			game.play(4); 
			 frame.btn4.setText(getMark().toString());
			 frame.btn4.setEnabled (false);
			 frame.label1.setText(getPlayerName());
			 frame.label2.setText(getMark().toString());
			 frame.label3.setText(progress().toString());
			 buttonDisabler();

		}

		if (e.getSource() == frame.btn5) {
			game.play(5); 
			 frame.btn5.setText(getMark().toString());
			 frame.btn5.setEnabled (false);
			 frame.label1.setText(getPlayerName());
			 frame.label2.setText(getMark().toString());
			 frame.label3.setText(progress().toString());
			 buttonDisabler();

		}
		if (e.getSource() == frame.btn6) {
			game.play(6); 
			 frame.btn6.setText(getMark().toString());
			 frame.btn6.setEnabled (false);
			 frame.label1.setText(getPlayerName());
			 frame.label2.setText(getMark().toString());
			 frame.label3.setText(progress().toString());
			 buttonDisabler();

		}

		if (e.getSource() == frame.btn7) {
			game.play(7); 
			 frame.btn7.setText(getMark().toString());
			 frame.btn7.setEnabled (false);
			 frame.label1.setText(getPlayerName());
			 frame.label2.setText(getMark().toString());
			 frame.label3.setText(progress().toString());
			 buttonDisabler();

		}
		if (e.getSource() == frame.btn8) {
			game.play(8); 
			 frame.btn8.setText(getMark().toString());
			 frame.btn8.setEnabled (false);
			 frame.label1.setText(getPlayerName());
			 frame.label2.setText(getMark().toString());
			 frame.label3.setText(progress().toString());
			 buttonDisabler();
		}   
		
	}
	public void buttonDisabler() {
		if(progress()==ResultType.WIN) {
			frame.btn0.setEnabled (false);
			frame.btn1.setEnabled (false);
			frame.btn2.setEnabled (false);
			frame.btn3.setEnabled (false);
			frame.btn4.setEnabled (false);
			frame.btn5.setEnabled (false);
			
			frame.btn6.setEnabled (false);
			frame.btn7.setEnabled (false);
			frame.btn8.setEnabled (false);
			
			
		}
		
	}

	 public String getPlayerName() {
		 if(game.currentPlayer==0) {
	     		return player[1].getName();
	     	}
	     	return player[0].getName();
	       }
	 public MarkType getMark() {
		 if(game.currentPlayer==0) {
	     		return player[0].getMark();
	     	}
	     	return player[1].getMark();
	       }
	 public ResultType progress() {
		 if(game.currentPlayer==1) {
	     		return result.ifWin(player[0].getMark());
	     	}
	     	return result.ifWin(player[1].getMark());
	       }
	 
	 }
