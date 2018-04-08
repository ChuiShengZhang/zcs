package RandomAccessFile;

import java.io.IOException;
import java.io.RandomAccessFile;

/*
 * RandomAccessFile 随机访问文件，可读可写,构造函数结束文件和模式(“rw”可读可写，“r"只读)
 * 对象里封装了一个超大的字节数组，通过getFilePointe获取指针，seek设置指针，达到随机访问
 * 		--对基本数据类型写入和读取  
 */
public class RandomAccessFileDemo {
	//读取方法
	public static void write() throws IOException{
		//创建RandomAccessFile对象
		RandomAccessFile raf = new RandomAccessFile("raf.txt","rw");
		
		//写入数据，可直接写入基本数据类型
		raf.write("张三".getBytes());
		raf.writeInt(97);
		raf.write("李四".getBytes());
		raf.writeInt(100);
		raf.write("王五".getBytes());
		raf.writeInt(86);
		
		raf.close();
	}
	
	//写入方法
	public static void read() throws IOException{
		RandomAccessFile raf  = new RandomAccessFile("raf.txt", "r");
		
		//读取姓名
		byte[] names = new byte[4];//张三 四个字节
		raf.read(names);
		String name = new String(names) ;
		System.out.println("name="+name);
		
		System.out.println(raf.readInt());
		
		raf.close();
	}
	
	public static void seekDemo() throws IOException{
		RandomAccessFile raf = new RandomAccessFile("raf.txt", "rw");
		
		//存入的数据是张三，97；李四，100；王五。86
		//名字占4个字节，年龄int也占4个字节，一共占8个字节
		raf.seek(8*2);//指针跳转到8*2字节的位置上，即王五
		
		byte[] names = new byte[4];
		raf.read(names);
		String name = new String(names);
		System.out.println("name:"+name);
		System.out.println("age:"+raf.readInt());
		
		raf.close();
	}
	public static void main(String[] args) throws IOException {
		write();
		read();
		seekDemo();
	}
}
