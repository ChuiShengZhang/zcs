package File;

import java.io.File;
import java.io.IOException;

/*
 * File 将文件封装成对象
 * 常见的方法
 * 		1.创建     boolean createNewFile() 在指定目录下创建，若该目录下已有，则不创建，返回false。
 * 											与输入流不同，输入流没有则创建，有则覆盖。
 * 				boolean mkdir()  创建文件夹
 * 				boolean mkdirs()  创建多级文件夹
 * 		2.删除   boolean delete() 删除文件
 * 				void deleteOnExit() 在退出前删除文件
 * 		3.判断
 * 				boolean exists() 文件是否存在
 * 				boolean isFile() 是否是文件
 * 				boolean isDirectory() 是否是目录
 * 				boolean isHidden  是否是隐藏
 * 				boolean isAbolute()  是否是抽象路劲
 * 		4.获取
 * 				getName()获取名字
 * 				getPath()  获取路径
 * 				getParent() 获取父目录
 * 				getAbsolutePath() 获取绝对路径
 * 				lastModified() 获取最后一次修改的时间
 * 				length() 文件大小
 * 				renameTo() 改名，
 * */
public class FileDemo {
	public static void demo(){
		//将FileDemo.txt封装成File对象
		File f=new File("FileDemo.txt");//将已存在的文件或者为存在的文件封装成File对象
		File f2=new File("F:\\");//封装目录
		File f3=new File("F:\\","FileDemo.txt");
		
	}
	public static void method_1() throws IOException{//方便代码阅读，抛出异常，实际要具体处理
		File f=new File("FileDemo.txt");
		
		//创建文件
		System.out.println("createNewFile:"+f.createNewFile());
		
		//删除文件
		System.out.println("delete:"+f.delete());//直接删除文件，可能前面语句会发生异常，所以可能执行不到
		f.deleteOnExit();//在程序退出前删除文件
		
		//创建文件夹
		File dir=new File("F:\\FileDemo");
		System.out.println("dir:"+dir.mkdir());
		
		File dir2=new File("F:\\FileDemo2\\aa\\bb\\cc");
		System.out.print("dirs:"+dir2.mkdirs());
	}
	public static void method_2(){
		File f=new File("File.txt");
		System.out.println("getPath:"+f.getPath());
		System.out.println("getParent:"+f.getParent());//当对象创建时有父目录则返回 File f=new File("f:\\file.txt");
		//		若对象创建时没有子目录，则返回null,File f=new File("file.txt");
		
		System.out.println("getAbsolutePath:"+f.getAbsolutePath());
		
	}
	public static void main(String[] args) throws IOException{
		method_1();//新建，删除
		method_2();//获取
		demo();
	}

}
