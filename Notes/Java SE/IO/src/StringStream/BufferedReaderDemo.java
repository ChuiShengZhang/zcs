package StringStream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
 * 
 *�ַ���ȡ��������
 */
public class BufferedReaderDemo {
	public static void main(String[] args) throws IOException{//��������Ķ����׳��쳣��ʵ�ʲ��ɣ����봦��
		//������ȡ������
		FileReader fr=new FileReader("BufferedWriterDemo.txt");
		//������ȡ����������һ��������Ҫ���������
		BufferedReader bufr=new BufferedReader(fr);
		
		//��ȡ���������еķ��� ��ȡһ��readLine() �����ַ�������ν�β����null
		String s=null;
		while((s=bufr.readLine())!=null){
			System.out.println("s:"+s);
		}
		
		bufr.close();
	}

}
