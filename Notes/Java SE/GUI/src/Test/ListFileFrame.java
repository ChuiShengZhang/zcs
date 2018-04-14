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

		JFrame frame = new JFrame("�ļ�ѡ��");
		frame.setSize(1000, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);

		// �������
		JPanel northPanel = new JPanel();
		text = new JTextField(80);

		JButton but = new JButton("ת��");
		// ��ť�¼�
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
					JDialog dialog = new JDialog(frame,"������ʾ!",true);
					dialog.setBounds(700,380,500,200);
					JLabel lab = new JLabel("�Ҳ�����Ŀ¼���ļ�");
					JButton button = new JButton("ȷ��");
					
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

		// �ϲ����
		JPanel southPanel = new JPanel();
		texts = new JTextArea(28, 89);
		texts.setEditable(true);
		southPanel.add(texts);

		frame.add(northPanel, BorderLayout.NORTH);
		frame.add(southPanel, BorderLayout.SOUTH);

		frame.setVisible(true);
	}
}
