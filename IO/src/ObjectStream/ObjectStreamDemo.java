package ObjectStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*
 * ��������л�
 * 		����������ı��ļ�>����ĳ־û��洢
 */
class Person implements Serializable{//Ҫ��������л����ö�����������Ҫʵ��Serializable�ӿ�
	static final long serialVersionUID = 42L;//Ϊ����ඨ��һ��uid��ÿ���޸�����඼�����һ���µ�.class
//	ʹ�ö�ȡ����֮ǰ����Ķ��������Զ���һ��uid����ÿ�θı�֮����ܰ����ж����ȡ������
	String name;
	private int age;
	Person(String name,int age){
		this.name = name;
		this.age = age;
	}
}
public class ObjectStreamDemo {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		//����һ��ֱ�Ӳ����������
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("obj.txt"));
		
		//д�����
		oos.writeObject(new Person("zhansan",18));
		oos.writeObject(new Person("lisi",19));
		
		oos.close();
		
		//����һ����ȡ
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("obj.txt"));
		
		//��ȡ
		System.out.println(ois.readObject());
		
		ois.close();
		
	}
}
