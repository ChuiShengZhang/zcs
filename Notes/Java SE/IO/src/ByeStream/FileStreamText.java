package ByeStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * ∏¥÷∆“ª’≈Õº∆¨
 * 
 * */
public class FileStreamText {
	public static void main(String[] args) {
		FileInputStream fis=null;
		FileOutputStream fos=null;
		try{
			fos=new FileOutputStream("FileStream_copy.jpg");
			fis=new FileInputStream("C:\\Users\\’≈¥π ¢\\Pictures\\Java\\±Í ∂∑˚.png");
			int num=0;
			while((num=fis.read())!=-1){
				fos.write((byte)num);
			}
		}catch(IOException e){
			throw new RuntimeException("∂¡–¥ ß∞‹");
		}finally{
			try{
				if(fis!=null){
					fis.close();
				}
			}catch(IOException e){
				throw new RuntimeException("πÿ±’ ß∞‹");
			}finally{
				try{
					if(fos!=null){
						fos.close();
					}
				}catch(IOException e){
					throw new RuntimeException("πÿ±’ ß∞‹");
				}
			}
		}
	}

}
