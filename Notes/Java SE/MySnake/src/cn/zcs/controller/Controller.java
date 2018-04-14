package cn.zcs.controller;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JDialog;

import cn.zcs.listener.SnakeListener;
import cn.zcs.model.Food;
import cn.zcs.model.Ground;
import cn.zcs.model.Snake;
import cn.zcs.view.GamePanel;

public class Controller extends KeyAdapter implements SnakeListener{
	private Snake snake;
	private Food food;
	private Ground ground;
	private GamePanel gamePanel;
	
	public Controller(Snake snake, Food food, Ground ground, GamePanel gamePanel) {
		super();
		this.snake = snake;
		this.food = food;
		this.ground = ground;
		this.gamePanel = gamePanel;
	}
	
	@Override
	public void keyPressed(KeyEvent e){
		switch(e.getKeyCode()){
		case KeyEvent.VK_UP :
			snake.changeDirction(Snake.UP);
			break;
		case KeyEvent.VK_DOWN :
			snake.changeDirction(Snake.DOWN);
			break;
		case KeyEvent.VK_LEFT :
			snake.changeDirction(Snake.LEFT);
			break;
		case KeyEvent.VK_RIGHT :
			snake.changeDirction(Snake.RIGHT);
			break;
		}
	}
	
	//监听蛇是否移动了，蛇移动了，就让游戏面板重新显示
	@Override
	public void snakeMoved(Snake snake){
		gamePanel.display(snake, food, ground);
		if(food.isEatBySnake(snake)){
			snake.eatFood();
			food.newFood(ground.addFood());
		}
		if(ground.isEatBySnake(snake)){
			snake.setLife(false);
		}
		if(snake.isEatSelf()){
			snake.setLife(false);
		}
	}
	public void startGame(){
		snake.startThread();
		food.newFood(ground.addFood());
		if(food.isEatBySnake(snake)){
			food.newFood(ground.addFood());
		}
	}
}
