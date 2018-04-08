package File;

import java.io.File;

/*
 * 列举出目录下的所有文件，包括子目录的文件
 * 
 * 用到递归(自身调用自身)
 * 递归注意事项:
 * 1.限定条件
 * 2.注意递归调用的次数，尽量避免内存溢出
 */
public class ListAllDemo {

	public static void main(String[] args) {
		File dir = new File("F:\\资料");//将目录封装成File对象
		listFile(dir);
	}
	
	//列举所有文件的方法
	public static void listFile(File dir){
		File[] files=dir.listFiles();
		for(int i=0; i<files.length; i++){
			System.out.println(dir);
			//判断是否为目录，是则在调用自己，列举出子目录下的所有文件，不是则打印
			if(files[i].isDirectory()){
				listFile(files[i]);
			}else{
				System.out.println(files[i]);
			}
		}	
	}
}
