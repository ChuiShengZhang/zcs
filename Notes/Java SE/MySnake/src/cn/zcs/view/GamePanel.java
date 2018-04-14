package cn.zcs.view;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

import cn.zcs.model.Food;
import cn.zcs.model.Ground;
import cn.zcs.model.Snake;

public class GamePanel extends JPanel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Snake snake;
	private Food food;
	private Ground ground;
	public void display(Snake snake ,Food food ,Ground ground){
		System.out.println("显示游戏面板");
		this.snake = snake;
		this.food = food;
		this.ground = ground;
		this.repaint();
	}

	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		//重新显示
		g.setColor(Color.BLUE);
		snake.drowMe(g);
		food.drowMe(g);
		ground.drowMe(g);
	}
	
	
}
