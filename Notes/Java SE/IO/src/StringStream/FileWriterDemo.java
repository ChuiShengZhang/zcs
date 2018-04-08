package StringStream;

import java.io.FileWriter;
import java.io.IOException;

/*
 * �ַ�������������:Writer��Reader
 * 
 * Writer
 * 
 * FileWriter  ǰ׺���ǹ���������׺���Ǹ�����
 * 
 * */
//�����ļ���д������
public class FileWriterDemo {
	public static void main(String[] args) {
		FileWriter fw=null;
		try{
			//����һ��FileWriter���󣬸ö���һ����ʼ����Ҫ����ȷ�������ļ�
			//�����Ŀ¼��û��ָ���ļ�������ظ�Ŀ¼�´���һ���������Ŀ¼������ͬ���ļ�����Ḳ��ԭ�е�
			//��ʵ�ò�������ȷ���ݴ�ŵ�Ŀ�ĵ�
			//fw=new FileWriter("FileWritemDemo.tex");
			//����һ��FileWriter���󣬴���һ������true����������ԭ���ļ�������ĩβ���
			fw=new FileWriter("FileWriterDemo.txt",true);
			
			//����write����������д������
			fw.write("FileWriterDemo");
			fw.write("\r\njava");//��ĩβ��Ӳ�����
			
			//����flush����ˢ�»��壬�����е�����ˢ�µ�Ŀ�ĵ�
			fw.flush();
			
		}catch(IOException e){
			System.out.println(e.toString());
		}finally{
			try{
				if(fw!=null){//�ж�fw��Ϊnull�������ָ���쳣
					//close�������ر�����Դ���ڹر�ǰ��ˢ��һ��
					fw.close();
					//flush��close����������
					//flush ֻˢ�£����ر��������ܼ���ʹ������Դ
					//close ��ˢ��һ�Σ��ڹر����������ټ���ʹ������Դ
				}
			}catch(IOException e){
				System.out.println(e.toString());
			}
		}
	}

}
