package StringStream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 将D盘的一个文件复制到F盘去
 * 
 * */
public class CloneFileText {
	public static void main(String[] args) {
		FileWriter fw=null;
		FileReader fr=null;
		try{
			fw=new FileWriter("F:\\CloneFile.txt",true);
			fr=new FileReader("D:\\Java程序\\IO\\src\\StringStream\\FileReaderDemo.java");
			char[] buf=new char[1024];
			int len=0;
			while((len=fr.read(buf))!=-1){
				fw.write(buf,0,len);
			}
		}catch(IOException e){
			System.out.println(e.toString());
		}finally{
			try{
				if(fr!=null){
					fr.close();
				}	
			}catch(IOException e){
				System.out.println(e.toString());
			}finally{
				if(fw!=null){
					try{
						fw.close();
					}catch(IOException e){
						System.out.println(e.toString());
					}
				}
			}
		}
	}

}
