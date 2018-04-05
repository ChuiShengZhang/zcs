import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.*;
import java.awt.*;

public class qy extends JFrame{
	private JButton b1,b2,b3,b4= null;
	private JTextField b5 = null;
	public qy(){
		//github
		//Container c  = this.getContentPane();
		setTitle("sssssssss");
		setSize(600,300);
		setLayout(new BorderLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		init();
		setVisible(true);
	}
	private void init(){
		b1 = new JButton("中");
		b2 = new JButton("东");
		b3 = new JButton("西");
		b4 = new JButton("南");
		b5 = new JTextField("1111111");
		add(b1,BorderLayout.CENTER);
		add(b2,BorderLayout.EAST);
		add(b3,BorderLayout.WEST);
		add(b4,BorderLayout.SOUTH);
		add(b5,BorderLayout.NORTH);

		b2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				b5.setText("222222222");
			}
		});
		b1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				JFrame frame = new JFrame("777");
				frame.setSize(500,500);
				frame.setLayout(new FlowLayout());
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
				
				JTextField jp = new JTextField("默认默认");
				frame.add(jp);
				JLabel jt = new JLabel();
				frame.add(jt);
				jp.addKeyListener(new KeyAdapter(){
					public void keyPressed(KeyEvent e){
						char c = e.getKeyChar();
						jt.setText(c+"");
					}
				});
						
			}
		});
		b3.addMouseListener(new MouseAdapter(){
			public void mousePressed(MouseEvent e){
				if(e.getClickCount()==2){
					b5.setText("MouseEvent double click");
				}else{
					b5.setText("MouseEvent one click");
				}
			}
		});

	}
	public static void main(String[] args){
		new qy();
	}
}