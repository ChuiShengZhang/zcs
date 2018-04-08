package StringStream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/*
 * 需求:将键盘录入的转换成大写
 * 敲回车打印 输入over结束
 * */
public class InputStreamReaderDemo{
	public static void main(String[] args) throws IOException  {
		//创建键盘录入字节流对象
		InputStream in=System.in;
		//将字节流转换成字符流
		InputStreamReader isr=new InputStreamReader(in);
		//为提高效率，加入缓冲区
		BufferedReader bufr=new BufferedReader(isr);
		String line=null;
		while((line=bufr.readLine())!=null){
			if(line.equals("over")){//加入停止标记
				break;
			}else{
				System.out.println(line.toUpperCase());
			}
		}
		
	}

}
