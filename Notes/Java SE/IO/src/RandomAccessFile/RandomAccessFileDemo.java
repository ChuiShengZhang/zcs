package RandomAccessFile;

import java.io.IOException;
import java.io.RandomAccessFile;

/*
 * RandomAccessFile ��������ļ����ɶ���д,���캯�������ļ���ģʽ(��rw���ɶ���д����r"ֻ��)
 * �������װ��һ��������ֽ����飬ͨ��getFilePointe��ȡָ�룬seek����ָ�룬�ﵽ�������
 * 		--�Ի�����������д��Ͷ�ȡ  
 */
public class RandomAccessFileDemo {
	//��ȡ����
	public static void write() throws IOException{
		//����RandomAccessFile����
		RandomAccessFile raf = new RandomAccessFile("raf.txt","rw");
		
		//д�����ݣ���ֱ��д�������������
		raf.write("����".getBytes());
		raf.writeInt(97);
		raf.write("����".getBytes());
		raf.writeInt(100);
		raf.write("����".getBytes());
		raf.writeInt(86);
		
		raf.close();
	}
	
	//д�뷽��
	public static void read() throws IOException{
		RandomAccessFile raf  = new RandomAccessFile("raf.txt", "r");
		
		//��ȡ����
		byte[] names = new byte[4];//���� �ĸ��ֽ�
		raf.read(names);
		String name = new String(names) ;
		System.out.println("name="+name);
		
		System.out.println(raf.readInt());
		
		raf.close();
	}
	
	public static void seekDemo() throws IOException{
		RandomAccessFile raf = new RandomAccessFile("raf.txt", "rw");
		
		//�����������������97�����ģ�100�����塣86
		//����ռ4���ֽڣ�����intҲռ4���ֽڣ�һ��ռ8���ֽ�
		raf.seek(8*2);//ָ����ת��8*2�ֽڵ�λ���ϣ�������
		
		byte[] names = new byte[4];
		raf.read(names);
		String name = new String(names);
		System.out.println("name:"+name);
		System.out.println("age:"+raf.readInt());
		
		raf.close();
	}
	public static void main(String[] args) throws IOException {
		write();
		read();
		seekDemo();
	}
}
