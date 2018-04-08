package DataStream;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

/*
 * ���������������͵�������
 * 		DateInputStream  DataOutputStream
 * �����ֽ�����
 * 		ByteArrayInputStream   ByteArrayOutputStream
 * �����ַ�����
 * 		CharArrayReader   CharArrayWriter
 * �����ַ���
 * 		StringReader  StringWriter
 * 
 */

//�ֽ����������ڲ����ڴ�
public class ByteArrayStream {
	public static void main(String[] args) {
		// ����Դ
		ByteArrayInputStream bais = new ByteArrayInputStream("java".getBytes());

		// ����Ŀ��(���ڴ��ϵ�һ������)
		ByteArrayOutputStream baos = new ByteArrayOutputStream();

		// ��ȡ
		int len = 0;
		while ((len = bais.read()) != -1) {
			baos.write(len);
		}
		System.out.println(baos.toString());
	}
}
