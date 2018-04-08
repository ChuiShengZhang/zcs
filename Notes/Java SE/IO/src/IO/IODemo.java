package IO;

/*		IO流
 * 			|--按流向分为输入流和输出流
 * 
 * 			|--按操作数据分为字节流和字符流
 * 				|=字节流的两个基类:InputStream	OutputStream
 * 				|=字符流的两个基类:Writer	Reader
 * 
 * 
 * 
 * 		流操作的基本规律
 * 			流的对象有很多，怎么确定使用哪个流对象呢？
 * 			三个明确
 * 			1.明确   源	InputStream  Reader
 * 				      目的  OutputStream  Writer
 * 			2.明确操作的是否为存文本文件
 * 				是  字符流  Reader Writer
 * 				否  字节流  InputStream OutputStream
 * 			3.明确了使用哪个体系之后，再明确使用哪个具体的对象
 * 				通过使用的设备来区分
 * 				源设备：内存(ArrayStream)，硬盘(Stream)，键盘(System.in)
 * 				目的设备：内存(ArrayStream)，硬盘(Stream)，控制台(System.out)
 * 
 * 
 * */
public class IODemo {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}

}
