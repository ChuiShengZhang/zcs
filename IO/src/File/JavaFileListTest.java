package File;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 练习:将指定目录下的.java文件的绝对路径存储到一个文件中
 */
public class JavaFileListTest {
	
	public static void fileList(File dir,BufferedWriter bfw){
		File[] files = dir.listFiles();
		for(File file : files){
			if(file.isDirectory()){
				fileList(file,bfw);
			}else{
				if(file.getName().endsWith(".java")){
					try {
						bfw.write(file.getAbsolutePath());
						bfw.newLine();
						bfw.flush();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}
	public static void main(String[] args) {
		BufferedWriter bfw=null;
		File dir = new File("D:\\JAVA程序");
		
		try {
			 bfw = new BufferedWriter(new FileWriter("D:\\JAVA程序\\javaList.txt"));
			fileList(dir,bfw);
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				if(bfw!=null){
					bfw.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
