package Encode;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;

/*
 * 编码:字符串——>字节
 * 		str.getBytes();
 * 		str.getBytes("utf-8") 指定字符集
 * 
 * 解码：字节——>字符串
 * 		new String(bytes[])
 * 		new String(bytes[],"utf-8") 指定字符集
 */
public class EncodeDemo {
	public static void main(String[] args) throws IOException {
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("gbk.txt"));
		
		//编码
		String s = "你好";
		byte[] bytes = s.getBytes("utf-8");
		
		System.out.println(Arrays.toString(bytes));
		
		//解码
		String s1 = new String(bytes,"gbk");
		System.out.println(s1);
		
		osw.close();
	}
}
