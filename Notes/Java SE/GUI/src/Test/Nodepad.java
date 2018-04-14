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
 * �򵥵ļ��±�  �߱��򿪱����޸��ļ�����
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
	
	//���췽��
	public Nodepad(){
		init();
	}
	
	//��ʼ������
	public void init(){
		//������
		frame = new JFrame("�ҵļ��±�");
		frame.setSize(1000,700);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//������ �˵���
		mbar = new JMenuBar();
		menu = new JMenu("�ļ�");
		openItem = new JMenuItem("��");
		saveItem = new JMenuItem("����");
		otherSaveItem = new JMenuItem("���Ϊ");
		texts = new JTextArea();
		text = new JTextField();
		text.setVisible(false);
		openDia = new FileDialog(frame,"��",FileDialog.LOAD);
		saveDia = new FileDialog(frame,"����",FileDialog.SAVE);
		otherSaveDia = new FileDialog(frame,"���Ϊ",FileDialog.SAVE);
		
		
		//����¼�
		
		//���¼�
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
						throw new RuntimeException("�Ҳ����ļ�");
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
		
		//�����¼�
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
		
		//���Ϊ�¼�
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
		//�������
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
