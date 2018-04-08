package File;

import java.io.File;
import java.io.FilenameFilter;

public class FileDemo2 {
	public static void list(){
		File f=new File("f:\\");
		
		//list()方法返回的是字符串数组，该文件目录下的文件
		//listFiles() 方法返回的是File对象的数组，通过对象可以获取很多属性，所以开发常用listFiles()
		File[] names=f.listFiles();//使用list方法的对象必须封装的是目录，并且存在，否则返回空
		for(File file : names){
			System.out.println(file.getName()+"::"+file.length());
		}
	}
	public static void listRoots(){
		File f=new File("");
		
		//listRoots方法获取根目录
		File[] files=f.listRoots();
		for(File file : files){
			System.out.println(file);
		}
	}
	public static void main(String[] args){
		list();
		listRoots();
		File dir=new File("F:\\");
		String[] names=dir.list(new FilenameFilter(){//过滤文件名，只保留自己指定的文件
			public boolean accept(File dir,String name){
				return name.endsWith(".txt");
			}
		});
		for(String name : names){
			System.out.println(name);
		}
	}
}
