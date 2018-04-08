package ByeStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * �ֽ���: д:OutputStream
 * 			|--FileOutputStream
 * 		    ��:InputStream
 * 			|--FileInputStream
 *��������Ķ�,�׳��쳣,ʵ��Ҫ����
 * */
public class FileStreamDemo {//�����ֽ�д��
	public static void writeByte() throws IOException{
		//����һ��д�ֽ���
		FileOutputStream fos=new FileOutputStream("FileStreamDemo.txt");
		fos.write("FileStreamDemo".getBytes());//getBytes()�������ַ���ת�����ֽ�
		//�ֽ���ֱ�Ӳ����ֽڣ�����ˢ�£���һ��Ҫ�ر�
		fos.close();
	}
	public static void readByte() throws IOException{//�����ֽڶ�ȡ
		FileInputStream fis=new FileInputStream("FileStreamDemo.txt");
		int num=0;
		while((num=fis.read())!=-1){
			System.out.println((char)num);
		}
		fis.close();
	}
	public static void readBytes() throws IOException{//�ֽ��������
		//��һ�ַ���
		FileInputStream fis=new FileInputStream("FileStreamDemo.txt");
		byte[] bytes=new byte[1024];
		while((fis.read(bytes))!=-1){
			System.out.println("��һ��"+new String(bytes));
		}
		fis.close();
		
		//�ڶ���
		FileInputStream fis2=new FileInputStream("FileStreamDemo.txt");
		//����һ����С�ոպõ����飬���Բ���ѭ��������ֻ�ܲ���С���ļ����ļ�̫����ڴ����
		byte[] bytes2=new byte[fis2.available()];//available()������ȡ�ļ����ֽ���
		fis2.read(bytes2);
		System.out.println("�ڶ���"+new String(bytes2));
		fis2.close();
	}
	public static void main(String[] args) throws IOException{
		writeByte();
		readByte();
		readBytes();
	}

}
