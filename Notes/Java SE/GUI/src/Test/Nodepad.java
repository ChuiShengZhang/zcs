package Test;

import java.awt.BorderLayout;
import java.awt.FileDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToolBar;

/*
 * 简单的记事本  具备打开保存修稿文件功能
 */
public class Nodepad {
	
	private JFrame frame;
	private JTextArea texts;
	private JTextField text;
	private JMenu menu;
	private JMenuBar mbar;
	private JMenuItem openItem , saveItem ,otherSaveItem;
	private FileDialog openDia,saveDia,otherSaveDia;
	private File file;
	
	
	public static void main(String[] args) {
		new Nodepad();
	}
	
	//构造方法
	public Nodepad(){
		init();
	}
	
	//初始化界面
	public void init(){
		//主窗口
		frame = new JFrame("我的记事本");
		frame.setSize(1000,700);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//工具栏 菜单条
		mbar = new JMenuBar();
		menu = new JMenu("文件");
		openItem = new JMenuItem("打开");
		saveItem = new JMenuItem("保存");
		otherSaveItem = new JMenuItem("另存为");
		texts = new JTextArea();
		text = new JTextField();
		text.setVisible(false);
		openDia = new FileDialog(frame,"打开",FileDialog.LOAD);
		saveDia = new FileDialog(frame,"保存",FileDialog.SAVE);
		otherSaveDia = new FileDialog(frame,"另存为",FileDialog.SAVE);
		
		
		//添加事件
		
		//打开事件
		openItem.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				openDia.setLocationRelativeTo(null);
				openDia.setVisible(true);
				texts.setText("");
				String dir = openDia.getDirectory();
				String fileName = openDia.getFile();
				System.out.println(dir+fileName);
				try {
					if(dir==null || fileName == null){
						throw new RuntimeException("找不到文件");
					}
					file = new File(dir,fileName);						
					BufferedReader bufr = new BufferedReader(new FileReader(file));
					String line = null;
					while((line=bufr.readLine())!=null){
						texts.append(line+"\r\n");
					}
					bufr.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});
		
		//保存事件
		saveItem.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if(file == null){
					saveDia.setVisible(true);
					String dir = saveDia.getDirectory();
					String fileName = saveDia.getFile();
					file = new File(dir,fileName);
				}
				try {
					BufferedWriter bufw = new BufferedWriter(new FileWriter(file));
					String data = texts.getText();
					bufw.write(data);
					
					bufw.close();
				} catch (IOException e1){
					e1.printStackTrace();
				}
			}
		});
		
		//另存为事件
		otherSaveItem.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				otherSaveDia.setVisible(true);
				String dir = otherSaveDia.getDirectory();
				String fileName = otherSaveDia.getFile();
				file = new File(dir,fileName);
				try {
					BufferedWriter bufw = new BufferedWriter(new FileWriter(file));
					String data = texts.getText();
					bufw.write(data);
					
					bufw.close();
				} catch (IOException e1){
					e1.printStackTrace();
				}
			}
		});
		//添加主健
		menu.add(openItem);
		menu.add(saveItem);
		menu.add(otherSaveItem);
		mbar.add(menu);
		
		
		frame.add(mbar, BorderLayout.NORTH);
		frame.add(texts,BorderLayout.CENTER);
		frame.add(text,BorderLayout.SOUTH);
		
		
		
		
		
		
		frame.setVisible(true);
	}
}
