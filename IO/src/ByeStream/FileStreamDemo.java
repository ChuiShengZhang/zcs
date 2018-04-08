package ByeStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 字节流: 写:OutputStream
 * 			|--FileOutputStream
 * 		    读:InputStream
 * 			|--FileInputStream
 *方便代码阅读,抛出异常,实际要处理
 * */
public class FileStreamDemo {//单个字节写入
	public static void writeByte() throws IOException{
		//创建一个写字节流
		FileOutputStream fos=new FileOutputStream("FileStreamDemo.txt");
		fos.write("FileStreamDemo".getBytes());//getBytes()方法将字符串转换成字节
		//字节流直接操作字节，无需刷新，但一定要关闭
		fos.close();
	}
	public static void readByte() throws IOException{//单个字节读取
		FileInputStream fis=new FileInputStream("FileStreamDemo.txt");
		int num=0;
		while((num=fis.read())!=-1){
			System.out.println((char)num);
		}
		fis.close();
	}
	public static void readBytes() throws IOException{//字节数组读入
		//第一种方法
		FileInputStream fis=new FileInputStream("FileStreamDemo.txt");
		byte[] bytes=new byte[1024];
		while((fis.read(bytes))!=-1){
			System.out.println("第一种"+new String(bytes));
		}
		fis.close();
		
		//第二种
		FileInputStream fis2=new FileInputStream("FileStreamDemo.txt");
		//创建一个大小刚刚好的数组，可以不用循环，但是只能操作小的文件，文件太大会内存溢出
		byte[] bytes2=new byte[fis2.available()];//available()方法获取文件的字节数
		fis2.read(bytes2);
		System.out.println("第二种"+new String(bytes2));
		fis2.close();
	}
	public static void main(String[] args) throws IOException{
		writeByte();
		readByte();
		readBytes();
	}

}
