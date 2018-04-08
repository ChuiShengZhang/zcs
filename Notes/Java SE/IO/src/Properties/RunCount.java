package Properties;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/*
 * ����:���ڼ�¼�������д���
 * 		������һ�����д���������ע����ʾ
 * ˼·:
 * 
 * */
public class RunCount {
	
	public static void main(String[] args) throws IOException {
		Properties prop = new Properties();
		File file = new File("RunCount.ini");
		int count=0;
		if(!(file.exists())){
			file.createNewFile();
		}
		FileReader fr = new FileReader(file);
		prop.load(fr);
		String value=prop.getProperty("time");
		FileWriter fw = new FileWriter(file);
		if(value!=null){
			
			count=Integer.parseInt(value);
			//prop.store(fw,"");
			if(count>=5){
				System.out.println("ע�ᣡ��");
			}
		}
		count++;
		prop.setProperty("time",count+"");
		prop.store(fw,"");
		
		fr.close();
		fw.close();
	}
}
