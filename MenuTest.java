import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextArea;

class MyMenu extends JFrame{
	CardLayout card=new CardLayout();
	JPanel jpTool=new JPanel(card);
	MyMenu(){
		setTitle("�ɳ��ʼ�");
		setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar=new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu fyMenu=new JMenu("��ҳ");
		JMenuItem firstItem=new JMenuItem("��һҳ");
		JMenuItem preItem=new JMenuItem(/*new ImageIcon("Button/previous.png",*/"��һҳ");
		preItem.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				card.previous(jpTool);
			}
		});
		JMenuItem nextItem=new JMenuItem(/*new ImageIcon("Button/next.jpg",*/"��һҳ");
		nextItem.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				card.next(jpTool);
			}
		});
		JMenuItem lastItem=new JMenuItem("���һҳ");
		fyMenu.add(firstItem);
		fyMenu.add(preItem);
		fyMenu.addSeparator();
		fyMenu.add(nextItem);
		fyMenu.add(lastItem);
		fyMenu.addSeparator();
		menuBar.add(fyMenu);
		
		JMenu colorMenu=new JMenu("��ɫ");
		menuBar.add(colorMenu);
		
		JTextArea texts1=new JTextArea("��һҳ�ʼ�",10,30);
		texts1.setEditable(true);
		texts1.setLineWrap(true);
		jpTool.add(texts1,"first");
		
		JTextArea texts2=new JTextArea("�ڶ�ҳ�ʼ�",10,30);
		texts2.setEditable(true);
		texts2.setLineWrap(true);
		jpTool.add(texts2,"second");
		
		add(jpTool,BorderLayout.CENTER);
		pack();
		setVisible(true);
	}
}
public class MenuTest {
	public static void main(String[] args){
		MyMenu mm=new MyMenu();
	}
}
