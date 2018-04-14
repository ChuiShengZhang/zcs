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
	private Point old;//β��
	public boolean life = true;//�ߵ�����
	public int oldDirction,newDirction = -2;
	
	public LinkedList<Point> body = new LinkedList<Point>();//����ṹ����ߵ�����
	
	private SnakeListener sl;//�ߵļ�����
	
	public Snake(){
		int x = Global.WIDTH / 2;//ÿ�������һ����Ϊ�������
		int y = Global.HEIGHT / 2;
		for(int i = 0 ; i<3 ; i++){//��ʼ���ߵ����� ��ʼ���߾�����������
			body.addFirst(new Point(x++,y));
		}
	}
	public void move(){
		System.out.println("�� �ƶ�");
		if(!life){
			
		}
		//ȥβ
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
		//��ͷ
		body.addFirst(newHead);	
	}
	public Point getHead(){
		return body.getFirst();
	}
	public void eatFood(){
		System.out.println("�� �Զ���");
		body.addLast(old);
	}
	public void setLife(boolean life){
		this.life = life;
	}
	public boolean isEatSelf(){
		System.out.println("��  �Ƿ�Ե����Լ�");
		for(Point p : body){
			if(p!= getHead() && p.equals(getHead())){
				return true;
			}
		}
		return false;
		}
	public void drowMe(Graphics g){
		System.out.println("�� �����Լ�");
		g.setColor(Color.blue);
		for(Point p : body){
			g.fill3DRect(p.x * Global.CELL_SIZE, p.y * Global.CELL_SIZE, 
					Global.CELL_SIZE, Global.CELL_SIZE, true);
		}
	}
	public void changeDirction(int dirction){
		System.out.println("�߸ı䷽��");
		newDirction = dirction;
	}
	
	//�߲�ͣ����
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
		System.out.println("���߳̿���");
		new SnakeThread().start();
	} 
	public void addSnakeListener(SnakeListener sl){
		if(sl != null){
			this.sl = sl;
		}
	}
}
