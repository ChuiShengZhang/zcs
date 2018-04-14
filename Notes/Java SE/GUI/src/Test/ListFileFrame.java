package Test;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class ListFileFrame {
	static JTextField text = null;
	static JTextArea texts = null;

	public static void main(String[] args) {

		JFrame frame = new JFrame("文件选择");
		frame.setSize(1000, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);

		// 北部面板
		JPanel northPanel = new JPanel();
		text = new JTextField(80);

		JButton but = new JButton("转到");
		// 按钮事件
		but.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s = text.getText();
				File file = new File(s);
				if (file.exists() && file.isDirectory()) {
					File[] files = file.listFiles();
					for (File f : files) {
						texts.append(f.getName() + '\n');
					}
				}else{
					JDialog dialog = new JDialog(frame,"错误提示!",true);
					dialog.setBounds(700,380,500,200);
					JLabel lab = new JLabel("找不到该目录或文件");
					JButton button = new JButton("确定");
					
					button.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							dialog.setVisible(false);
						}
					});
					dialog.add(lab,BorderLayout.NORTH);
					dialog.add(button,BorderLayout.SOUTH);
					dialog.setVisible(true);
				}
			}
		});

		northPanel.add(text);
		northPanel.add(but);

		// 南部面板
		JPanel southPanel = new JPanel();
		texts = new JTextArea(28, 89);
		texts.setEditable(true);
		southPanel.add(texts);

		frame.add(northPanel, BorderLayout.NORTH);
		frame.add(southPanel, BorderLayout.SOUTH);

		frame.setVisible(true);
	}
}
