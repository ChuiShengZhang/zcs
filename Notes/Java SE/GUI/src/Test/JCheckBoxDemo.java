package Test;

import java.awt.FlowLayout;

import javax.swing.JColorChooser;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JCheckBoxDemo {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 300);
		frame.setLocationRelativeTo(null);
		frame.setLayout(new FlowLayout());
//		JCheckBox c = new JCheckBox("�Ѷ�",true);
		
//		JCheckBoxMenuItem c = new JCheckBoxMenuItem();
		
		JLabel m = new JLabel("�Ѷ�:");
		JComboBox c = new JComboBox();
		c.addItem("��");
		c.addItem("����");
		frame.add(m);
		frame.add(c);
		
		JColorChooser j = new JColorChooser();
		frame.add(j);
		
		
		frame.setVisible(true);
	}
}
