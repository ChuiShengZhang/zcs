package File;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/*
 * ��ϰ:��ָ��Ŀ¼�µ�.java�ļ��ľ���·���洢��һ���ļ���
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
		File dir = new File("D:\\JAVA����");
		
		try {
			 bfw = new BufferedWriter(new FileWriter("D:\\JAVA����\\javaList.txt"));
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
