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
	//����
	private JPanel north;
	private JTextField speed;
	public JTextField level;
	
	//�в�
	public JPanel center;
	public static JComboBox<Object> levels;
	public JComboBox<Object> map;
	public JComboBox<Object> snake;
	public JComboBox<Object> ground;
	public JComboBox<Object> background;
	public JComboBox<Object> food;
	
	//�ϲ�
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
		
		//����
		north = new JPanel();
		north.setBorder(new TitledBorder("��Ϣ����"));
		north.setLayout(new GridLayout(2,1));
		speed = new JTextField(8);
		level = new JTextField(8);
		speed.setEditable(false);
		level.setEditable(false);
		speed.setText(Snake.speed+"����/��");
		north.add(new JLabel("��Ϸ�Ѷ�:"));
		north.add(level);
		north.add(new JLabel("�ٶ�:"));
		north.add(speed);
		
		//�в�
		center = new JPanel();
		center.setSize(Global.CELL_SIZE*10, Global.CELL_SIZE*20);
		center.setBorder(new TitledBorder("ѡ������"));
		center.setLayout(new GridLayout(6,1));
		levels = new JComboBox<Object>();
		levels.addItem("��");
		levels.addItem("һ��");
		levels.addItem("����");
		levels.setBounds(1, 1, 10, 10);
		map = new JComboBox<Object>();
		map.addItem("��ͼһ");
		map.addItem("��ͼ��");
		snake = new JComboBox<Object>();
		snake.addItem("��ɫ");
		snake.addItem("��ɫ");
		snake.addItem("��ɫ");
		snake.addItem("��ɫ");
		snake.addItem("��ɫ");
		food = new JComboBox<Object>();
		food.addItem("��ɫ");
		food.addItem("��ɫ");
		food.addItem("��ɫ");
		food.addItem("��ɫ");
		food.addItem("��ɫ");
		ground = new JComboBox<Object>();
		ground.addItem("��ɫ");
		ground.addItem("��ɫ");
		ground.addItem("��ɫ");
		ground.addItem("��ɫ");
		ground.addItem("��ɫ");
		background = new JComboBox<Object>();
		background.addItem("��ɫ");
		background.addItem("��ɫ");
		background.addItem("��ɫ");
		background.addItem("��ɫ");
		background.addItem("��ɫ");
		center.add(new JLabel("�Ѷȣ�"));
		center.add(levels);
		center.add(new JLabel("��ͼ��"));
		center.add(map);
		center.add(new JLabel("������ɫ��"));
		center.add(snake);
		center.add(new JLabel("ʳ����ɫ��"));
		center.add(food);
		center.add(new JLabel("�ϰ�����ɫ��"));
		center.add(ground);
		center.add(new JLabel("������ɫ��"));
		center.add(background);
		
		//�ϲ�
		south = new JPanel();
		south.setLayout(new BorderLayout());
		south.setBorder(new TitledBorder("��ʼ����"));
		JPanel n = new JPanel();
		n.setLayout(new GridLayout(4,1));
		start = new JButton("��ʼ��Ϸ");
		p = new JButton("��ͣ");
		c = new JButton("����");
		restart = new JButton("���¿�ʼ");
		
		n.add(start);
		n.add(restart);
		n.add(p);
		n.add(c);
		JPanel s = new JPanel();
		JTextArea texts = new JTextArea(8,18);
		texts.setText("˵��:"+"\r\n\r\n"+"��������Ʒ���P����ͣ/����"+"\r\n\r\n"
		+"��������ϵ����QQ:1614187761"+"\r\n\r\n"+"����̰����v1.1");
		texts.setEditable(false);
		s.add(texts);
		south.add(n,"North");
		south.add(s,"South");
		
		
		
		this.add(north, "North");
		this.add(center,"Center");
		this.add(south,"South");
	}
}
