package StringStream;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/*
 * 练习:自己定义一个类，模拟LineNumberReader，该类也是一个装饰类
 * 
 * */

class MyLineNumberReader extends Reader{
	private Reader r;
	private int lineNumber=0;
	MyLineNumberReader(Reader r) throws IOException{
		this.r=r;
	}
	public void setLineNumber(int lineNumber){
		this.lineNumber=lineNumber;
	}
	public String myRead() throws IOException{
		lineNumber+=1;
		StringBuilder sb=new StringBuilder();
		int num=0;
		while((num=r.read())!=-1){
			if(num=='\r'){
				continue;
			}if(num=='\n'){
				return sb.toString();
			}else{
				sb.append((char)num);
			}
		}
		if(sb.length()!=0){
			return sb.toString();
		}
		return null;
	}
	public int getLineNumber() throws IOException{
		return lineNumber;
	}
	public void close() throws IOException {
		r.close();
	}
	public int read(char[] cbuf, int off, int len) throws IOException {
		return r.read(cbuf, off, len);
	}
	
}
public class LineNumberReaderDemo {

	public static void main(String[] args) throws IOException {
		FileReader fr=new FileReader("BufferedText.txt");
		MyLineNumberReader my=new MyLineNumberReader(fr);
		String s=null;
		while((s=my.myRead())!=null){
			System.out.println(my.getLineNumber()+":"+s);
		}
		my.close();
	}

}
