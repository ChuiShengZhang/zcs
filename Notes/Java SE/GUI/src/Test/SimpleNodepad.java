package Test;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JToolBar;
public class SimpleNodepad extends JFrame
{
	JTextArea editor;
 
    public SimpleNodepad(){
    	setTitle("�򵥼��±�");
    	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	this.setLocationRelativeTo(null);
    	
    	editor=new JTextArea("�����ִ����ĺܺ�",10,30);
    	add(editor,BorderLayout.SOUTH);
    	
    	JToolBar jpt=new JToolBar();
    	JButton but_open=new JButton(new ImageIcon("image/open.gif"));
    	but_open.addActionListener(new ActionListener(){
    		public void actionPerformed(ActionEvent e){
    			loadFile();
    		}
    	});
    	JButton but_save=new JButton(new ImageIcon("image/save.png"));
    	but_save.addActionListener(new ActionListener(){
    		public void actionPerformed(ActionEvent e){
    			saveFile();
    		}
    	});
    	jpt.add(but_open);
    	jpt.add(but_save);
    	add(jpt,BorderLayout.NORTH);
    	
    	
    	JMenuBar menuBar=new JMenuBar();
    	setJMenuBar(menuBar);
    	JMenu menu=new JMenu("�ļ�");
    	menuBar.add(menu);
    	JMenuItem open=new JMenuItem("��");
    	open.addActionListener(new ActionListener(){
    		public void actionPerformed(ActionEvent e){
    			loadFile();
    		}
    	});
    	JMenuItem save=new JMenuItem("����");
    	save.addActionListener(new ActionListener(){
    		public void actionPerformed(ActionEvent e){
    			saveFile();
    		}
    	});
    	JMenuItem exit=new JMenuItem("�˳�");
    	menu.add(open);
    	menu.add(save);
    	menu.addSeparator();
    	menu.add(exit);
    	
    	pack();
    	setVisible(true);
    }
  
    public void loadFile(){  //���ļ�����
        JFileChooser fc=new JFileChooser();
        int r=fc.showOpenDialog(this);
        if(r==JFileChooser.APPROVE_OPTION){
            File file=fc.getSelectedFile();
            try{ editor.read(new FileReader(file),null);}
            catch(IOException e){}
        }
    }
          
    public void saveFile() { //�����ļ��ķ���
        JFileChooser fc=new JFileChooser();
        int r=fc.showSaveDialog(this);
        if(r==JFileChooser.APPROVE_OPTION){
            File file=fc.getSelectedFile();
            try{ editor.write(new FileWriter(file));}
            catch(IOException e){}
        }
    }        

    public static void main(String []args){
    	new SimpleNodepad();
    }
}
