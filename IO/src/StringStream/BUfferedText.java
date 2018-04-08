package StringStream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * ��ϰ:ͨ������������һ��.java�ļ�
 * */
public class BUfferedText {
	public static void main(String[] args){
		BufferedWriter bufw=null;
		BufferedReader bufr=null;
		try{
			bufw=new BufferedWriter(new FileWriter("BufferedText.txt"));
			bufr=new BufferedReader(new FileReader("D:\\Java����\\IO\\src\\StringStream\\BufferedWriterDemo.java"));
			String s=null;
			while((s=bufr.readLine())!=null){
				bufw.write(s);
				bufw.newLine();
				bufw.flush();
			}
		}catch(IOException e){
			System.out.println(e.toString());
		}finally{
			try{
				if(bufw!=null){
					bufw.close();
				}
			}catch(IOException e){
				System.out.println(e.toString());
			}finally{
				try{
					if(bufr!=null){
						bufr.close();
					}
				}catch(IOException e){
					System.out.println(e.toString());
				}
			}
		}
	}
}
