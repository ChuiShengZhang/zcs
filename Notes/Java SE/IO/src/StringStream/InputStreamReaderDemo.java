package StringStream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/*
 * ����:������¼���ת���ɴ�д
 * �ûس���ӡ ����over����
 * */
public class InputStreamReaderDemo{
	public static void main(String[] args) throws IOException  {
		//��������¼���ֽ�������
		InputStream in=System.in;
		//���ֽ���ת�����ַ���
		InputStreamReader isr=new InputStreamReader(in);
		//Ϊ���Ч�ʣ����뻺����
		BufferedReader bufr=new BufferedReader(isr);
		String line=null;
		while((line=bufr.readLine())!=null){
			if(line.equals("over")){//����ֹͣ���
				break;
			}else{
				System.out.println(line.toUpperCase());
			}
		}
		
	}

}
