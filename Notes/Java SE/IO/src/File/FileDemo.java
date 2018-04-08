package File;

import java.io.File;
import java.io.IOException;

/*
 * File ���ļ���װ�ɶ���
 * �����ķ���
 * 		1.����     boolean createNewFile() ��ָ��Ŀ¼�´���������Ŀ¼�����У��򲻴���������false��
 * 											����������ͬ��������û���򴴽������򸲸ǡ�
 * 				boolean mkdir()  �����ļ���
 * 				boolean mkdirs()  �����༶�ļ���
 * 		2.ɾ��   boolean delete() ɾ���ļ�
 * 				void deleteOnExit() ���˳�ǰɾ���ļ�
 * 		3.�ж�
 * 				boolean exists() �ļ��Ƿ����
 * 				boolean isFile() �Ƿ����ļ�
 * 				boolean isDirectory() �Ƿ���Ŀ¼
 * 				boolean isHidden  �Ƿ�������
 * 				boolean isAbolute()  �Ƿ��ǳ���·��
 * 		4.��ȡ
 * 				getName()��ȡ����
 * 				getPath()  ��ȡ·��
 * 				getParent() ��ȡ��Ŀ¼
 * 				getAbsolutePath() ��ȡ����·��
 * 				lastModified() ��ȡ���һ���޸ĵ�ʱ��
 * 				length() �ļ���С
 * 				renameTo() ������
 * */
public class FileDemo {
	public static void demo(){
		//��FileDemo.txt��װ��File����
		File f=new File("FileDemo.txt");//���Ѵ��ڵ��ļ�����Ϊ���ڵ��ļ���װ��File����
		File f2=new File("F:\\");//��װĿ¼
		File f3=new File("F:\\","FileDemo.txt");
		
	}
	public static void method_1() throws IOException{//��������Ķ����׳��쳣��ʵ��Ҫ���崦��
		File f=new File("FileDemo.txt");
		
		//�����ļ�
		System.out.println("createNewFile:"+f.createNewFile());
		
		//ɾ���ļ�
		System.out.println("delete:"+f.delete());//ֱ��ɾ���ļ�������ǰ�����ᷢ���쳣�����Կ���ִ�в���
		f.deleteOnExit();//�ڳ����˳�ǰɾ���ļ�
		
		//�����ļ���
		File dir=new File("F:\\FileDemo");
		System.out.println("dir:"+dir.mkdir());
		
		File dir2=new File("F:\\FileDemo2\\aa\\bb\\cc");
		System.out.print("dirs:"+dir2.mkdirs());
	}
	public static void method_2(){
		File f=new File("File.txt");
		System.out.println("getPath:"+f.getPath());
		System.out.println("getParent:"+f.getParent());//�����󴴽�ʱ�и�Ŀ¼�򷵻� File f=new File("f:\\file.txt");
		//		�����󴴽�ʱû����Ŀ¼���򷵻�null,File f=new File("file.txt");
		
		System.out.println("getAbsolutePath:"+f.getAbsolutePath());
		
	}
	public static void main(String[] args) throws IOException{
		method_1();//�½���ɾ��
		method_2();//��ȡ
		demo();
	}

}
