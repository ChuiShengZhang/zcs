package DataStream;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

/*
 * 操作基本数据类型的流对象
 * 		DateInputStream  DataOutputStream
 * 操作字节数组
 * 		ByteArrayInputStream   ByteArrayOutputStream
 * 操作字符数组
 * 		CharArrayReader   CharArrayWriter
 * 操作字符串
 * 		StringReader  StringWriter
 * 
 */

//字节数组是用于操作内存
public class ByteArrayStream {
	public static void main(String[] args) {
		// 数据源
		ByteArrayInputStream bais = new ByteArrayInputStream("java".getBytes());

		// 数据目的(在内存上的一个数组)
		ByteArrayOutputStream baos = new ByteArrayOutputStream();

		// 读取
		int len = 0;
		while ((len = bais.read()) != -1) {
			baos.write(len);
		}
		System.out.println(baos.toString());
	}
}
