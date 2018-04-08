package StringStream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
 * 
 *字符读取流缓冲区
 */
public class BufferedReaderDemo {
	public static void main(String[] args) throws IOException{//方便代码阅读，抛出异常，实际不可，必须处理
		//创建读取流对象
		FileReader fr=new FileReader("BufferedWriterDemo.txt");
		//创建读取流缓冲区，一被创建就要与流相关联
		BufferedReader bufr=new BufferedReader(fr);
		
		//读取缓冲区特有的方法 读取一行readLine() 返回字符串，如何结尾返回null
		String s=null;
		while((s=bufr.readLine())!=null){
			System.out.println("s:"+s);
		}
		
		bufr.close();
	}

}
