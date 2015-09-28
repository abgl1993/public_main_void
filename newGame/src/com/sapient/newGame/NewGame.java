package com.sapient.newGame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class NewGame extends JPanel {
	int x,y;
	x=10;
	y=10;
	public void moveBall(){
		x=x+1;
		y=y+1;
	}
	public void paint(Graphics g){
		Graphics2D g2d=(Graphics2D)g;
		g.setColor(Color.BLACK);
		//g.drawRect(250, 250, 30, 5);
		g.fillRect(10, 250, 60,10);
		g.setColor(Color.red);
		g.fillOval(x, y, 30, 30);
	}
	public static void main(String args[]){
		JFrame frame=new JFrame("Mini Tennis");
		NewGame game=new NewGame();
		frame.add(game);
		frame.setSize(300,300);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		while(true){
			game.moveBall();
			game.repaint();
		}
	}

}
