package StringStream;

import java.io.FileWriter;
import java.io.IOException;

/*
 * 字符流的两个基类:Writer和Reader
 * 
 * Writer
 * 
 * FileWriter  前缀名是功能名，后缀名是父类名
 * 
 * */
//创建文件并写入数据
public class FileWriterDemo {
	public static void main(String[] args) {
		FileWriter fw=null;
		try{
			//创建一个FileWriter对象，该对象一被初始化就要被明确操作的文件
			//如果该目录下没有指定文件，则会载该目录下创建一个，如果该目录下已有同名文件，则会覆盖原有的
			//其实该步就是明确数据存放的目的地
			//fw=new FileWriter("FileWritemDemo.tex");
			//创建一个FileWriter对象，传递一个参数true，代表不覆盖原有文件，即在末尾添加
			fw=new FileWriter("FileWriterDemo.txt",true);
			
			//调用write方法将数据写入流中
			fw.write("FileWriterDemo");
			fw.write("\r\njava");//在末尾添加并换行
			
			//调用flush方法刷新缓冲，将流中的数据刷新到目的地
			fw.flush();
			
		}catch(IOException e){
			System.out.println(e.toString());
		}finally{
			try{
				if(fw!=null){//判断fw不为null，避免空指针异常
					//close方法，关闭流资源，在关闭前会刷新一次
					fw.close();
					//flush和close方法的区别
					//flush 只刷新，不关闭流，还能继续使用流资源
					//close 先刷新一次，在关闭流，不能再继续使用流资源
				}
			}catch(IOException e){
				System.out.println(e.toString());
			}
		}
	}

}
