package StringStream;

import java.io.FileReader;
import java.io.IOException;

/*
 * 文件读取
 * 
 * */
public class FileReaderDemo {
	//读取方式一  int read() //返回的是字符的整数 
	public static void reader1(){
		FileReader fr=null;
		try{
			//创建一个FileReader对象，和指定文件相关联
			//若文件不存在，则发生FileNotFoundException异常
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
	//读取方式二  int read(char[] cbuf) 返回的是字符个数
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
