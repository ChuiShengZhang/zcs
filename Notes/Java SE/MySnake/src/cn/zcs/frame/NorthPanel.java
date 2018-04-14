package cn.zcs.frame;

import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class NorthPanel extends JPanel{
	public JTextField level;
	public JTextField speed;
	public NorthPanel(){
		init();
		}
	private void init(){
		this.setLayout(new GridLayout(1,1));
		this.setBorder(new TitledBorder("提示区域"));
		level = new JTextField(8);
		speed = new JTextField(8);
		this.add(new JLabel("难度："));
		this.add(level);
		this.add(new JLabel("速度："));
		this.add(speed);
	}
}
