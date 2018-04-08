package set;

/*
 * ��Ԫ�ر����߱��Ƚ��Ի���Ԫ�ر���߱��ıȽϲ�����������Ҫ��ʱ
 * ����ͨ��ʵ��Comparator�ӿ�ʹ���ϱ�����бȽ���,������һ��ʼ���;��бȽ���
 * (�Զ�����ʵ��Comparator�ӿڻ����������ڲ���)
 * 
 * ��Ԫ�ر���߱��Ƚ��Ժͼ��Ͼ��бȽ���ʱ������ʹ�ñȽ���
 * 
 * 
 * 
 * �ڶ��ַ���:ʹ���ϱ���߱��Ƚ���
 * */
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

class MyComparator implements Comparator<Object>{//ʵ��Comparator�Ƚ���
	//ʵ�ֽӿ��е�compare����
	public int compare(Object o1,Object o2){
		Person2 p1=(Person2)o1;
		Person2 p2=(Person2)o2;
		int num= new Integer(p1.getAge()).compareTo(new Integer(p2.getAge()));
		if(num==0){
			return p1.getName().compareTo(p2.getName());
		}
		return num;
	}
}
class Person2{
	private String name;
	private int age;
	Person2(String name,int age){
		this.name=name;
		this.age=age;
	}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	//��дtoString����
		public String toString(){
			return this.getName()+this.getAge();
		}
}
public class TreeSetDemo2 {
	public static void main(String[] args){
		TreeSet<Person2> ts=new TreeSet<Person2>(new MyComparator());//ʹ���ϱ���߱��Ƚ���
		
		ts.add(new Person2("zhangsan",18));
		ts.add(new Person2("lisi",19));
		ts.add(new Person2("wangwu",20));
		ts.add(new Person2("zhangsan",18));//��������һ�������ʧ��
		
		//ȡ��Ԫ��
		for(Iterator<Person2> it=ts.iterator();it.hasNext();){
			System.out.println(it.next());
		}
	}
}
