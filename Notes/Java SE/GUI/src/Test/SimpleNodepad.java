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
    	setTitle("简单记事本");
    	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	this.setLocationRelativeTo(null);
    	
    	editor=new JTextArea("我在现代过的很好",10,30);
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
    	JMenu menu=new JMenu("文件");
    	menuBar.add(menu);
    	JMenuItem open=new JMenuItem("打开");
    	open.addActionListener(new ActionListener(){
    		public void actionPerformed(ActionEvent e){
    			loadFile();
    		}
    	});
    	JMenuItem save=new JMenuItem("保存");
    	save.addActionListener(new ActionListener(){
    		public void actionPerformed(ActionEvent e){
    			saveFile();
    		}
    	});
    	JMenuItem exit=new JMenuItem("退出");
    	menu.add(open);
    	menu.add(save);
    	menu.addSeparator();
    	menu.add(exit);
    	
    	pack();
    	setVisible(true);
    }
  
    public void loadFile(){  //打开文件方法
        JFileChooser fc=new JFileChooser();
        int r=fc.showOpenDialog(this);
        if(r==JFileChooser.APPROVE_OPTION){
            File file=fc.getSelectedFile();
            try{ editor.read(new FileReader(file),null);}
            catch(IOException e){}
        }
    }
          
    public void saveFile() { //保存文件的方法
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
