package File;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;

/*
 * 切割文件和合并文件
 * */
public class SplitAndMixFile {
	
	//切割文件方法
	public static void splitFile() throws IOException{
		FileInputStream fis = new FileInputStream("C:\\Users\\张垂盛\\Pictures\\僵小鱼图片\\我只看看\\WoZhiKanKan_04-1920.jpg");
		FileOutputStream fos =null;
		byte[] bytes=new byte[1024*512];//每一兆切割一次
		int len = 0;
		int count = 0;
		while((len=fis.read(bytes))!=-1){
			fos=new FileOutputStream("C:\\Users\\张垂盛\\Pictures\\僵小鱼图片\\我只看看\\"+(count++)+".part");
			fos.write(bytes,0,len);
			fos.close();
		}
		fis.close();
	}
	
	
	//合并文件
	public static void mixFile() throws IOException{
		FileOutputStream fos = new FileOutputStream("C:\\Users\\张垂盛\\Pictures\\僵小鱼图片\\我只看看\\mixFile.jpg");
		ArrayList<FileInputStream> al = new ArrayList<FileInputStream>();
		for(int i = 0 ;i<2 ;i++){
			al.add(new FileInputStream("C:\\Users\\张垂盛\\Pictures\\僵小鱼图片\\我只看看\\"+i+".part"));
		}
		Iterator<FileInputStream> it = al.iterator();
		Enumeration<FileInputStream> en = new Enumeration<FileInputStream>() {
			public boolean hasMoreElements() {
				return it.hasNext();
			}

			public FileInputStream nextElement() {
				return it.next();
			}};
		SequenceInputStream sis = new SequenceInputStream(en);
		
		int len = 0;
		while((len=sis.read())!=-1){
			fos.write(len);
			fos.flush();
		}
		sis.close();
		fos.close();
	}
	public static void main(String[] args) throws IOException {
//		splitFile();
		mixFile();
	}
}
