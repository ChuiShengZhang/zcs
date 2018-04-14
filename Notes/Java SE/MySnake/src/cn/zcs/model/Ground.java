package cn.zcs.model;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.Random;

import cn.zcs.util.Global;

public class Ground {
	int[][] grounds = new int[Global.WIDTH][Global.HEIGHT];
	public Ground(){//用二维数组来表示障碍物 0表示无障碍 1表示有障碍物
		for(int i = 0; i< Global.WIDTH ; i++){
			grounds[i][0] = 1;
			grounds[i][Global.HEIGHT-1] = 1;
		}
		for(int i = 0; i<Global.HEIGHT ; i++){
			grounds[0][i] = 1;
			grounds[Global.WIDTH-1][i] = 1;
		}
	}
	public boolean isEatBySnake(Snake snake){
		System.out.println("障碍是否被蛇吃到");
		for(int i = 0;i<Global.WIDTH ; i++){
			for(int j = 0;j< Global.HEIGHT ; j++){
				if(grounds[i][j] == 1 && snake.getHead().x == i && snake.getHead().y == j){
					return true;
				}
			}
		}
		return false;
	}
	
	public Point addFood(){
		int x = 0, y = 0;
		Random r = new Random();
		do{
			x = r.nextInt(Global.WIDTH-1);
			y = r.nextInt(Global.HEIGHT-1);
		}while(grounds[x][y] == 1);
		return new Point(x,y);
	}
	public void drowMe(Graphics g){
		System.out.println("障碍物画出自己");
		g.setColor(Color.gray);
		for(int i = 0;i<Global.WIDTH ; i++){
			for(int j = 0;j< Global.HEIGHT ; j++){
				if(grounds[i][j] == 1){
					g.fill3DRect(i*Global.CELL_SIZE, j*Global.CELL_SIZE, Global.CELL_SIZE, Global.CELL_SIZE, true);
				}
			}
		}
	}
}
