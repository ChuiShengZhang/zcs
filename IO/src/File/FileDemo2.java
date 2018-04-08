package File;

import java.io.File;
import java.io.FilenameFilter;

public class FileDemo2 {
	public static void list(){
		File f=new File("f:\\");
		
		//list()�������ص����ַ������飬���ļ�Ŀ¼�µ��ļ�
		//listFiles() �������ص���File��������飬ͨ��������Ի�ȡ�ܶ����ԣ����Կ�������listFiles()
		File[] names=f.listFiles();//ʹ��list�����Ķ�������װ����Ŀ¼�����Ҵ��ڣ����򷵻ؿ�
		for(File file : names){
			System.out.println(file.getName()+"::"+file.length());
		}
	}
	public static void listRoots(){
		File f=new File("");
		
		//listRoots������ȡ��Ŀ¼
		File[] files=f.listRoots();
		for(File file : files){
			System.out.println(file);
		}
	}
	public static void main(String[] args){
		list();
		listRoots();
		File dir=new File("F:\\");
		String[] names=dir.list(new FilenameFilter(){//�����ļ�����ֻ�����Լ�ָ�����ļ�
			public boolean accept(File dir,String name){
				return name.endsWith(".txt");
			}
		});
		for(String name : names){
			System.out.println(name);
		}
	}
}
