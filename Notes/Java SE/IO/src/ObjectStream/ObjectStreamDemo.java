package ObjectStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*
 * 对象的序列化
 * 		将对象存入文本文件>对象的持久化存储
 */
class Person implements Serializable{//要想对象序列化，该对象所属的类要实现Serializable接口
	static final long serialVersionUID = 42L;//为这个类定义一个uid，每次修改这个类都会产生一个新的.class
//	使得读取不出之前存入的对象，所以自定义一个uid，是每次改变之后多能把所有对象读取出来。
	String name;
	private int age;
	Person(String name,int age){
		this.name = name;
		this.age = age;
	}
}
public class ObjectStreamDemo {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		//创建一个直接操作对象的流
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("obj.txt"));
		
		//写入对象
		oos.writeObject(new Person("zhansan",18));
		oos.writeObject(new Person("lisi",19));
		
		oos.close();
		
		//创建一个读取
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("obj.txt"));
		
		//读取
		System.out.println(ois.readObject());
		
		ois.close();
		
	}
}
