package StringStream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 缓冲区的出现是为了提高效率的
 * 
 * */
public class BufferedWriterDemo {
	public static void main(String[] args) throws IOException{//方便代码阅读，抛出异常，实际不可，必须处理
		//创建写入流对象
		FileWriter fw=new FileWriter("BufferedWriterDemo.txt");
		//为写入流加入缓冲区，提高效率，缓冲区一被创建就要与流相关联
		BufferedWriter bufw=new BufferedWriter(fw);
		
		bufw.write("BufferedWriterDemo");
		bufw.newLine();//缓冲区特有的方法 换行(跨平台)
		bufw.flush();
		
		//关闭缓冲区其实就是关闭流对象fw，所以不用再关闭fw了
		bufw.close();
		
	}

}
