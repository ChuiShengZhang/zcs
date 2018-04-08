package SequenceInputStream;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

/*
 * �ϲ���: SequenceInputStream
 * 	
 * ���󣺽�������ͬ���ļ�д��һ���ļ�
 */
public class SequenceInputStreamDemo {
	public static void main(String[] args) throws IOException {
		
		Vector<FileInputStream> v = new Vector<FileInputStream>();
		v.add(new FileInputStream("1.txt"));
		v.add(new FileInputStream("2.txt"));
		v.add(new FileInputStream("3.txt"));
		
		//��ȡö��
		Enumeration<FileInputStream> en = v.elements();
		
		SequenceInputStream sis = new SequenceInputStream(en);
		BufferedWriter bufw = new BufferedWriter(new FileWriter("4.txt"));
		
		int len=-1;
		while((len=sis.read())!=-1){
			bufw.write(len);
//			bufw.newLine();
			bufw.flush();
		}
		bufw.close();
		sis.close();
	}
}
