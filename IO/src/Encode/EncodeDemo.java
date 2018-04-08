package Encode;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;

/*
 * ����:�ַ�������>�ֽ�
 * 		str.getBytes();
 * 		str.getBytes("utf-8") ָ���ַ���
 * 
 * ���룺�ֽڡ���>�ַ���
 * 		new String(bytes[])
 * 		new String(bytes[],"utf-8") ָ���ַ���
 */
public class EncodeDemo {
	public static void main(String[] args) throws IOException {
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("gbk.txt"));
		
		//����
		String s = "���";
		byte[] bytes = s.getBytes("utf-8");
		
		System.out.println(Arrays.toString(bytes));
		
		//����
		String s1 = new String(bytes,"gbk");
		System.out.println(s1);
		
		osw.close();
	}
}
