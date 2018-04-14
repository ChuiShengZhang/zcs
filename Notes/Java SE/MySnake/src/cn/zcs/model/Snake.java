package cn.zcs.model;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.LinkedList;

import cn.zcs.frame.EastPanel;
import cn.zcs.listener.SnakeListener;
import cn.zcs.util.Global;

public class Snake {
	public static final int UP = 1;
	public static final int DOWN = -1;
	public static final int LEFT = 2;
	public static final int RIGHT = -2;
	public static int speed;
	public static int level;
	private Point old;//尾巴
	public boolean life = true;//蛇的生命
	public int oldDirction,newDirction = -2;
	
	public LinkedList<Point> body = new LinkedList<Point>();//链表结构存放蛇的身体
	
	private SnakeListener sl;//蛇的监听器
	
	public Snake(){
		int x = Global.WIDTH / 2;//每个网格的一半作为点的坐标
		int y = Global.HEIGHT / 2;
		for(int i = 0 ; i<3 ; i++){//初始化蛇的身体 初始的蛇具有三个网格
			body.addFirst(new Point(x++,y));
		}
	}
	public void move(){
		System.out.println("蛇 移动");
		if(!life){
			
		}
		//去尾
		old = body.removeLast();
		
		if(!(oldDirction + newDirction == 0 )){
			oldDirction = newDirction;
		}
		int x = body.getFirst().x;
		int y = body.getFirst().y;
		switch(oldDirction){
		case 1 :
			y--;
			if(y<0){
				y = Global.HEIGHT;
			}
			break;
		case -1 :
			y++;
			if(y>Global.HEIGHT){
				y = 0;
			}
			break;
		case 2 :
			x--;
			if(x<0){
				x = Global.WIDTH;
			}
			break;
		case -2 :
			x++;
			if(x>Global.WIDTH){
				x = 0;
			}
			break;
		}
		Point newHead = new Point(x,y);
		//加头
		body.addFirst(newHead);	
	}
	public Point getHead(){
		return body.getFirst();
	}
	public void eatFood(){
		System.out.println("蛇 吃东西");
		body.addLast(old);
	}
	public void setLife(boolean life){
		this.life = life;
	}
	public boolean isEatSelf(){
		System.out.println("蛇  是否吃到了自己");
		for(Point p : body){
			if(p!= getHead() && p.equals(getHead())){
				return true;
			}
		}
		return false;
		}
	public void drowMe(Graphics g){
		System.out.println("蛇 画出自己");
		g.setColor(Color.blue);
		for(Point p : body){
			g.fill3DRect(p.x * Global.CELL_SIZE, p.y * Global.CELL_SIZE, 
					Global.CELL_SIZE, Global.CELL_SIZE, true);
		}
	}
	public void changeDirction(int dirction){
		System.out.println("蛇改变方向");
		newDirction = dirction;
	}
	
	//蛇不停的走
	private class SnakeThread extends Thread{
		public void run(){
			while(life){
				move();
				sl.snakeMoved(Snake.this);
				/*try {
					switch(level=EastPanel.levels.getItemCount()){
					case 1 :
						speed = 200;
						Thread.sleep(speed);
						break;
					case 2 :
						speed = 300;
						Thread.sleep(speed);
						break;
					case 3 :
						speed = 400;
						Thread.sleep(speed);
						break;
					}
					
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}*/
			}
		}
	}
	public void startThread(){
		System.out.println("蛇线程开启");
		new SnakeThread().start();
	} 
	public void addSnakeListener(SnakeListener sl){
		if(sl != null){
			this.sl = sl;
		}
	}
}
