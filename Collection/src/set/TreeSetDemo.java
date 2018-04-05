package set;

import java.util.Iterator;
import java.util.TreeSet;

/*  				Collection
 * 						|--set
 * 							|--HashSet
 * 									
 * 							|--TreeSet ���ԶԼ����е�Ԫ�ؽ�������
 * 										Ҫ���Զ��������뼯��,���Զ���������߱��Ƚ���
 * 										(�ö���������ʵ��Comparable�ӿ�)
 * 
 * 
 * 
 * ��һ�ַ���:ʹԪ�ر���߱��Ƚ���
 * 
 * */
class Person1 implements Comparable<Person1>{//ʵ��Comparable�ӿ�ʹPerson���бȽ���
	private String name;
	private int age;
	Person1(String name,int age){
		this.name=name;
		this.age=age;
	}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	//ʵ�ֽӿ��еķ���(�Զ��尴����˳������,������ͬ�Ƚ�����)
	public int compareTo(Person1 p){
		if(this.age>p.age){
			return 1;
		}if(this.age==p.age){
			return this.name.compareTo(p.name);
		}
		return -1;
	}
	//��дtoString����
		public String toString(){
			return this.getName()+this.getAge();
		}
}
public class TreeSetDemo {
	public static void main(String[] args) {
		TreeSet<Person1> ts=new TreeSet<Person1>();
		
		ts.add(new Person1("zhangsan",18));
		ts.add(new Person1("lisi",19));
		ts.add(new Person1("wangwu",20));
		ts.add(new Person1("zhangsan",18));//��������һ�������ʧ��
		
		//ȡ��Ԫ��
		for(Iterator<Person1> it=ts.iterator();it.hasNext();){
			System.out.println(it.next());
		}
	}

}
