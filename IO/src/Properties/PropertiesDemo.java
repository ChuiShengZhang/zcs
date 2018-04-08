package Properties;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/*
 * Properties是一个Map集合，存储的是一些键值对
 */
public class PropertiesDemo {
	
	//获取，设置，修改
	public static void setAndGet(){
		//创建一个Properties集合
		Properties prop = new Properties();
		
		//设置
		prop.setProperty("zhangsan","30");
		prop.setProperty("lisi","40");
		prop.setProperty("wanngwu","28");
		
		//获取
		System.out.println("zhangsan------"+prop.getProperty("zhangsan"));
		
		//修改
		prop.setProperty("zhangsan","88");
		
		System.out.println(prop);
		
	}
	
	//加载已存在文件到Properties
	public static void loadDemo()throws IOException{
		
		Properties prop = new Properties();
		BufferedReader bfr = new BufferedReader(new FileReader("Properties.txt"));
		prop.load(bfr);
		System.out.println(prop);
		bfr.close();
		
		//原理
		/*
		Properties prop = new Properties();
		BufferedReader bfr = new BufferedReader(new FileReader("Properties.txt"));
		String line=null;
		while((line=bfr.readLine())!=null){
			String[] arr=line.split("=");
			prop.setProperty(arr[0],arr[1]);
		}
		bfr.close();
		System.out.println(prop);
		*/
	}
	
	//将配置文件保存
	public static void storeDemo() throws IOException{
		Properties prop = new Properties();
		BufferedWriter bufr = new BufferedWriter(new FileWriter("Properties.txt",true));
		prop.setProperty("wangwu","85");
		prop.store(bufr,"zcs");
		bufr.close();
	}
	public static void main(String[] args) throws IOException {
//		setAndGet();
//		loadDemo();
		storeDemo();
	}
}
