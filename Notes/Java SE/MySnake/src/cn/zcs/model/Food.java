package cn.zcs.model;

import java.awt.Graphics;
import java.awt.Point;
import cn.zcs.util.Global;

public class Food extends Point{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public boolean isEatBySnake(Snake snake){
		System.out.println("食物是否被蛇吃了");
		return snake.getHead().equals(this);
	}
	public void newFood(Point p){
		this.setLocation(p);
	}
	public void drowMe(Graphics g){
		System.out.println("食物画出自己");
		g.fill3DRect(this.x * Global.CELL_SIZE, this.y * Global.CELL_SIZE, Global.CELL_SIZE,Global.CELL_SIZE,true);
	}
}
