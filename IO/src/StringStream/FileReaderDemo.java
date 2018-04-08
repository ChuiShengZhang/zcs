package StringStream;

import java.io.FileReader;
import java.io.IOException;

/*
 * �ļ���ȡ
 * 
 * */
public class FileReaderDemo {
	//��ȡ��ʽһ  int read() //���ص����ַ������� 
	public static void reader1(){
		FileReader fr=null;
		try{
			//����һ��FileReader���󣬺�ָ���ļ������
			//���ļ������ڣ�����FileNotFoundException�쳣
			fr=new FileReader("FileWriterDemo.txt");
			int ch=0;
			while((ch=fr.read())!=-1){
				System.out.print((char)ch);
			}
		}catch(IOException e){
			e.toString();
		}finally{
			try{
				fr.close();
			}catch(IOException e){
				e.toString();
			}
		}
	}
	//��ȡ��ʽ��  int read(char[] cbuf) ���ص����ַ�����
	public static void reader2(){
		FileReader fr=null;
		try{
			fr=new FileReader("FileWriterDemo.txt");
			char[] buf=new char[1024];
			int num=0;
			while((num=fr.read(buf))!=-1){
				System.out.println(new String(buf,0,num));
			}
		}catch(IOException e){
			System.out.println(e.toString());
		}finally{
			try{
				fr.close();
			}catch(IOException e){
				System.out.println(e.toString());
			}
		}
	}
	public static void main(String[] args) {
		reader1();
		System.out.println("***********");
		reader2();
	}

}
