package ByeStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * ����һ��ͼƬ
 * 
 * */
public class FileStreamText {
	public static void main(String[] args) {
		FileInputStream fis=null;
		FileOutputStream fos=null;
		try{
			fos=new FileOutputStream("FileStream_copy.jpg");
			fis=new FileInputStream("C:\\Users\\�Ŵ�ʢ\\Pictures\\Java\\��ʶ��.png");
			int num=0;
			while((num=fis.read())!=-1){
				fos.write((byte)num);
			}
		}catch(IOException e){
			throw new RuntimeException("��дʧ��");
		}finally{
			try{
				if(fis!=null){
					fis.close();
				}
			}catch(IOException e){
				throw new RuntimeException("�ر�ʧ��");
			}finally{
				try{
					if(fos!=null){
						fos.close();
					}
				}catch(IOException e){
					throw new RuntimeException("�ر�ʧ��");
				}
			}
		}
	}

}
