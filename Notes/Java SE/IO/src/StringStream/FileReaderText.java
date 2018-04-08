package StringStream;

import java.io.FileReader;
import java.io.IOException;

/*
 * ��ϰ����ȡһ��.java�ļ�������ӡ�ڿ���̨��
 * */
public class FileReaderText {
	public static void main(String[] args) {
		FileReader fr=null;
		try{
			fr=new FileReader("D:\\JavaProgram\\Eclipse\\IO\\src\\StringStream\\FileReaderDemo.java");
			char[] buf=new char[1024];
			int num=0;
			while((num=fr.read(buf))!=-1){
				System.out.print(new String(buf,0,num));
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
			}
		}
	}

}
