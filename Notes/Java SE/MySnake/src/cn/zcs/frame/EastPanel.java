package cn.zcs.frame;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import cn.zcs.model.Snake;
import cn.zcs.util.Global;

public class EastPanel extends JPanel{
	//北部
	private JPanel north;
	private JTextField speed;
	public JTextField level;
	
	//中部
	public JPanel center;
	public static JComboBox<Object> levels;
	public JComboBox<Object> map;
	public JComboBox<Object> snake;
	public JComboBox<Object> ground;
	public JComboBox<Object> background;
	public JComboBox<Object> food;
	
	//南部
	private JPanel south;
	private JButton start;
	public JButton p;
	public JButton restart;
	public JButton c;
	
	public EastPanel(){
		init();
	}
	private void init(){
		this.setLayout(new BorderLayout());
		
		//北部
		north = new JPanel();
		north.setBorder(new TitledBorder("消息区域"));
		north.setLayout(new GridLayout(2,1));
		speed = new JTextField(8);
		level = new JTextField(8);
		speed.setEditable(false);
		level.setEditable(false);
		speed.setText(Snake.speed+"毫秒/格");
		north.add(new JLabel("游戏难度:"));
		north.add(level);
		north.add(new JLabel("速度:"));
		north.add(speed);
		
		//中部
		center = new JPanel();
		center.setSize(Global.CELL_SIZE*10, Global.CELL_SIZE*20);
		center.setBorder(new TitledBorder("选择区域"));
		center.setLayout(new GridLayout(6,1));
		levels = new JComboBox<Object>();
		levels.addItem("简单");
		levels.addItem("一般");
		levels.addItem("困难");
		levels.setBounds(1, 1, 10, 10);
		map = new JComboBox<Object>();
		map.addItem("地图一");
		map.addItem("地图二");
		snake = new JComboBox<Object>();
		snake.addItem("红色");
		snake.addItem("蓝色");
		snake.addItem("绿色");
		snake.addItem("黄色");
		snake.addItem("黑色");
		food = new JComboBox<Object>();
		food.addItem("红色");
		food.addItem("蓝色");
		food.addItem("绿色");
		food.addItem("黄色");
		food.addItem("黑色");
		ground = new JComboBox<Object>();
		ground.addItem("红色");
		ground.addItem("蓝色");
		ground.addItem("绿色");
		ground.addItem("黄色");
		ground.addItem("黑色");
		background = new JComboBox<Object>();
		background.addItem("红色");
		background.addItem("蓝色");
		background.addItem("绿色");
		background.addItem("黄色");
		background.addItem("黑色");
		center.add(new JLabel("难度："));
		center.add(levels);
		center.add(new JLabel("地图："));
		center.add(map);
		center.add(new JLabel("蛇身颜色："));
		center.add(snake);
		center.add(new JLabel("食物颜色："));
		center.add(food);
		center.add(new JLabel("障碍物颜色："));
		center.add(ground);
		center.add(new JLabel("背景颜色："));
		center.add(background);
		
		//南部
		south = new JPanel();
		south.setLayout(new BorderLayout());
		south.setBorder(new TitledBorder("开始区域"));
		JPanel n = new JPanel();
		n.setLayout(new GridLayout(4,1));
		start = new JButton("开始游戏");
		p = new JButton("暂停");
		c = new JButton("继续");
		restart = new JButton("重新开始");
		
		n.add(start);
		n.add(restart);
		n.add(p);
		n.add(c);
		JPanel s = new JPanel();
		JTextArea texts = new JTextArea(8,18);
		texts.setText("说明:"+"\r\n\r\n"+"方向键控制方向，P键暂停/继续"+"\r\n\r\n"
		+"更多请联系作者QQ:1614187761"+"\r\n\r\n"+"鹏哥贪吃蛇v1.1");
		texts.setEditable(false);
		s.add(texts);
		south.add(n,"North");
		south.add(s,"South");
		
		
		
		this.add(north, "North");
		this.add(center,"Center");
		this.add(south,"South");
	}
}
