package Properties;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/*
 * 需求:用于记录程序运行次数
 * 		当到达一定运行次数，给出注册提示
 * 思路:
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
				System.out.println("注册！！");
			}
		}
		count++;
		prop.setProperty("time",count+"");
		prop.store(fw,"");
		
		fr.close();
		fw.close();
	}
}
