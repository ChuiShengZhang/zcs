package Properties;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/*
 * Properties��һ��Map���ϣ��洢����һЩ��ֵ��
 */
public class PropertiesDemo {
	
	//��ȡ�����ã��޸�
	public static void setAndGet(){
		//����һ��Properties����
		Properties prop = new Properties();
		
		//����
		prop.setProperty("zhangsan","30");
		prop.setProperty("lisi","40");
		prop.setProperty("wanngwu","28");
		
		//��ȡ
		System.out.println("zhangsan------"+prop.getProperty("zhangsan"));
		
		//�޸�
		prop.setProperty("zhangsan","88");
		
		System.out.println(prop);
		
	}
	
	//�����Ѵ����ļ���Properties
	public static void loadDemo()throws IOException{
		
		Properties prop = new Properties();
		BufferedReader bfr = new BufferedReader(new FileReader("Properties.txt"));
		prop.load(bfr);
		System.out.println(prop);
		bfr.close();
		
		//ԭ��
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
	
	//�������ļ�����
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
