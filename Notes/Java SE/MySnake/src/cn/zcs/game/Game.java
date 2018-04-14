package cn.zcs.game;

import java.awt.Color;

import javax.swing.JFrame;

import cn.zcs.controller.Controller;
//import cn.zcs.frame.EastPanel;
//import cn.zcs.frame.NorthPanel;
import cn.zcs.model.Food;
import cn.zcs.model.Ground;
import cn.zcs.model.Snake;
import cn.zcs.util.Global;
import cn.zcs.view.GamePanel;

public class Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//EastPanel east = new EastPanel();
		Snake snake = new Snake();
		Food food = new Food();
		Ground ground = new Ground();
		GamePanel gamePanel = new GamePanel();
		Controller controller = new Controller(snake,food,ground,gamePanel);
		
		gamePanel.setBackground(Color.BLACK);
		//Ìí¼ÓÊÂ¼þ¼àÌý
		snake.addSnakeListener(controller);
		gamePanel.addKeyListener(controller);
		
		gamePanel.display(snake, food, ground);
		
		JFrame frame = new JFrame("Åô¸çÌ°³ÔÉß");
		gamePanel.setSize(Global.WIDTH * Global.CELL_SIZE, Global.HEIGHT * Global.CELL_SIZE);
		frame.setSize(Global.WIDTH * Global.CELL_SIZE + 18/*236*/, Global.HEIGHT * Global.CELL_SIZE +47 /*47*/);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(gamePanel/*,"Center"*/);
		
		frame.addKeyListener(controller);
		
//		NorthPanel north = new NorthPanel();
		//frame.add(east, "East");
//		frame.add(north,"North");
		frame.setVisible(true);
		controller.startGame();
	}

}
